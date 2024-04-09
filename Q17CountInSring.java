package Assignment;
import java.util.Scanner;
public class Q17CountInSring {
	public static void CountInString(String str) {
int totalintegers=0;
int totalUppercase=0;
int totalLowercase=0;
//Iterate through each character in string
for(int i=0;i<str.length();i++) {
	char ch = str.charAt(i);
	//check if the character is digit
	if(Character.isDigit(ch)) {
		totalintegers++;
    }
	//check if the given character is an uppercase 
	else if(Character.isUpperCase(ch)) {
	       totalUppercase++;
	}
	//check if the given character is an lowercase
	else if(Character.isLowerCase(ch)) {
		totalLowercase++;
	}
}
//print the count
System.out.println("Enter the total no.of integers"+ totalintegers);
System.out.println("Enter the total no.of uppercase"+ totalUppercase);
System.out.println("Enter the total no.of lowercase"+ totalLowercase);
}
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the  String:");
		String str=s.nextLine();
		CountInString(str);
		
		s.close();
	}
}

