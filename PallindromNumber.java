package Zoho_100;

public class PallindromNumber {
	public static void main(String[] args)
	{
		int n = 12321;
		if(isPallindrom(n))
		{
			System.out.println("The Number "+n+" is Pallindrom");
		}
		else
		{
			System.out.println("The Number "+n+" is Not Pallindrom");
		}
	}
	static boolean isPallindrom(int n)
	{
		int rev = 0;
		int num = n;
		while(num != 0) {
			int temp = num%10;
			rev = (rev*10) + temp;
			num /= 10;
		}
		if(n == rev)
			return true;
		else
			return false;
	}
}
