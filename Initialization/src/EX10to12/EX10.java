package EX10to12;

class Dog{
	
	void finalise() {
		
		System.out.println("Not cleaned up");
		
	}
}

public class EX10 {
	
	public static void main(String[] args) {
		
		Dog d = new Dog();
		System.gc();
		
	}

}
