package EX16;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

class AdaptedRandomChar extends RandomChar implements Readable{
	private int count;
	public AdaptedRandomChar(int count) {
		this.count = count;
	}	
	
	public int read(CharBuffer cb)  {
		if(count-- == 0) return -1;
		String result = Character.toString(next());
		cb.append(result);
		return result.length();
	}
	
	
	
}

public class EX16v2 {
	
	public static void main(String[] args) {
		System.out.print(1 + Character.toString(RandomChar.next()));
		
		Scanner s = new Scanner(new AdaptedRandomChar(12));
		while(s.hasNext())
			System.out.println(s.next() + " ");
		}
	}

//public class EX16v2
//extends RandomChar 
//implements Readable {
//private int count;
//public EX16v2(int count) {
//this.count = count;
//}			
//public int read(CharBuffer cb) {
//if(count-- == 0) return -1;
//String result = Character.toString(next()) + " ";
//cb.append(result);
//return result.length();
//}
//public static void main(String[] args) {
//Scanner s = new Scanner(new EX16v2(10));
//while(s.hasNext())
//	System.out.println(s.next() + " ");
//}
//}
