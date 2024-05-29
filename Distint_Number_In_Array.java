package Zoho_100;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Distint_Number_In_Array {
	public static void distintNumber(int[] arr, int n) 
	{
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			int k = arr[i];
			while(k != 0) 
			{
				int j = k%10;
				if(map.containsKey(j)) 
				{
					map.put(j,map.get(j)+1);
				}
				else {
					map.put(j, 1);
					list.add(j);
				}
				k = k/10;
			}
		}
		System.out.print(list);
		
		
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {111,222,333,444,666};
		distintNumber(arr,arr.length);
		//printArray(arr,arr.length);
	}
	
	public static void printArray(int[] arr, int n) 
	{
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
