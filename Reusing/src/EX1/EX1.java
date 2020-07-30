package EX1;

class Dog{
	
	String name;
	Dog(String s){
		name = s;
	}
	
	public String toString() {
		
		return name;
	}
}

public class EX1 {
	
	static Dog d;
	
	public static void main(String[] args) {
		
		d = new Dog("Benben");
		System.out.println(d);
		
	}
}
