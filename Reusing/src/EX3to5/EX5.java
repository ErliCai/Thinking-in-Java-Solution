package EX3to5;

class A{

	A(){
		System.out.println("a created");
	}
}

class B{
	
	C c = new C();
	B(){
		System.out.println("B created");
	}
}

class C extends A{
	
	
}

public class EX5 {
	
	public static void main(String[] args) {
		
		B b = new B();
		
	}

}
