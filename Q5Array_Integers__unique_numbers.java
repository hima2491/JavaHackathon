package Assignment;
import java.util.Scanner;
import java.util.Map;
import java.util.*;
public class Q5Array_Integers__unique_numbers {
	public static void printUniqueAndDuplicates(int []arr) {
	HashMap <Integer,Integer> Hs = new HashMap<>();
	for(int num: arr ) {
		Hs.put(num, Hs.getOrDefault(num,0)+1);
	}
	System.out.println("Unique numbers:");
	for(int num:Hs.keySet()) {
		System.out.println(num);
	}
	System.out.println("Duplicate numbers and their occurances");
	for(Map.Entry<Integer,Integer>entry:Hs.entrySet()) {
		if(entry.getValue()==1) {
			System.out.println(entry.getKey());
		}else {
				System.out.println("Number " + entry.getKey() + "( occurs " + entry.getValue()+ " times.)");
			}
		}
	}
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the number of array elements");
		int count=s.nextInt();
		System.out.println("Great!"+count+"Integers");
		System.out.println("Enter the array elements");
		int [] arr=new int[count];
		for(int i=0;i<count;i++) {
			arr[i]=s.nextInt();	
     	}
		s.close();
		System.out.println("Array elements"+Arrays.toString(arr));
		printUniqueAndDuplicates(arr);
	}
}
