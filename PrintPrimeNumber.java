package Zoho_100;

public class PrintPrimeNumber {
	public static void main(String [] args) {
		
		int n = 100;
		
		for(int i = 1; i <= n; i++) {
			if(isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		
	}
	public static boolean isPrime(int n) {
		if(n == 0 || n == 1) return false;
		for(int i = 2; i*i <= n; i++) {
			if( n%i == 0) return false;
}
		return true;
	}
}
