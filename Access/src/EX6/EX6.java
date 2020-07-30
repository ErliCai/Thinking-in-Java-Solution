package EX6;

class Dog{
	protected String name;
}

class MyDog{
	
	MyDog(Dog d, String s){
		d.name = s;
	}
	
}


public class EX6 {
	
	public static void main(String[] args) {
		Dog d = new Dog();
		MyDog c = new MyDog(d, "BenBen");
		System.out.println(d.name);
		
	}

}
