package Zoho_100;

public class SingleElementInSortedArray {
	public static void main(String [] args)
	{
		int arr[] = {2,2,3,3,4,5,5,6,6,7,7};
		int n = arr.length;
		System.out.println("The Single Element in Sorted Array is : " + singleElement(arr,n));
		System.out.println(2*2);
	}
	static int singleElement(int[] arr, int n) 
	{ 
//		for(int i = )
		int count = 0;
		for(int i = 0; i < n; i++) {
			count ^= arr[i];
		}
		return count;
	}
}
