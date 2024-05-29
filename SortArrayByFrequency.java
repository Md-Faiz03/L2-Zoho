package Zoho_100;
import java.util.*;

public class SortArrayByFrequency {
	public static void main(String[] args) {
		int[] arr = {10,7,10,5,6,7,10,2,2};
		int n = arr.length;
		List <Integer> list = new ArrayList<>();
		for(int i = 0; i < n; i++) 
		{
			list.add(arr[i]);
		}
		System.out.println(SortArrayByFrequency.sortList(list));
		
	}
	public static List<Integer> sortList(List<Integer> list) {
		Map <Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < list.size(); i++) 
		{
			map.put(list.get(i), map.getOrDefault(list.get(i),0) + 1);
		}
		System.out.println(map);
		
		Collections.sort(list, (n1,n2) -> {
			int freq1 = map.get(n1);
			int freq2 = map.get(n2);
			
			if(freq1 != freq2) {
				return freq2 - freq1;
			}
			return n1 - n2;
		});
		return list;
	}

}
