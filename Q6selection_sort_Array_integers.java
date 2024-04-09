package Assignment;
import java.util.Arrays;
import java.util.Scanner;
public class Q6selection_sort_Array_integers {
	public static void selectionsort1(int[] arr) {
		int n=arr.length;
		// One by one move boundary of unsorted subarray 
		for(int i=0;i<n-1;i++)
		{
			 // Find the minimum element in unsorted array 
	         int minindex =i;
				for (int j=i+1; j<n;j++) { 
				if(arr[j]<arr[minindex]) {
				minindex=j;
		       }
	        }// Swap the found minimum element with the first 
	            // element 
				 int temp=arr[minindex];
				 arr[minindex]=arr[i];
				 arr[i]=temp;
		}
	}
	 // Prints the array 
	public static void printArray(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}	
	public static void main(String[] args) {
		Scanner s2=new Scanner(System.in);
		System.out.print("Enter the number of elements in array :" );
		 int count=s2.nextInt();
		System.out.println("Great!" + count + "intgers"  );
		int[] arr1=new int[count];
		System.out.println("Enter the array elements:");
		for(int i=0;i<count;i++) {
			arr1[i]=s2.nextInt();
		}
		System.out.println("Array elements before sorting"+Arrays.toString(arr1));
		printArray(arr1);
		selectionsort1(arr1);
		System.out.println("Array elements after sorting"+Arrays.toString(arr1));
		printArray(arr1);
		s2.close();
	}
}
