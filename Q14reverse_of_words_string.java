package Assignment;

import java.util.Scanner;

public class Q14reverse_of_words_string {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Original String:");
		String str1=s.nextLine();
		s.close();
		String Words[]=str1.split("\\s");
		String Reversedstring=" ";
		//Reverse each word's position
		for(int i=0;i<Words.length;i++) {
			if(i== Words.length-1) 
				Reversedstring=Words[i]+Reversedstring;
			else 
				Reversedstring=" " +Words[i]+ Reversedstring;
		}
			//Displaying the String after reverse
			System.out.println("Reversed String: "+ Reversedstring);
		
	}  

}
