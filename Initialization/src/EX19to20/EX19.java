package EX19to20;



public class EX19 {
	
	public static void f(String... s) {
		
		for (String i: s) {
			
			System.out.print(i+ " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		f("123", "1234", "12345");
		String[] n = {"123", "1234", "12345"};
	    f(n);
	}
}
