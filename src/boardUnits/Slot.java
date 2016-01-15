package boardUnits;

public class Slot {
	private boolean isPassed;
	private boolean isRightWallClosed;
	private boolean isLeftWallClosed;
	private boolean isTopWallClosed;
	private boolean isBottomWallClosed;
	
	// constructor
	public Slot(){
		this.setPassed(false);
		this.setRightWallClosed(false);
		this.setLeftWallClosed(false);
		this.setTopWallClosed(false);
		this.setBottomWallClosed(false);
	}
	
	// getter for private attributes
	public boolean isPassed() {
		return isPassed;
	}
	public boolean isRightWallClosed() {
		return isRightWallClosed;
	}
	public boolean isLeftWallClosed() {
		return isLeftWallClosed;
	}
	public boolean isTopWallClosed() {
		return isTopWallClosed;
	}
	public boolean isBottomWallClosed() {
		return isBottomWallClosed;
	}
	
	// setter for private attributes
	public void setPassed(boolean isPassed) {
		this.isPassed = isPassed;
	}
	public void setRightWallClosed(boolean isRightWallClosed) {
		this.isRightWallClosed = isRightWallClosed;
	}
	public void setLeftWallClosed(boolean isLeftWallClosed) {
		this.isLeftWallClosed = isLeftWallClosed;
	}
	public void setTopWallClosed(boolean isTopWallClosed) {
		this.isTopWallClosed = isTopWallClosed;
	}
	public void setBottomWallClosed(boolean isBottomWallClosed) {
		this.isBottomWallClosed = isBottomWallClosed;
	}
}
