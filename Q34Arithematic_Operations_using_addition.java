package Assignment;

import java.util.Scanner;

public class Q34Arithematic_Operations_using_addition {
	public static void main(String[] args) {
	Scanner read=new Scanner(System.in);
	System.out.println("Enter 2 numbers");
	int a=read.nextInt();
	int b=read.nextInt();
	substraction(a,b); 
	multiplication(a,b);
	try{
		 division(a,b);
	}
	catch(ArithmeticException e) {
		System.out.println(e + "occured");
	}
	read.close();
}
	static void  substraction (int a, int b) {
		int sub=0;
		sub= a+negate(b);
       /*if((a<0&&b<0)||((a<0 && b<0)&&(Math.abs(a)>Math.abs(b)))){
        * sub=negate(sub);//check if both a and  b are negative numbers then negate the result
        */
		System.out.println("Subtraction=" +sub);
	}
	static  int negate(int b) {
		int result =0;
		int temp = b<0? 1: -1;
		while(b!=0) {
			b +=temp;
			result +=temp;
		}
		return result;
	}
	static void multiplication (int a,int b) {
		int  mul=0;
		int b1=Math.abs(b);//converting absolute value to carry out multiplication value
		int a1=Math.abs(a);
		for (int i=0;i<b1;i++) {
			mul+=a1;
		}
		if ((a<0 && b>0)||(a>0 && b<0)) {
			mul=negate(mul);//if either onr of the value is negative then the result will be negative
		}
		System.out.println("Multiplication="+ mul);
	}
	static void division (int x,int y) {
		if (y==0) {
			throw new ArithmeticException("Divide by  zero");
		}
		int absx=Math.abs(x);
		int absy=Math.abs(y);
		int product =0;
		int result=0;
		while( product+absy<=absx) {
			product+= absy;
			result++;
		}
		if((x>0 &&y>0)||(x>0 && y<0)) {
			System.out.println("Division="+result);
		}else
			System.out.println("Division=" + negate(result));
	}
}
