package EX2;

public class EX2 extends Detergent{

	public void scrub() {
		
		append(" EX2.scrub() ");
		super.scrub();
	}
	
	public void sterilize() {
		
		append(" sterilize()");
	}
	
	
	public static void main(String[] args) {
		
		EX2 e = new EX2();
		e.dilute();
		e.apply();
		e.scrub();
		e.sterilize();
		System.out.println(e);
		
	}
}
