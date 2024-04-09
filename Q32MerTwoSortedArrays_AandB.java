package Assignment;
import java.util.Arrays;
import java.util.Scanner;
public class Q32MerTwoSortedArrays_AandB {
			 static void MergeArrays(int[] a1,int size1, int [] a2, int size2) {
				 int j=0;
				 for (int i=size1;i<=(size1+size2-1);i++) {
					 a1[i]=a2[j];// add elements of array2 to array1
					 j++;
				 }
				 Arrays.sort(a1);
				 System.out.println("Sorted arrays:" +Arrays.toString(a1));
			 }
			
		public static void main(String[] args) {
			Scanner s =new Scanner(System.in);
			System.out.println("Enter the size of array1:");
			int size1=s.nextInt();
			System.out.println("Enter the size of array2:");
			int size2=s.nextInt();
			int [] array1= new int [size1+size2];//set array1 size to array1 size + array2 size
			int [] array2=new int [size2];
			System.out.println("Enter "+size1 + "Sorted Elements of array 1:");
			for(int i=0;i<size1;i++) {
				array1[i]=s.nextInt();	
		 	}
			System.out.println("Enter " +size2 + "Sorted Elements of array 2:");
					for(int j=0;j<size2;j++) {
						array2[j]=s.nextInt();	
				 	}
			s.close();
			MergeArrays(array1,size1,array2,size2);
			}
		}
	



	
