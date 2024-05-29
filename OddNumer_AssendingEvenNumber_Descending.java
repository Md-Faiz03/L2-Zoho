package Zoho_100;
import java.util.*;

public class OddNumer_AssendingEvenNumber_Descending {
	
	public static void sort(int[] arr, int n) {
		for(int i = 0; i < n-1; i++) {
			int mini = i;
			for(int j = i+1; j < n; j++) {
				if(arr[j] < arr[mini]) {
					mini = j;
				}
			}
			int temp = arr[mini];
			arr[mini] = arr[i];
			arr[i] = temp;
			
		}
	}
	
	public static void main(String [] args) {
		int arr[] = {0,4,5,3,7,2,1};
		printArray(arr, arr.length);
		sort(arr, arr.length);
		printArray(arr, arr.length);
		ArrayList<Integer> odd = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<>();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) even.add(arr[i]);
			else odd.add(arr[i]);
		}
		
		for(int i = odd.size() -1; i >= 0; i--) {
			System.out.print(odd.get(i) + " ");
		}
		for(int i = 0; i < even.size(); i++) {
			System.out.print(even.get(i) + " ");
		}
	}

	public static void printArray(int[] arr, int n) 
	{
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
