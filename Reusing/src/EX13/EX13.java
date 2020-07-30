package EX13;

class A{
	
	float foo(float f) {
		System.out.println("float");
		return 1.0f;
	}
	
	int foo(int i) {
		System.out.println("float");
		return 1;
	}
	
	char foo(char c) {
		System.out.println("char");
		return 'a';
	}
}

class B extends A{
	
	boolean foo(boolean b) {
		System.out.println("boolean");
		return true;
	}
}

public class EX13 {
	
	public static void main(String[] args) {
		
		B b = new B();
		System.out.println(b.foo(true));
	}

}
