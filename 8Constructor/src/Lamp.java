
public class Lamp {
	

	public static void main(String[] args) {
			boolean lampSwitch = false;
		String powerControl = ReadUserInput.readUserStringInput("On or off?");
		if (powerControl.equalsIgnoreCase("on")) {
			lampSwitch = switchOn();
		} else if (powerControl.equalsIgnoreCase("off")) {
			lampSwitch = switchOff();
		}
		isLampOn(lampSwitch);
	}
	
	public static boolean switchOn() {
		return true;
	}
	
	public static boolean switchOff() {
		return false;
	}
	
	public static void isLampOn(boolean lampSwitch) {
		if(lampSwitch == true) {
			System.out.println("Lamp is now on.");
		} else if (lampSwitch == false) {
			System.out.println("Lamp is now off.");
		}
	}
}	
