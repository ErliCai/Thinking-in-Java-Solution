package EX1to4;



abstract class Rodent{
	public abstract String toString();
	public abstract void act();
}

class Mouse extends Rodent{
	@Override public String toString() {
		return "Mouse";
	}
	public void act() {
		System.out.println(this + " eats food");
	}
	
}

class Gerbil extends Rodent{
	@Override public String toString() {
		return "Gerbil";
	}
	public void act() {
		System.out.println(this + " digs holes");
	}	
}

class Hamster extends Rodent{
	@Override public String toString() {
		return "Hamster";
	}
	public void act() {
		System.out.println(this + " is cute");
	}
	
}

public class EX1 {
	
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