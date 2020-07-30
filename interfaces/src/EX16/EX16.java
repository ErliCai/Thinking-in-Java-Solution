package EX16;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

class RandomChar{
	
	private static Random rand = new Random(47);
	private static final char[] capitals =
		    "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	public static char next() {
		char a ;

		a = capitals[rand.nextInt(capitals.length)];
		
		return a;
	}
	
}


public class EX16 {
	
	public static void main(String[] args) {
		
		System.out.println(RandomChar.next());
		System.out.println(RandomChar.next());
	}
}


