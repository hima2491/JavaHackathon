package Assignment;

import java.util.Scanner;

public class Q2Factorial_NonRecursive {
	public static  int  factorial(int a) {
		 if(a<=0)
		 {
		System.out.println("Factorial is not defined fro negative numbers");
		 }
		 int result=1;
		 for(int i=1;i<=a;i++) {
			 result*=i;
		 }
	    return result;
	 }

	public static void main(String[] args) {
		int a,fact;
		Scanner s1= new  Scanner(System.in);
		System.out.println("Enter the value of a:");
		a=s1.nextInt();
		fact=factorial(a);
		System.out.println(a+"! :" +fact);
		s1.close();
		
	}

}
