package EX3;


public class Outer {
	private String name = "Outer";
	
	class Inner{
		public void P() {
			System.out.println(123);
		}
		public String toString() {
			return name;
		}
		
	}
	
	public Inner creatInner() {
		return new Inner();
	}
	
	
	public static void main(String[] args) {
		
		Outer o = new Outer();
		Inner i = o.creatInner();
		i.P();
		System.out.println(i.toString());

	}

}
