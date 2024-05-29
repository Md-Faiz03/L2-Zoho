package Zoho_100;

public class EaseTheArray {
	public static void main(String ... a) {
		int arr[] = {2,2,0,4,0,8};
		int n = arr.length;
//		System.out.println("The Array Before Modify");
//		print(arr,n);
		modifyAndRearrange(arr,n);
		System.out.println("The Array After Modify");
		print(arr,n);
	}
	public static void print(int [] arr, int n) 
	{
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void modifyAndRearrange(int [] arr, int n) 
	{
		for(int i = 0; i < n-1; i++) {
			if(arr[i] == arr[i+1])
			{
				arr[i] = 2*arr[i];
				arr[i+1] = 0;
			}
		}
		int j = -1;
		
		for(int i = 0; i < n; i++) {
			if(arr[i] == 0)
			{
				j = i;
				break;
			}	
		}
		for(int i = j+1; i < n; i++) {
			if(arr[i] != 0)
			{
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				j++; 
			}
		}
	}
}
