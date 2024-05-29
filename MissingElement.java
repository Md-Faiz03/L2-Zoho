package Zoho_100;

public class MissingElement {
	public static void main(String[] arg) 
	{
		int [] arr = {1,2,4,5,6};
		int n = arr.length;
		int N = n+1;
		System.out.println("The Missing Element is : " + missingElement(arr,n,N));		
	}
	static int missingElement(int[] arr, int n, int N)
	{
		int product = N*(N+1) / 2;
		int sum = 0;
		for(int i = 0; i < n; i++)
		{
			sum += arr[i];
		}
		return product - sum;
	}
}
