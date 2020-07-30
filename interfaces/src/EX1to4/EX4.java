package EX1to4;

abstract class Base{
	
	
}

class Derived extends Base{
	
	public void method() {
		System.out.println("123");
	}
	
	static void method2(Base b) {
		Derived d = (Derived) b;
		d.method();
	}
	
}


public class EX4 {
	
	public static void main(String[] args) {
		
		Derived.method2(new Derived());
		
	}

}
