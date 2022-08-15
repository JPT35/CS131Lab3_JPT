/**
 * 
 * @author johnpaulthomas
 * class Square
 */
public class Square {

	private double side;
	/**
	 * empty argument constructor
	 */
	public Square() {
		
	}//end empty argument constructor
	/**
	 * preferred constructor
	 * @param side
	 */
	public Square(double side) {
		this.side=side;
	}//end preferred constructor
	/**
	 * getter for Area 
	 * @return
	 */
	public double getArea() {
		return (side * side);
		
	}//end getArea
/**
 * getter for side
 * @return
 */
	public double getSide() {
		return side;
	}
	/**
	 * setter for side
	 * @param side
	 */
	public void setSide(double side) {
		this.side = side;
	}
	/**
	 * toString method
	 */
	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}// end toString

	
	
}//end class
