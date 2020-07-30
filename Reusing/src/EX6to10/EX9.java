package EX6to10;

class Component1{
	Component1() {
		// TODO Auto-generated constructor stub
		System.out.println("Comp1");
	}
}

class Component2{
    Component2() {
		// TODO Auto-generated constructor stub
		System.out.println("Comp2");
	}
}

class Component3{
    Component3() {
		// TODO Auto-generated constructor stub
		System.out.println("Comp3");
	}
}

class Root{
	Component1 a;
	Component2 b;
	Component3 c;
	Root(){
		a = new Component1();
		b = new Component2();
		c = new Component3();
	}
}

class Stem extends Root{
	
	
}

public class EX9 {
	
	public static void main(String[] args) {
		
		Stem s = new Stem();
	}

}
