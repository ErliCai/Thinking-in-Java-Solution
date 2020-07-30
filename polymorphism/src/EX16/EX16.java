package EX16;

class Alert{
	
	int showAlertLevel() {return 0;};
}

class GreenAlert extends Alert{
	@Override int showAlertLevel() {
		System.out.println("Stay calm, everything is OK.");
		return 1;
	}
}

class YellowAlert extends Alert{
	@Override int showAlertLevel() {
		System.out.println("Watch out, we are in trouble!");
		return 2;
	}
}

class RedAlert extends Alert{
	@Override int showAlertLevel() {
		System.out.println("Emergency Alarm, we are doomed");
		return 3;
	}
}

class SpaceShip{
	Alert a = new GreenAlert();
	void raiseAlert() {
		if (a.showAlertLevel() == 1)
			a = new YellowAlert();
		else
			a = new RedAlert();
	}
	
	void decreaseAlert() {
		if (a.showAlertLevel() == 3)
			a = new YellowAlert();
		else
			a = new GreenAlert();
	}
	
	void showAlert() {
		a.showAlertLevel();
	}
	
}

public class EX16 {
	
	public static void main(String[] args) {
		
		SpaceShip s = new SpaceShip();
		s.showAlert();
		s.raiseAlert();
		s.showAlert();
		
	}

}
