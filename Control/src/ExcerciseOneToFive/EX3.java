package ExcerciseOneToFive;

import java.util.Random;

public class EX3 {
	
	public static void main(String[] args) {
		int a,b;
		String s;
		Random rand = new Random();
		
		while (true) {
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
