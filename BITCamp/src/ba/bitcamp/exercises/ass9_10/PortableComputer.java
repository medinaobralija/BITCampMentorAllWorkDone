package ba.bitcamp.exercises.ass9_10;

import ba.bitcamp.exercises.ass9.PersonalComputer;

public abstract class PortableComputer extends PersonalComputer{

	private double weight;
	private double displaySize;
	private boolean supportsWiFi;
	
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getDisplaySize() {
		return displaySize;
	}
	public void setDisplaySize(double displaySize) {
		this.displaySize = displaySize;
	}
	public boolean isSupportsWiFi() {
		return supportsWiFi;
	}
	public void setSupportsWiFi(boolean supportsWiFi) {
		this.supportsWiFi = supportsWiFi;
	}
	
	
	
}
