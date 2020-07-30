
class A{
	int a;
	
	A(){
		a = 2;
	}
	
	void geta() {
		System.out.println(a);
	}
}

class B extends A{
	
	B(){
		
	}
	
	int get() {
		return a;
	}
	
	void geta() {
		System.out.println(a+2);
	}
}


public class Try {

	public static void main(String[] args) {
		B b = new B();
		b.geta();
	}
	
}
