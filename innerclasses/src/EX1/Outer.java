package EX1;

public class Outer {
	
	class Inner{
		public void P() {
			System.out.println(123);
		}
		
	}
	
	public Inner creatInner() {
		return new Inner();
	}
	
	
	public static void main(String[] args) {
		
		Outer o = new Outer();
		Inner i = o.creatInner();
		i.P();

	}

}
