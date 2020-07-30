package EX10;

public class EX10 {
	
	public static void main(String[] args) {
		
		int a = 0xaa;
		int b = 0x5;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(a&b));
		System.out.println(Integer.toBinaryString(a|b));
		System.out.println(Integer.toBinaryString(a^b));
		System.out.println(Integer.toBinaryString(a^a));
		System.out.println(Integer.toBinaryString(~a));
	}

}
