package EX14;


class CompareString{
	String a,b;
	public CompareString(String a, String b){
		
		this.a = a;
		this.b = b;
	}
	
	public void Compare(){
		
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a.equals(b));
		//System.out.println(!b);
	}
	
	
	
}

public class EX14 {
	
	public static void main(String[] args) {
		
		String a = "caierli";
		String b = "xlt";
		
		CompareString T = new CompareString(a,b);
		T.Compare();
		
	}


}
