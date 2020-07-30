package EX6to10;

class ComponentA{
	ComponentA(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Comp" + i);
	}
}

class ComponentB{
    ComponentB(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Comp"+i);
	}
}

class ComponentC{
    ComponentC(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Comp"+i);
	}
}

class Roott{
	ComponentA a;
	ComponentB b;
	ComponentC c;
	Roott(int i){
		a = new ComponentA(1);
		b = new ComponentB(2);
		c = new ComponentC(3);
		System.out.println("Root"+i);
	}
}

class Stemm extends Roott{
	
	Stemm(int i){
		super(4);
		System.out.println("Stem"+i);
	}
	
}

public class EX10 {
	
	public static void main(String[] args) {
		
		Stemm s = new Stemm(5);
	}

}