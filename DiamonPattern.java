package Zoho_100;

public class DiamonPattern {
	
	public static void pattern(int n) {
		// upper diamond 
		
		for(int i = 0; i < n-1; i++) {
			//space
			for(int j = 0; j < n-i-1; j++) {
				System.out.print(" ");
			}
			//star
			for(int j = 0; j < i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// lower diamond 
		
		for(int i = 0; i < n; i++) {
			//space 
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			//star 
			for(int j = 0; j < n-i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main (String [] args) {
		pattern(5);
	}

}
