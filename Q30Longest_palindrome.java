package Assignment;
import java.util.Scanner;
public class Q30Longest_palindrome {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		 System.out.println("Enter the String: ");		
		 String input =s1.nextLine();
		 String longestpalindrome=findLongestPalindrome(input);
		 System.out.println("Longest Palindrome:" +longestpalindrome);
		 s1.close();
		}
		public static String findLongestPalindrome(String input) {
			if (input==null||input.length()==0) {
				return "";
		}
			int maxlength=0;
			String Longestpalindrome="";
			for(int i=0 ;i< input.length();i++) {
				for (int j=i+1;j<=input.length();j++) {
				String substr=input.substring(i,j);
				if(ispalindrome(substr)&&substr.length()>maxlength) {
					maxlength=substr.length();
					Longestpalindrome=substr;
				}
			}
	    }
		return Longestpalindrome;
}
public static boolean ispalindrome(String str) {
 int left =0;
 int right=str.length()-1;
 while(left<right) {
	 if (str.charAt(left++)!=str.charAt(right--)){
		 return false;
	 }
 }
 	return true;
}
}
