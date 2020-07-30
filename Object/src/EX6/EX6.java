package EX6;

import java.util.Scanner;

public class EX6 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		int len = storage(s);
		System.out.println(len);
		
	}
	
	static int storage(String s) {
		
		return 2 * s.length();
	} 
	
}
