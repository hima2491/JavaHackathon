package Assignment;
import java.util.Scanner;
public class Q23Differentiate_Input_String {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String:");
		String Input=scan.nextLine().trim();
		if(isInteger(Input)) {
			System.out.println("Entered Input is Integer");
		}else if(isBooelan(Input)){
			System.out.println("Entered Input is Boolean");
		}else {
			System.out.println("Entered Input is string");	
		}
		scan.close();
	}
	//Method to check if entered input can be parsed integer
	private static boolean isInteger(String Input) {
		try {
			Integer.parseInt(Input);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}
	//Method to check if the input can be parsed as boolean
	private static boolean isBooelan(String Input) {
		return Input.equalsIgnoreCase("true")||Input.equalsIgnoreCase("false");
	}
}
