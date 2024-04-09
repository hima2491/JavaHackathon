package Assignment;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q18Print_duplicatecharacters {
	public static void Duplicatecharacters(String str) {
		//create map to store character counts
		Map<Character,Integer> charCountMap=new HashMap<>();
		//convert the string to lowercase for case sensitivity
		str= str.toLowerCase();
		//Iterate throgh each character in the string
		for(char ch:str.toCharArray()) {
		
			//Increment the count for character in the map
			charCountMap.put(ch, charCountMap.getOrDefault(ch,0)+1);
		}
		//print the characters with coutn greater than 1(i.e duplicate values)
		System.out.println("Duplicate Characters in the String");
		for(Map.Entry<Character, Integer> entry:charCountMap.entrySet()){
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+ " - "+ entry.getValue()+ " times ");
			}
		}	
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the  String:");
		String str=s.nextLine();
		Duplicatecharacters(str);
		s.close();
	}

}


