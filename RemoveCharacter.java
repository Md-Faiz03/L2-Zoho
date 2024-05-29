package Zoho_100;
import java.util.HashMap;

public class RemoveCharacter {
	public static void main(String ... a) {
		String str1 = "computer";
		String str2 = "cat";
		
		System.out.println(removeChar(str1,str2));
	}
	public static String removeChar(String string1, String string2) {
		HashMap<Character,Integer> map = new HashMap<>();
		for(char ch : string2.toCharArray()) 
		{
			if(map.containsKey(ch)) 		
				map.put(ch, map.get(ch)+1);
			else 
				map.put(ch, 1);
		}
		
		StringBuilder sc = new StringBuilder();
		
		for(char ch : string1.toCharArray()) 
		{
			 if(map.containsKey(ch))
				 continue;
			 sc.append(ch);
		}
		return sc.toString();
	}
}
