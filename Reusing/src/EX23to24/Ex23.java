package EX23to24;

class A{
	static int i = PrintInt("class A loaded");
	
	public static int PrintInt(String s) {
		System.out.println(s);
		return 1;
	}
	
	A(){
		System.out.println("An object of class A is initialised");
	}
		
}

class B{
	static int i = PrintInt("class B loaded");
	
	public static int PrintInt(String s) {
		System.out.println(s);
		return 1;
	}
	
	B(){
		System.out.println("An object of class B is initialised");
	}
		
}


public class Ex23 {
	
	public static void main(String[] args) {
		
		A a = new A();
		A c = new A();
		System.out.println(B.i);
		
	}

}
