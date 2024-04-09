package Assignment;

import java.util.Scanner;

public class Q13reverese_Java_code {
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Original String:");
			String str1=s.nextLine();
			s.close();
			StringBuffer s2=new StringBuffer(str1);
	        s2.reverse();
	System.out.println("Reverse String is " + s2);
}

}
