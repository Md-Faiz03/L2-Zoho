package Zoho_100;

public class MinMovesToConvertStr {
	public static void main(String [] args) 
	{
		String str = "OXOXOX";
		int n = str.length();
		System.out.println(findMoves(str,n));
	}
	static int findMoves(String s, int n) 
	{
		int count = 0;
		for(int i = 0; i < n;) 
		{
			if(s.charAt(i) == 'X') 
			{
				count++;
				i += 3;
			}else
			{
				i++;
			}
		}
		
		return count;
		
	}
}
