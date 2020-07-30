package EX6to10;

class D{
	
	D(){
		System.out.println("D created");
	}
}

public class EX8 extends D{
	
	EX8(){
		
	}

	EX8(int i){
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		EX8 a = new EX8();
		EX8 b = new EX8(2);
	}
}
