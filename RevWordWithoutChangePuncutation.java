package Zoho_100;

public class RevWordWithoutChangePuncutation {
	public static void main(String[] args)
	{
		String str = "a@#x&*B)c";
		System.out.println("The Reverse String Wihtout Changeing the Puncuation is " + rev(str));
	}
	static String rev(String s)
	{
		char[] arr = s.toCharArray();
		int n = arr.length;
		int i = 0;
		int j = n-1;
		while(i < j)
		{
			boolean first = isAlphaNumeric(arr[i]);
			boolean second = isAlphaNumeric(arr[j]);
			if(first && second)
			{
				char temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;			
			}
			else if(!first)
				i++;
			else
				j--;
		}
		System.out.println(s);
		
		return new String(arr);
		
	}
	static boolean isAlphaNumeric(char ch)
	{
		if ((ch >= 'a' && ch <= 'z')||(ch >= 'A' && ch <= 'Z')) return true;
		else return false;
	}
}
