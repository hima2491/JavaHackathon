package Assignment;
import java.util.Scanner;
public class Q24print_consecutive_combinations {
	public static void printconsecutivecombinations(int n) {
		// Note that we don't  ever have to sum  numbers > ceil(N/2)
    int  sum;
    int start=1;
    int end=(n+1)/2;
    //Repeat the loop from bottom to half
    while(start<end) {
    	// Check if there exist  any sequence from  bottom to half which  adds up to N
    	sum=0;
    for(int i=start;i<=end;i++) 
    	{
    		sum =sum+i;
    		// If sum = N, this means consecutive sequence exists
    		if(sum==n) {
    			// found consecutive  numbers! print them
    		for(int j=start;j<=i;j++)
    			System.out.print(j + "+");
    			System.out.println();
    		break;
    		}
    		// if sum increases N then it can not exist in the  consecutive sequence  starting from bottom
    		 if(sum>n) 
    		break;
    	    }
    		 sum=0;
    		 start++;
	       }
	       } 
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
    int n=sc.nextInt();
    if(n<=0) {
    	System.out.println("please enter the positive number");
    }else {
    	System.out.println("Possible consecutive number combinations:");
    	printconsecutivecombinations(n);
    }
    sc.close();
}
}
