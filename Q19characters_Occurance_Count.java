package Assignment;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Q19characters_Occurance_Count {
	public static void CharOccurancesCount(String str) {
	//create map to store character counts
			Map<Character,Integer> charOccurance=new HashMap<>();
			//convert the string to lowercase for case sensitivity
			str= str.toLowerCase();
			//Iterate through each character in the string
			for(char ch:str.toCharArray()) {
				//Increment the count for character in the map
				if (Character.isLetter(ch)) {//considering only  letters
				charOccurance.put(ch, charOccurance.getOrDefault(ch,0)+1);
				}
			}
			//print the characters  along with their Occurances; 
			System.out.println( "Characters Occurances in the String");
			for(Map.Entry<Character, Integer> entry:charOccurance.entrySet()){
				if(entry.getValue()>1) {
					System.out.println(entry.getKey()+ " - "+ entry.getValue()+ " times ");
				}
			}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=s.nextLine();
		s.close();
		CharOccurancesCount(str);
	}

}
