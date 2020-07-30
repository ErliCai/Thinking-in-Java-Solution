package EX9;

class Dog{
	String name;
	int age;
	
	Dog(int i){
		age = i;
	}
	
	Dog(int i, String name){
		this(i);
		this.name = name;
		
		System.out.println(name + " is " + i +" years old");
	}
}

public class EX9 {
	
	public static void main(String[] args) {
		
		Dog d = new Dog(32  , "Dog");
		
	}

}
