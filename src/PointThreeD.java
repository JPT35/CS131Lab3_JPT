/**
 * 
 * @author johnpaulthomas
 *	class PointThreeD
 */
public class PointThreeD {

	private double xPoint;
	private double yPoint;
	private double zPoint;
	
	
	public PointThreeD() {
		this.xPoint = 0.0;
		this.yPoint =0.0;
		this.zPoint = 0.0;
		
	}//end empty argument constructor
	
	public PointThreeD(double x, double y, double z) {
		xPoint = x;
		yPoint = y;
		zPoint = z;
		
	}//end preferred constructor

/**
 * getter for xPoint
 * @return
 */
public double getxPoint() {
	return xPoint;
}
/**
 * setter for xPoint
 * @param xPoint
 */
public void setxPoint(double xPoint) {
	this.xPoint = xPoint;
}
/**
 * getter for yPoint
 * @return
 */
public double getyPoint() {
	return yPoint;
}
/**
 * setter for yPoint
 * @param yPoint
 */
public void setyPoint(double yPoint) {
	this.yPoint = yPoint;
}
/**
 * getter for z point
 * @return
 */
public double getzPoint() {
	return zPoint;
}
/**
 * setter for z point
 * @param zPoint
 */
public void setzPoint(double zPoint) {
	this.zPoint = zPoint;
}
/**
 * toString method
 * 
 */
	@Override
	public String toString() {
		return "PointThreeD [xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint + "]";
	}//end toString
}//end class
