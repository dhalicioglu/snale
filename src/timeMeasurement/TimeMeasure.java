package timeMeasurement;

public class TimeMeasure {
	private double startTime;
	private double endTime;
	
	
	// methods
	
	// start timer
	public void startTimer(){
		this.setStartTime(System.currentTimeMillis());
	}
	// end timer
	public void endTimer(){
		this.setEndTime(System.currentTimeMillis());
	}
	
	
	
	// getters for private attributes
	public double getStartTime() {
		return startTime;
	}
	public double getEndTime() {
		return endTime;
	}
	
	
	// setters for private attributes
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}
}
