package EX6.three;

import EX6.one.*;

public class Computer {

	protected class TrackingPad implements Mouse{
		// need public constructor here
		public TrackingPad(){
			
		}
		
		
		@Override
		public int dpi() {
			return 1000;
		}
	}	
	
	public TrackingPad trackingPad() {
		return new TrackingPad();
	}
	
}
