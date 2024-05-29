package Zoho_100;

public class isTwistedPrime {
	public static void main(String [] args) {
		int n = 97;
		int rev = reverseNum(n);
		System.out.println(isTwisted(n, rev));
	}
	public static int isTwisted(int num1, int num2) {
		boolean flag1 = false;
		boolean flag2 = false;
		if(isPrime(num1)) {
			flag1 = true;
		}
		if(isPrime(num2)) {
			flag2 = true;
		}
		
		if(flag1 && flag2) return 1;
		return 0;
	}
	public static boolean isPrime(int num) {
		if(num == 0 || num == 1) return false;
		for(int i = 2; i*i <= num; i++) {
			if(num%i == 0) return false;
		}
		return true;
	}
	
	public static int reverseNum(int n) {
		int rev = 0; 
		while(n != 0) {
			int temp = n % 10;
			rev = (rev * 10) + temp;
			n /= 10;
		}
		
		return rev;
	}

}
