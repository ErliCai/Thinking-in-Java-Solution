package EX3to7;

class Dog{
	
	void Bark(){
		System.out.println("Wang!");
	}
	
	void Bark(String s){
		System.out.println(s);
	}
	
	void Bark(String s, int i){
		for (int j=1;j<=i;j++) {
			System.out.print(s);
			System.out.print("");
		}
	}
}

public class EX5 {
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.Bark();
		d.Bark("Miao");
		d.Bark("Cao ", 5);
		
	}

}
