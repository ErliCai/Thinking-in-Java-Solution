package EX1to2;

class Test1{
	String s = "Cai";
	Test1(){
		
	}
}

class Test2{
	String s;
	Test2(){
		s = "XLT";
	}
}


public class EX2 {
	
	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		System.out.print(t1.s + t2.s);
		
	}

}
