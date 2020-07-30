package EX3to7;

class Dog2{
	
	void Bark(){
		System.out.println("Wang!");
	}
	
	void Bark(String s){
		System.out.println(s);
	}
	
	void Bark(String s, int i){
		for (int j=1;j<=i;j++) {
			System.out.print(s);
		}
		System.out.println("");
	}
	
	void Bark(int i, String s){
		System.out.print(i +"*"+ s);
	}
}

public class EX6 {
	
	public static void main(String[] args) {
		Dog2 d = new Dog2();
		d.Bark();
		d.Bark("Miao");
		d.Bark("Cao ", 5);
		d.Bark(5, "Cao");
	}

}