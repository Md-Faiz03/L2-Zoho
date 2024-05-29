package Zoho_100;

public class SubStringOfOther {
	public static void main(String [] args) {
		String str1 = "AXY";
		String str2 = "ABXCYD";
		char[] st1 = str1.toCharArray();
		char[] st2 = str2.toCharArray();
		
		int m = st1.length;
		int n = st2.length;
		
		System.out.println(findSubString(st1,st2,m,n));
	}
	static boolean findSubString(char[] str1, char[] str2, int m, int n) {
		
		//recursive approach
		
//		if(m == 0) return true;
//		if(n == 0) return false;
//		
//		if(str1[m-1] == str2[n-1]) 
//			return findSubString(str1,str2,m-1,n-1);
//		
//		return findSubString(str1,str2,m,n-1);
		
		// iterative approach
		
		int j = 0;
		for(int i = 0; i<n && j<m; i++) 
		{
			if(str1[j] == str2[i]) 
				j++;
		}
		return j == m;
		
	}
}
