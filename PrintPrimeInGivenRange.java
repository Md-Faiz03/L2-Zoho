package Zoho_100;

public class PrintPrimeInGivenRange {
	public static void main(String[] args) {
		int lower = 50;
		int upper = 100;
		for(int i = lower; i <= upper; i++) {
			if(isPrime(i))
				System.out.print(i + " ");
		}
	}
	static boolean isPrime(int n) {
		if(n == 0 || n == 1) {
			return false;
		}
		for(int i = 2; i*i <= n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
