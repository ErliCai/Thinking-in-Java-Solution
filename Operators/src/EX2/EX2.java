package EX2;

import static net.mindview.util.Print.*;

class f{
	
	float i;
	
}

public class EX2 {
	
	public static void main(String[] args) {
		
		f a = new f();
		f b = new f();
		
		a.i = 3.6f;
		b.i = 5.0f;
		
		print("a.i is: "+a.i);
		print("b.i is: "+b.i);
		
		a = b;
		print("a.i is: "+a.i);
		print("b.i is: "+b.i);
		
		a.i = 101f;
		print("a.i is: "+a.i);
		print("b.i is: "+b.i);
		
	}

}
