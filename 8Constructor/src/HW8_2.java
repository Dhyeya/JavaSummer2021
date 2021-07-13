
public class HW8_2 {
	public static void main(String[] args) {
		boolean lampSwitch = false;
		String powerControl = ReadUserInput.readUserStringInput("On or off?");
		if (powerControl.equalsIgnoreCase("on")) {
			switchOn(lampSwitch);
			lampSwitch = true;
			isLampOn(lampSwitch);
		} else if (powerControl.equalsIgnoreCase("off")) {
			switchOff(lampSwitch);
			lampSwitch = false;
			isLampOn(lampSwitch);
		}
	}
	
	public static boolean switchOn(boolean lampSwitch) {
		lampSwitch = true;
		return lampSwitch;
	}
	
	public static boolean switchOff(boolean lampSwitch) {
		lampSwitch = false;
		return lampSwitch;
	}
	
	public static boolean isLampOn(boolean lampSwitch) {
		if(lampSwitch = true) {
			System.out.println("Lamp is on.");
		} else if (lampSwitch = false) {
			System.out.println("Lamp is off.");
		}
		return lampSwitch;
	}
}
