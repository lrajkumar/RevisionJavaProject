package InheritanceOOps;

public class MotorCycle extends Cycle {
	public String Speed (int speed) {
		if(speed > 60) {
			return "High Speed";
		}
		else {
			return "Moderate Speed";
		}
	}

}
