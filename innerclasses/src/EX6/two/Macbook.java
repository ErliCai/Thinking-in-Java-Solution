package EX6.two;
import EX6.three.Computer;
import EX6.one.Mouse;;

public class Macbook extends Computer {
	Computer c = new Computer();
	TrackingPad t = c.trackingPad();
	public Mouse getMouse() {
		return t;
	}
	
}



class EX6 extends Computer{
	
	public Mouse getMouse2() {
		return this.new TrackingPad();
	}
	
}