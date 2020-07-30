package EX3;


class f{
	float a;
}


public class EX3 {
	
	static void passObject(f y){
		y.a = 1.23f;
	}
	
	public static void main(String[] args) {
	    f example = new f();
	    example.a = 3.14f;
	    
	    System.out.println(example.a);
	    passObject(example);
	    System.out.println(example.a);
	}
}
