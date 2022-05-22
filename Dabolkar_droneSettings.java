
public class Dabolkar_droneSettings {
	private int droneUp = 0;
	private int droneDown = 0;
	private int droneForward = 0; 
	private int droneBackward = 0;
	private int droneRight = 0;
	private int droneLeft = 0;
	private String droneOrientation;
	
	public Dabolkar_droneSettings() {
		
	}

	public int getDroneUp() {
		return droneUp;
	}

	public void setDroneUp(int droneUp) {
		droneUp++;
		this.droneUp = droneUp;
	}

	public int getDroneDown() {
		return droneDown;
	}

	public void setDroneDown(int droneDown) {
		droneDown++;
		this.droneDown = droneDown;
	}

	public int getDroneForward() {
		return droneForward;
	}

	public void setDroneForward(int droneForward) {
		droneForward++;
		this.droneForward = droneForward;
	}

	public int getDroneBackward() {
		return droneBackward;
	}

	public void setDroneBackward(int droneBackward) {
		droneBackward++;
		this.droneBackward = droneBackward;
	}

	public String getDroneOrientation() {
		return droneOrientation;
	}

	public void setDroneOrientation(String droneOrientation) {
		this.droneOrientation = droneOrientation;
	}

	public int getDroneRight() {
		return droneRight;
	}

	public void setDroneRight(int droneRight) {
		droneRight++;
		this.droneRight = droneRight;
	}

	public int getDroneLeft() {
		return droneLeft;
	}

	public void setDroneLeft(int droneLeft) {
		droneLeft++;
		this.droneLeft = droneLeft;
	}

}
