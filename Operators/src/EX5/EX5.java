package EX5;

class Dog{
	String name;
	String says;
	
}

public class EX5 {
	
	public static void main(String[] args) {
		
		Dog a = new Dog();
		a.name = "Spot";
		a.says = "Ruff!";
		
		Dog b = new Dog();
		b.name = "Scruffy";
		b.says = "Wurf!";
		
		
		System.out.println(a.name+" says "+a.says);
		System.out.println(b.name+" says "+b.says);
	}

}
