package Assignment;
import java. util.Scanner;
public class Q1twobooleanvalues {
	public static void main(String[] args) {
		boolean a,b,c,d;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the first boolean value a:" );
		a=s.nextBoolean();
		System.out.println("Enter the Second Boolean Value b:");
		b=s.nextBoolean();
		System.out.println("Enter the third boolean Value c:");
		c=s.nextBoolean();
		if(a){
			d=b||c;
		}
		else {
			d=b&&c;
		}
		if(d) {
			System.out.println("Two of the three Variables are true");
		}else {
			System.out.println("Two of the three Variables are false");
		}
		s.close();
	}

}
