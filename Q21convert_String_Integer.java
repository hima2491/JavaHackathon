package Assignment;

import java.util.Scanner;

public class Q21convert_String_Integer {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("given String:");
		String str=s.nextLine();
		//Converting String into integer using Integer.parseInt() 
		int i=Integer.parseInt(str);
		System.out.println("converted String:"+ i);
		s.close();
	}

}
