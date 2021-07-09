
public class Lamp {
	// switchOn
	boolean switchOn;

	public void setSwitchOn(boolean lampSwitch, boolean switchOn) {
		this.switchOn = switchOn;
	}
	
	public boolean getSwitchOn() {
		return switchOn;
	}
	
	// switchOff
	boolean switchOff;
	
	public void setSwitchOff(boolean lampSwitch, boolean switchOff) {
		this.switchOff = switchOff;
	}
	
	public boolean getSwitchOff(boolean lampSwitch) {
		return switchOff;
	}
	
	//	isLampOn
	boolean isLampOn;
	
	public void setIsLampOn(boolean lampSwitch, boolean isLampOn) {
		this.isLampOn = isLampOn;
	}
	
	public boolean getIsLampOn(boolean lampSwitch) {
		return isLampOn;
	}
}
