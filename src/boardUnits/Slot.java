package boardUnits;

public class Slot {
	private boolean isPassed;
	
	// constructor
	public Slot(){
		this.setPassed(false);
	}
	
	// getter for private attributes
	public boolean isPassed() {
		return isPassed;
	}

	// setter for private attributes
	public void setPassed(boolean isPassed) {
		this.isPassed = isPassed;
	}
}
