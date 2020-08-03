package EX7;

class Outer{
	
	private String name = "Outer";
	private String getName() {
		return name;
	}
	
	class Inner{
		void changeName(String s) {
			name = s;
		}
		void printName() {
			System.out.println(getName());
		}
	}
	
	public void test() {
		Inner i =this.new Inner();
		i.changeName("Inner");
		i.printName();
	}
	
}


public class EX7 {

	public static void main(String[] args) {
		
		Outer o = new Outer();
		o.test();
		
	}
	
}
