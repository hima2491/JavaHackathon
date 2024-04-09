package Assignment;
import java.util.HashMap;
import java.util.Scanner;
public class Q20String_countOf_Int_Upper_lower {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the  String:");
		String str=s.nextLine();
		s.close();
		int repUppercase=0;
		int RepLowercase=0;
		int num=0;
		HashMap<String,Integer> hashmap=new HashMap<String,Integer>();
		for(int i=0;i<str.length();i++) {
			String strVal=str.charAt(i) + " ";//String.valueOf(i);
			if(hashmap.containsKey(strVal)) {
				Integer mapVal=hashmap.get(strVal);
				mapVal=mapVal+1;
				hashmap.put(strVal, mapVal);
			}else {
				hashmap.put(strVal, Integer.valueOf(1));
			}// if no add element with to map with val 1	
		}
		//Print the upper case
		for (String mapKey:hashmap.keySet()) {
			Integer mapVal=hashmap.get(mapKey);//.get(map key);
			char ch =mapKey.charAt(0);
			if (ch>='A' && ch<='Z'){
					//uppercase Count++
		   }else {
			   continue;
		   }
			if (mapVal.intValue()>1) {
				System.out.println("Duplicate Uppercase Count: " + mapKey + "occured: " + mapVal);
			}
		}
		for (String mapKey1:hashmap.keySet()) {
			Integer mapVal1=hashmap.get(mapKey1);//.get(map key);
			char ch =mapKey1.charAt(0);
			if (ch>='a' && ch<='z'){
					//lowercase Count++
		   }else {
			   continue;
		   }
			if (mapVal1.intValue()>1) {
				System.out.println("Duplicate Lowercase Count: " + mapKey1 + "occured: " + mapVal1);
			}
		}//Integer Count
		for (String mapKey2:hashmap.keySet()) {
			Integer mapVal2=hashmap.get(mapKey2);//.get(map key);
			char ch =mapKey2.charAt(0);
			if (ch>='0' && ch<='9'){
					
		   }else {
			   continue;
		   }
			if (mapVal2.intValue()>1) {
				System.out.println("Duplicate Integers Count: " + mapKey2 + "occured: " + mapVal2);
			}
		}
	}
}
		

