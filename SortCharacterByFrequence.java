package Zoho_100;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.PriorityQueue;

public class SortCharacterByFrequence {
	
	public static void main(String ... a) {
		String sc = "tree";
		System.out.println(sort(sc));
	}
	
	public static String sort(String sc) {
		char ch[] = sc.toCharArray();
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i = 0; i < ch.length; i++) 
		{
			if(map.containsKey(ch[i])) 
			{
				map.put(ch[i], map.get(ch[i]) + 1);
			}
			else 
				map.put(ch[i], 1);
		}
		
		Queue<Character> q = new PriorityQueue<> ((a,b) -> (map.get(b) - map.get(a)));
		
		for(char key : map.keySet()) 
			q.add(key);
		
		StringBuilder str = new StringBuilder();
		while(q.size() > 0) 
		{
			char c = q.poll();
			for(int i = 0; i < map.get(c); i++) 
			{
				str.append(c);
			}
		}
		
		return str.toString();
	}
}
