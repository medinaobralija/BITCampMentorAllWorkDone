package ba.bitcamp.exercises.ass9_11;

import ba.bitcamp.exercises.ass9_10.PortableComputer;

public class Laptop extends PortableComputer {

	private int numberOfBatteryCells;
	private boolean hasBluetooth;
	private boolean hasNumericalKeypad;

	public int getNumberOfBatteryCells() {
		return numberOfBatteryCells;
	}

	public void setNumberOfBatteryCells(int numberOfBatteryCells) {
		this.numberOfBatteryCells = numberOfBatteryCells;
	}

	public boolean isHasBluetooth() {
		return hasBluetooth;
	}

	public void setHasBluetooth(boolean hasBluetooth) {
		this.hasBluetooth = hasBluetooth;
	}

	public boolean isHasNumericalKeypad() {
		return hasNumericalKeypad;
	}

	public void setHasNumericalKeypad(boolean hasNumericalKeypad) {
		this.hasNumericalKeypad = hasNumericalKeypad;
	}

	public void printTypeInfo() {
		System.out
				.println("\nLaptop computers are made for global use, when it comes to portability."
						+ " \nTheir main characteristics are portability, connection possibility and battery.");

	}

}
