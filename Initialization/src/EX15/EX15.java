package EX15;

class Dog{
	String name;
	{
		name = "God";
		System.out.println(name);
	}
	
	Dog(int i){
		System.out.println(i);
	}
	
}

public class EX15 {
	
	public static void main(String[] args) {
		
		Dog d = new Dog(1);
		
	}

}
