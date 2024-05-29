package Zoho_100;

public class MinNoOfCurrency {
	
	public static void findCurrency(int amount) {
		int notes[] = new int[] {2000,500,200,100,50,20,10,5,2,1};
		int numOfCurrency[] = new int[10];
		
		for(int i = 0; i < notes.length; i++) 
		{
			if(amount >= notes[i]) 
			{
				numOfCurrency[i] = amount / notes[i];
				amount = amount % notes[i];
			}
		}
		
		System.out.println("Currency -> notes");
		
		for(int i = 0; i < notes.length; i++) 
		{
			if(numOfCurrency[i] != 0) 
			{
				System.out.println(notes[i]+ " -> " +numOfCurrency[i]);
			}
		}
}
	
	public static void main(String [] args) {
		int amount = 888;
		findCurrency(amount);
	}

}
