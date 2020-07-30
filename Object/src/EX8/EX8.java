package EX8;

public class EX8 {
	
	
	public static void main(String[] args) {
	    StaticTest a = new StaticTest();
	    StaticTest b = new StaticTest();
	
	    System.out.println(a.i);
	    System.out.println(b.i);
	    
	    a.i += 100;
	    System.out.println(a.i);
	    System.out.println(b.i);
	}
	
}
