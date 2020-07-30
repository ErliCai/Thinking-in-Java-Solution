package Excercise6to10;

public class EX10 {
	
	public static void main(String[] args) {
		
		int a,b,c,d,m,n;
		
		for (int i=1000; i<10000; i++) {
			
			a = i/1000;
			b = (i%1000)/100;
			c = (i%100)/10;
		    d = (i%10);
		    
		    if (i == (a * 10 + b) * (c * 10 + d)
		    		|| i == (a * 10 + b) * (d * 10 + c)
		    		|| i == (b * 10 + a) * (c * 10 + d)
		    		|| i == (b * 10 + a) * (d * 10 + c)
		    		|| i == (a * 10 + c) * (b * 10 + d)
		    		|| i == (a * 10 + c) * (d * 10 + b)
		    		|| i == (c * 10 + a) * (b * 10 + d)
		    		|| i == (c * 10 + a) * (d * 10 + b)
		    		|| i == (a * 10 + d) * (c * 10 + b)
		    		|| i == (a * 10 + d) * (b * 10 + c)
		    		|| i == (d * 10 + a) * (c * 10 + b)
		    		|| i == (d * 10 + a) * (b * 10 + c)) {
		    	System.out.println(i);
		        }
		}
		
	}

}
