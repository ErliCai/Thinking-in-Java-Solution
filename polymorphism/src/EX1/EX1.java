package EX1;

class Cycle{
	
	public String name;
	public static void ride(Cycle c) {
		System.out.println(c.name);
	}
	
}

class Unicycle extends Cycle{
	{
		super.name = "UniCycle";
	}
	}

class Bicycle extends Cycle{
	{
		super.name = "BiCycle";
	}
}

class Tricycle extends Cycle{
	{
		super.name = "Cycle";
	}
	
}

public class EX1 {
	
	public static void main(String[] args) {
		Unicycle u = new Unicycle();
		Bicycle b = new Bicycle();
		Tricycle t = new Tricycle();
		
		Cycle.ride(u);
		Cycle.ride(b);
		Cycle.ride(t);
		
	}

}
