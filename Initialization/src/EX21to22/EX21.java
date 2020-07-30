package EX21to22;

enum Currency{
	ONE, TWO, FIVE, TEN,  TWENTY, FIFTY, HUNDRED
	
}

public class EX21 {
	
	
	public static void main(String[] args) {
		
		for (Currency i: Currency.values()) {
			System.out.println(i + " ordinal " + i.ordinal() );
			
		}
		
	}

}
