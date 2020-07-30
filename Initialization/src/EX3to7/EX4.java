package EX3to7;


class Books{	
	Books(){
		System.out.println("I love reaing books");
	}	
	
	Books(String s){
		System.out.println("I love reaing " + s);
	}
}

public class EX4 {
	
	public static void main(String[] args) {
		
		Books NineteenEightyFour = new Books();
		NineteenEightyFour = new Books("NineteenEightyFour");
	}

}
