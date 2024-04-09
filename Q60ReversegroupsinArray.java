package Assignment;
import java.util.Arrays;
import java.util.Scanner;
public class Q60ReversegroupsinArray {
	public static void Reveresedgroups(int [] array,int k) {
	int n=array.length;
	for(int i=0;i<n; i+=k) {
		int left=i;
		int right=Math.min(i+k-1,n-1);
		while(left<right) {
			//swapelementsat left and right positions
			int temp=array[left];
			array[left]=array[right];
		    array[right]=temp;
			left++;
			right--;
		}
	}	
	}
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the number of array elements:");
		int count=s.nextInt();
		System.out.println("Great!"+count+"Integers");
		System.out.println("Enter the array elements:");
		int [] arr=new int[count];
		for(int i=0;i<count;i++) {
			arr[i]=s.nextInt();	
     	}
		System.out.println("Array elements"+Arrays.toString(arr));
		System.out.println("Enter the input element:");
		int k=s.nextInt();
		s.close();
		Reveresedgroups(arr,k);
	    System.out.println("Array elements"+Arrays.toString(arr));
	}
}
