package EX8;

class Dog{
	void Bark() {
		System.out.println("Bark");
	}
	
	void Bark2() {
		Bark();
		this.Bark();
	}
}


public class EX8 {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.Bark2();
		
	}
	
}
