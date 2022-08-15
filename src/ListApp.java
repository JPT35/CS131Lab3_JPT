/**
 * 
 * @author johnpaulthomas
 *	Application class for testing
 *	the addItem method in the ArrayList class is tested for adding items to three different list types
 *	toString is used to display the ArrayList and added information
 *	empty slots in the array are "null"
 *	currentItem in toString counts how many slots have been filled
 *	
 */
public class ListApp {

	public static void main(String[] args) {
		
	ArrayList<PointThreeD>pointList = new ArrayList<>();
	
		pointList.addItem(new PointThreeD(2.0, 4.0, 6.0));
		pointList.addItem(new PointThreeD(3.0, 4.0, 9.0));
		pointList.addItem(new PointThreeD(1.0, 2.0, 10.0));
	
	System.out.println(pointList.toString());
	
	ArrayList<Square>squareList = new ArrayList<>();
	
		squareList.addItem(new Square(14.0));
		squareList.addItem(new Square(12.0));
		squareList.addItem(new Square(10.0));
	
	System.out.println(squareList.toString());
	
	ArrayList<String>stringList = new ArrayList<>();
	
		stringList.addItem("One");
		stringList.addItem("Two");
		stringList.addItem("Three");
		stringList.addItem("Four");
		stringList.addItem("Five");
		stringList.addItem("Six");
		stringList.addItem("Seven");
		stringList.addItem("Eight");
		stringList.addItem("Nine");
		stringList.addItem("Ten");
	
	System.out.println(stringList.addItem("Eleven"));
	
	System.out.println(stringList.toString());
	
	}//end main method

}//end class
