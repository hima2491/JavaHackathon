package Assignment;
import java.util.Scanner;
public class Q16Remove_Character_String {
	public static String removeCharacter(String str,char ch) {
		StringBuilder sb=new StringBuilder();//create s stringbuilder to manupulate efficiently;
	//Iterate  through each charcater in a String
		for(int i=0;i<str.length();i++) {
			//If the character is not equal to given character, append  it to stringBuilder
			if(str.charAt(i)!=ch) {
				  sb.append(str.charAt(i));
			}
		}
		//convert the string builder back to string and return
	      return sb.toString();
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Original String:");
		String str=s.nextLine();
		System.out.println("Enter the charcater you want to remove in string" );
		char ch=s.next().charAt(0);
		String result = removeCharacter(str , ch);
		System.out.println("String after removing character " + "\n" + result);
		s.close();
	}
}
