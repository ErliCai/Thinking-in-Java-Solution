package EX11;

import interfaces.interfaceprocessor.Processor;

class Swap implements Processor{
	
	public String process(Object input) {
		String a = "";
		String s = (String) input;
		for (int i=0; i < s.length()-1 ;i+=2) {
			a += s.charAt(i+1);
			a += s.charAt(i);
			
		}
		if (s.length() % 2 == 1 )
			a += s.charAt(s.length()-1);
		
	    return a;
	}
	
	public String name() {
		
		return getClass().getSimpleName();
	}

	
	
}


public class EX11 {
	
	public static void main(String[] args) {
		
		String s = "abc";
		Swap a = new Swap();
		System.out.println(a.process(s));
		
	}

}
