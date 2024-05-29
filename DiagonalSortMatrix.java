package Zoho_100;

public class DiagonalSortMatrix {
	public static void main(String [] args) 
	{
		int [][] arr = {{3,3,1,1},{2,2,1,2},{1,1,1,2}};
		int m = arr.length;
		int n = arr[0].length;
		
		diagonalSort(arr,n,m);
		
		for(int i = 0; i < m; i++) 
		{
			printArray(arr[i]);
		}
	}
	static void diagonalSort(int[][] arr, int m, int n)
	{
		for(int i = 0; i < n; i++) {
			countSort(arr,i,0);
		}
		for(int j = 1; j < n; j++) {
			countSort(arr,0,j);
		}
	}
	static void countSort(int arr[][], int r, int c)
	{
		int m = arr.length;
		int n = arr[0].length;
		int i = r;
		int j = c;
		
		int[] map = new int[101];
		while(i<m && j <n) 
		{
			map[arr[i][j]]++;
			i++;
			j++;
		}
		i = r;
		j = c;
		for(int k = 0; k < map.length; k++)
		{
			while(map[k] > 0) 
			{
				arr[i][j] = k;
				map[k]--;
				i++;
				j++;
			}
		}
		
	}
	static void printArray(int[] arr) 
	{
		int n = arr.length;
		for(int i = 0; i < n; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
