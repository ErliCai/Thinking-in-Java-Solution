package Excercise6to10;

public class EX9 {
	
	static void Fibonnaci(int c) {

		int m = 0;
		int n = 1;
		int a;
		System.out.print(1);
		
		for(int i=0;i<c-1;i++) {
			System.out.print(",");
			a = m + n;
			System.out.print(a);			
			m = n;
			n = a;
		}
	}
	
	public static void main(String[] arrgs) {
		
		Fibonnaci(5);
		
	}
}
