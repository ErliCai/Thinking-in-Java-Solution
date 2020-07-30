package EX6;

class Dog{
	String name;
	String says;
	
}

public class EX6 {
	
	public static void main(String[] args) {
		
		Dog a = new Dog();
		a.name = "Spot";
		a.says = "Ruff!";
		
		Dog b = new Dog();
		b.name = "Scruffy";
		b.says = "Wurf!";
		
		Dog c = a;
		
		System.out.println(a == c);
		System.out.println(a.equals(c));
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
	}

}
