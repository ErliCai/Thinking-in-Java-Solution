package EX11;

interface I{
	void P();
}

class Outer{
	private class Inner implements I{
		public void P() {
			System.out.print("inner");
		}
	}
	
	public I creatInner() {
		return new Inner();
	}
	
}


public class EX11 {
	
	public static void main(String args[]) {
		Outer o = new Outer();
		I i = o.creatInner();
		i.P();
		//! (Inner)i.P();
		// This shows the inner class is completely hidden
	}

}
