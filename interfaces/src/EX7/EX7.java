package EX7;



interface Rodent{
	public abstract String toString();
	public abstract void act();
}

class Mouse implements Rodent{
	@Override public String toString() {
		return "Mouse";
	}
	public void act() {
		System.out.println(this + " eats food");
	}
	
}

class Gerbil implements Rodent{
	@Override public String toString() {
		return "Gerbil";
	}
	public void act() {
		System.out.println(this + " digs holes");
	}	
}

class Hamster implements Rodent{
	@Override public String toString() {
		return "Hamster";
	}
	public void act() {
		System.out.println(this + " is cute");
	}
	
}

public class EX7 {
	
	public static void main(String[] args) {
		Rodent[] r = new Rodent[]{
				new Mouse(),
				new Gerbil(),
				new Hamster()
		};
		for (Rodent a: r) {
			a.act();
		}
	}

}