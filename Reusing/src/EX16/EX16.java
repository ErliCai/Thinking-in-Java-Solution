package EX16;

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
	
}

public class EX16 {
	
	public static void main(String[] args) {
		
		frog f = new frog();
		f.getSpecies(f);
	}

}
