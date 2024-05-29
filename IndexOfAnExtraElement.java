package Zoho_100;

public class IndexOfAnExtraElement {
	public static void main(String [] agrs) 
	{
		int arr1[] = {2,4,8,9,10,12};
		int arr2[] = {2,4,8,10,12};
		int n = arr1.length;
		System.out.println("The Index of Extra Element is : " + findIndex(arr1,arr2,n));
	}
	static int findIndex(int[] arr1, int[] arr2, int n) 
	{
		int i = 0; 
		int j = 0;
		while(i < n) 
		{
			if(arr1[i] == arr2[j]) {
				i++;
				j++;
			}
			else {
				return i + 1;
			}
		}
		return 0;
	}
}
