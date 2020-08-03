package EX9;

interface Hamburger{
	
	void eat();
}

class Outer{
	
	public Hamburger getHamburger() {
		class Inner implements Hamburger{
			public void eat() {
				System.out.print("eat Inner.Hamburger");
			}
		}
		
		return new Inner();
	}
}



public class EX9 {
	
	public static void main(String[] args) {
		
		Outer o = new Outer();
		Hamburger h = o.getHamburger();
		h.eat();
	}

}
