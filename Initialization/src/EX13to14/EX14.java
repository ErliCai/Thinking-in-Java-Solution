package EX13to14;

class Dog{
	static String name = "Gou";
	static String age;
	
	static {
		age = "22";
	}
	
	static void call() {
		
		System.out.print(name + " is " + age);
	}
	
}

public class EX14 {
	
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.call();
		
	}
	

}
