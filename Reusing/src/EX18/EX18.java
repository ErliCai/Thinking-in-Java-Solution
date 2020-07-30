package EX18;

import java.util.Random;

class A{
	
	static Random rand = new Random();
	
	static final int a = rand.nextInt();
	final int b = rand.nextInt();
	
	public String toString() {
		return a + " " + b;
		
		
	}
}

public class EX18 {
	
	public static  void main(String[] args) {
		
		A a = new A();
		A b = new A();
		System.out.println(a);
		System.out.println(b);
	}
}
