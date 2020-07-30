package EX14;

interface Screen{
	public void pixel();
	void size();
}

interface Mouse{
	void sensitivity();
	void bluetooth();
}

interface Keyboard{
	void type();
	void cherry();
}


interface Computer extends Screen ,Mouse ,Keyboard{
	
	void charge();
	
}

class Jobs{
	
}

class Apple extends Jobs implements Computer{

	@Override
	public void pixel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void size() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sensitivity() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bluetooth() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void type() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cherry() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		
	}
	
}

public class EX14 {
	public static void s(Screen s) {}
	public static void m(Mouse m) {}
	public static void k(Keyboard k) {}
	public static void A(Apple a) {}
	
	public static void main(String[] args) {
		Apple a = new Apple();
		s(a);
		m(a);
		k(a);
		A(a);
		
	}
	

}
