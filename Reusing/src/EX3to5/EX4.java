package EX3to5;

class Base{
	
	Base(){
		
		System.out.println("Base class called");
	}
	
}

public class EX4 extends Base{
	
	EX4(int i){
		
		System.out.println(i+1);
		
	}

	
	public static void main(String[] args) {
		
		EX4 e = new EX4(1);
	}
	
}
