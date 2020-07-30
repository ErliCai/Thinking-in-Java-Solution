package EX10;

class A{
	public void describe(){
		System.out.println(name() + 123);
	}
	public String name() {return "A";}
}

class B extends A{
	public String name() {return "B";}
}

public class EX10 {
	public static void t(A a){
		a.describe();
	}
	public static void main(String[] args) {
		
		B b = new B();
		t(b);
		
		
	}

}
