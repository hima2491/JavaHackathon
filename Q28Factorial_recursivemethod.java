package Assignment;

import java.util.Scanner;

public class Q28Factorial_recursivemethod {
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}//recursive case is factorial of n is n*factorial(n-1);
		else {
			return n*factorial(n-1);
		}
	}
	public static void main(String[] args) {
		int a,fact;
		Scanner s1= new  Scanner(System.in);
		System.out.println("Enter the value of a:");
		a=s1.nextInt();
		fact=factorial(a);
		System.out.println(a+"! :" +fact);
		s1.close();
		
	}}


