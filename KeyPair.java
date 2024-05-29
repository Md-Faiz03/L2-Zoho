package Zoho_100;
import java.util.HashMap;

public class KeyPair {
	public static void main(String ... a) {
		
		int arr[] = {1,4,45,6,10,8};
		int n = arr.length;
		int x = 16;
		System.out.println(hasArrayTwoCandidate(arr,n,x));	
		
	}
	public static boolean hasArrayTwoCandidate(int[] arr, int n, int x) 
	{
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i= 0; i < n; i++) {
			int rem = x - arr[i];
			if(map.containsKey(rem))
			{
				return true;
			}
			else {
				map.put(arr[i],i);
			}
		}
		return false;
	}
}
