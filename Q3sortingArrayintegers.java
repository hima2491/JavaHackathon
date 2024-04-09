package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Q3sortingArrayintegers {
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
		
		for(int i=0;i<count;i++)
		{
			System.out.print(arr[i]+ ", " );
		}
		System.out.println();
		System.out.println("Array elements before sorting"+ Arrays.toString(arr));
		
		Sort(arr);
		for(int i=0;i<count;i++)
		{
			System.out.print(arr[i]+ ", " );
		}
		System.out.println();
		System.out.println("Array elements after sorting"+ Arrays.toString(arr));
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
}


