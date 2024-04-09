package Assignment;
import java.util.Arrays;
import java.util.Scanner;
public class Q29MergingSortUsingRecurssive {
	public static void mergeSort(int[] array) {
	if(array.length<=1) {
		return;
	}
	int mid=array.length/2;
	int[] left=new int[mid];
	int[] right =new int[array.length-mid];
	//split array into left and right subarrays
	for(int i=0;i<mid;i++) {
		left[i]=array[i];
	}
	for (int i=mid;i<array.length;i++) {
		right[i-mid]=array[i];
	}
	//Recursively sort left  and right subarrays
	mergeSort(left);
	mergeSort(right);
   //Merge sorted left and right subarrays
	merge(left,right,array);
}
public static void merge(int [] left,int []right,int []array) {
	int leftIndex=0;
	int rightIndex=0;
	int mergedIndex=0;
	//Merge left and right subarrays into arrays
	while(leftIndex<left.length&&rightIndex<right.length) {
		if(left[leftIndex]<=right[rightIndex]) {
			array[mergedIndex]=left[leftIndex];
			leftIndex++;
		}else {
			array[mergedIndex]=right[rightIndex];
			rightIndex++;
			}
		mergedIndex++;
	}
	//copy remaining elements of left subarray
	while(leftIndex<left.length) {
		array[mergedIndex]=left[leftIndex];
		leftIndex++;
		mergedIndex++;
	}
	//copy remaining elements of right subarray
	while(rightIndex<right.length) {
		array[mergedIndex]=right[rightIndex];
		rightIndex++;
		mergedIndex++;
	}
}
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("Enter the number of array elements");
	int count=s.nextInt();
	System.out.println("Great!"+count+"Integers");
	System.out.println("Enter the array elements");
	int [] arr=new int[count];
//	printArray(arr);
	for(int i=0;i<count;i++) {
		arr[i]=s.nextInt();	
 	}
	s.close();
	System.out.println("Array elements Before Sorting"+Arrays.toString(arr));
	mergeSort(arr);
	System.out.println("Array elements After Sorting"+Arrays.toString(arr));
	printArray(arr);
}
public static void printArray(int[] array) {
	for(int i=0;i<array.length;i++) {
		System.out.println(array[i]+" ");
	}
	System.out.println();
}
}