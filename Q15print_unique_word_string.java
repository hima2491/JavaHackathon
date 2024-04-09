package Assignment;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
public class Q15print_unique_word_string {
	public static void printUniqueWords(String str) {
		// Create a new Map by creating object of HashMap class
		Map <String ,Integer> map= new LinkedHashMap<String,Integer>();
		// Extract words from string using split() method
     	String[] words=str.split("\\W+");//split by white spaces
		// Iterating over the words array using for each loop
     	for(String word :words) {
     	// If the word is present in array then
     		if(map.containsKey(word)) {
     		// Increment its value by one
     		//usingmap.get()method
     			map.put(word, map.get(word)+1);
     		// Else store the word inside map with value one
     		} else
            	 map.put(word,1);
     	}//Iterate over the map using for each loop
     	for(Map.Entry<String, Integer> entry :
     		map.entrySet()) {
     		//if the value of word equals  unity 
     		if(entry.getValue()==1)
     			//Print all those words
     			System.out.println(entry.getKey());
     	}
	}

	    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Original String:");
		String str=s.nextLine();
		s.close();
		printUniqueWords(str);

	}
}
 //Another Method to print Uniques using for loop and icludingcase sensitive
//static void printUniqueWords(String str)
//{
//    // Maintaining a count variable
//    int count;
//
//    // Extract words from string
//    // using split() method
//    String[] words = str.split("\\W");
//
//    // Iterating over the words array
//    for (int i = 0; i < words.length; i++) {
//
//        // Setting count of current word to one
//        count = 1;
//
//        for (int j = i + 1; j < words.length; j++) {
//            if (words[i].equalsIgnoreCase(words[j])) {
//
//                // If word found later in array
//                // increment the count variable
//                count++;
//
//                words[j] = "";
//            }
//        }
//
//        // If count of current word is one print it
//        if (count == 1 && words[i] != "")
//
//            // Print statement
//            System.out.println(words[i]);
//    }
//}
