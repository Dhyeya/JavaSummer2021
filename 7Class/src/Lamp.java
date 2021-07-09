
public class Lamp {
	
	public String lampSwitch = ReadUserInput.readUserStringInput("Switch on or off:");
	
	public void switchOn(boolean lampSwitch) {
		lampSwitch = true;
	}
	
	public void switchOff(boolean lampSwitch) {
		lampSwitch = false; 
	}
	
	public void isLampOn(boolean lampSwitch) {
		lampSwitch = false;
	}
}
