package Assignment;
import java.util.Arrays;
import java.util.Scanner;
public class Q12palindromeCheck {
	public static void main(String[] args) {
	Scanner s2=new Scanner(System.in);
	System.out.print("Enter the String:");
	String str =s2.nextLine();
	if(isplaindromeString(str)) {
	System.out.println("The String '" + str + "'is a plaindrome.");	
	}else {
		System.out.println("The String ' "+ str + "' is not a palindrome.");
	}
	System.out.println("Enter the number");
	int num =s2.nextInt();
	if(isplaindromeNumber(num)) {
		System.out.println("The String '" + num + "'is a plaindrome.");	
		}else {
			System.out.println("The String ' "+ num + "' is not a palindrome.");
		}
	s2.close();
	}
	//Method to checkcif a String is a Palindrome
	public static boolean isplaindromeString(String str) {
		int left=0;
		int right=str.length()-1;
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right)) {
			return false;
		}
		left++;
		right++;
	}
	return true;
	}
//Method To check If number is palindrome or not
  	public static boolean isplaindromeNumber(int num) {
  		int OriginalNum =num;
  		int reversedNum =0;
  		while(num>0) {
  			int digit =num%10;
  			reversedNum=reversedNum*10+digit;
  			num/=10;
  		}
  		return OriginalNum==reversedNum;
  	}
  	}
