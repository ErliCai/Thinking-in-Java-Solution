package ExcerciseOneToFive;

import java.util.Random;

public class EX2 {
	
	public static void main(String[] args) {
		int a,b;
		String s;
		Random rand = new Random();
		
		for (int i = 1; i <= 25;i++) {
			a = rand.nextInt();
			b = rand.nextInt();
			if (a < b)
				s = " < ";
			else if (a > b)
			    s = " > ";
			else
				s = " = ";
			System.out.println(a+s+b);
			
		}
		
	}
}
