package EX1to4;

abstract class B{
	
	abstract void print();
	int getInt() {
		print();
		return 1;
	}
	
}

class D extends B{
	int a = 10;
	
	@Override
	void print() {
		
		System.out.println(a);
	}
	
	
}

public class EX3 {
	
	public static void main(String[] args) {
		
		D d = new D();
		d.getInt();
	}

}
