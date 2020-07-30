package Excercise6to10;

public class EX6 {
	
	static boolean test(int begin, int end,int testval){
		
		if (testval <= end && testval >= begin)
			return true;
		else
			return false;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(test(5,10,5));
		System.out.println(test(7,8,5));
	}

}
