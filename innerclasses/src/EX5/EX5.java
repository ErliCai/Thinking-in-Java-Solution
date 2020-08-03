package EX5;

class Outer{
	
	class Inner{
		
	}
}

public class EX5 {

	Outer o = new Outer();
	Outer.Inner i = o.new Inner();
	
}
