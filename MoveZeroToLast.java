package Zoho_100;

public class MoveZeroToLast {
	public static void main(String [] args) {
		int arr[] = {1,0,3,4,0,7,8};
		int n = arr.length;
		moveZeroLast(arr,n);
		print(arr,n);
	}
	public static void moveZeroLast(int[] arr, int n) {
		int j = -1;
		for(int i = 0; i < n; i++) {
			if(arr[i] == 0) {
				j = i;
				break;
			}
		}
		for(int i = j+1; i < n; i++) {
			if(arr[i] != 0) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				j++;
			}
		}
	}
	public static void print(int[] arr, int n) {
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
