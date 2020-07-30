package EX12;

public class EX12 {
	
	public static void main(String[] args) {
		
		int a = -1;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(a <<= 10));
		for (int i=0;i<32;i++)
		System.out.println(Integer.toBinaryString(a >>>= 1));
		
	}

}
