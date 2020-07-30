package EX17;

class Amphibian{
	protected void getSpecies(Amphibian a){
		System.out.println(a + " is Amphibian");
	}
}

class frog extends Amphibian{
	
    String name = "Frog";
    public String toString() {
    	return name;
    }
    
    @Override protected void getSpecies(Amphibian a){
		System.out.println(a + " is Amphibian");
		System.out.println("123");
	}
	
}

public class EX17 {
	
	public static void main(String[] args) {
		
		frog f = new frog();
		f.getSpecies(f);
	}

}
