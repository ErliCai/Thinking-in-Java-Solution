package EX5;

class Dog{
	
	public void one() {
		System.out.println("One");
	}
	private void Two() {
		System.out.println("Two");
	}
	void Three() {
		System.out.println("Three");
	}
	protected void Four() {
		System.out.println("Four");
	}
}

public class EX5 {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.one();
		// d.Two();
		d.Three();
		d.Four();
		
	}
}
