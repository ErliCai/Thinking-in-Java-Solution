package EX8;

class Outer{
	
	
	class Inner{
		private String name = "Inner";
	}
	
	public void changeName(String s) {
		// !name = s;
		// As we can see here, the outer class has no access to the 
		// private field in the inner class
	}
	
}

public class EX9 {

}
