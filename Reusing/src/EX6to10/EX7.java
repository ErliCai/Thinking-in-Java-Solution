package EX6to10;
class A{

	A(int i){
		System.out.println("a created");
	}
}

class B{
	
	C c = new C(1);
	B(){
		System.out.println("B created");
	}
}

class C extends A{
	
	C(int i){
		super(i);
	    System.out.println("C created");
	}
}

public class EX7 {
	
	public static void main(String[] args) {
		
		B b = new B();
		
	}

}