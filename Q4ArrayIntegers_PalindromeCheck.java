package Assignment;
import java.util.Arrays;
import java.util.Scanner;
public class Q4ArrayIntegers_PalindromeCheck {
public static boolean palindromecheck(int[] arr){
	int left=0;
	int right=arr.length-1;
	while(left<right) {
		if(arr[left]!=arr[right]) {
			System.out.println("Given Array  plaindrome is false");
			return false;	
		}
		
		left++;
		right--;
	}
	System.out.println("Given Array  plaindrome is true");
	return true;
}

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
	s2.close();
	System.out.println("Array elements"+ Arrays.toString(arr));
	palindromecheck(arr);
	
}
}
