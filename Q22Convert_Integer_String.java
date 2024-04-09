package Assignment;

import java.util.Scanner;

public class Q22Convert_Integer_String {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the  Integer value:");
		int i=s.nextInt();
		String str=Integer.toString(i);
		System.out.println(i+100);// here + is binary operator;
		System.out.println(str+100);//here + is concatinating both strings;
		s.close();
		
	}

}
