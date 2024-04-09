package Assignment;
import java.util.Arrays;
import java.util.Scanner;
public class Q25Binary_search {
	public static void main(String[] args) {
		int count;
		Scanner s2=new Scanner(System.in);
		System.out.print("Enter the number of elements in array :" );
		count=s2.nextInt();
		System.out.println("Great!" + count + "intgers"  );
		int[] arr=new int[count];
		System.out.println("Enter the array elements:");
		for(int i=0;i<count;i++) {
			arr[i]=s2.nextInt();
		}	
		System.out.println("Array elements before sorting"+ Arrays.toString(arr));
		Arrays.sort(arr);
	    System.out.println("Array elements after sorting"+ Arrays.toString(arr));
		System.out.println("Enter the element to search");
		int key=s2.nextInt();
		int index=BinarySearch(arr,key);	
		if(index!=  -1) {
			System.out.println( "Element is found at Index :" + index);
		}else
			System.out.println(" Element is not found ");
		s2.close();
	  }
	    public static void Sort(int [] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for( int j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]) {
			      //swap arr[j] and arr[j]
					int temp = arr[j];
				   arr[j]=arr[j+1];
				   arr[j+1]=temp;
			}
		}
		}
	}
	public static int  BinarySearch(int arr[], int key){
		int low=0;
		int high=arr.length-1;
		while(low<=high){
			int mid=low+(high-low)/2;
			if(arr[mid]==key)
				return mid;
			else if(arr[mid]<key)
				low=mid+1;
			else
				high=mid-1;
        }
		return -1;//element not found;
	}
}
