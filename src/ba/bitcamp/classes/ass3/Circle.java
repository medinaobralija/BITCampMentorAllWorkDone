package ba.bitcamp.classes.ass3;

import ba.bitcamp.classes.ass2.Point;

public class Circle {
	private double r;
	private Point centralPoint;

	public Circle(double r, Point centralPoint) {
		this.r = r;
		this.centralPoint = centralPoint;
	}

	/**
	 * This method change our attributes to String so that we can print them.
	 */
	public String toString() {
		String s = "";
		s = "r: " + r + "\n";
		s += "Central point: " + centralPoint + "\n";

		return s;
	}

	/**
	 * This method compare two point objects.
	 * 
	 * @param otherPoint
	 * @return
	 * 
	 *         Boolean value, they are equal or not.
	 */
	public boolean Equals(Circle otherCircle) {

		boolean isEqual;
		if (this.r == otherCircle.r
				&& this.centralPoint == otherCircle.centralPoint) {
			isEqual = true;
		} else {
			isEqual = false;
		}
		return isEqual;
	}

	/**
	 * Get radius.
	 * 
	 * @return
	 */
	public double getR() {
		return r;
	}

	/**
	 * Get circle central point.
	 * 
	 * @return
	 */
	public Point getCentralPoint() {
		return centralPoint;
	}

	/**
	 * Set radius.
	 * 
	 * @return
	 */
	public void setR(double r) {
		this.r = r;
	}

	/**
	 * Set circle central point.
	 * 
	 * @return
	 */
	public void setCentralPoint(Point centralPoint) {
		this.centralPoint = centralPoint;
	}

	/**
	 * This method calculates if these two circles intersect.
	 * 
	 * @param otherCircle
	 * @return
	 * 
	 *         Boolean value, intersect or not.
	 */
	public static boolean doIntersect(Circle otherCircle, Circle c) {
		boolean intersect;
		double distance = Point.calculateDistance(c.centralPoint,
				otherCircle.centralPoint);
		if (distance < c.r + otherCircle.r) {
			intersect = true;
		} else {
			intersect = false;
		}

		return intersect;
	}

}
