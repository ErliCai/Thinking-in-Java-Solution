package EX11;

/**
 * 
 * <ol>
 * <li> This is a test of the comment
 * <li> in the form of ordered list
 * </ol>
 * 
 * @author cai
 *
 */

class AllTheColorsOfTheRainbow{
	int anIntegerRepresentingColor;
	void changeTheHueOfTheColor(int Hue){
		anIntegerRepresentingColor = Hue;
	}
}

public class EX11 {
	
	public static void main(String[] args) {
		
		AllTheColorsOfTheRainbow Rainbow = new AllTheColorsOfTheRainbow();
		Rainbow.changeTheHueOfTheColor(2);
		System.out.println(Rainbow.anIntegerRepresentingColor);
		
	}
}
