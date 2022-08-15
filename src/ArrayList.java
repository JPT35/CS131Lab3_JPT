
import java.util.*;
/**
 * 
 * @author johnpaulthomas
 *
 * @param <T>
 */
public class ArrayList<T>  {

	private final int DEFAULT_SIZE=10;
   	private int currentItem=0;
   	private T arList[];
	
   	@SuppressWarnings("unchecked")
	public ArrayList()
	{   
   		this.currentItem = 0;
   		
   	/*
   	 * The code below will cause a compile error because T is cast to object
   	 * if we cast object to whatever T is (like a String) we will cause a runtime error.
   	 * We could use a java collection like ArrayList for this.     
   	 */
	// arList=new T[DEFAULT_SIZE];                                        				  	
			  
    //this is the proper way to initialize this object using a call to new Object.                                                            	    	                                      				 		                                                                                         		
	arList=(T[]) new Object[DEFAULT_SIZE];
    }//end empty-argument constructor 

  @SuppressWarnings("unchecked")
    public ArrayList(int length)
    {
	  // arList=new T[length]; //causes a compile error (see above)
	  arList=(T[]) new Object[length];
	  this.currentItem = 0;
	  
    }//end preferred constructor
  /**
   * addItem method
   * @param item
   * @return
   */
  public boolean addItem(T item) {
	  
	  
	  if(currentItem<DEFAULT_SIZE) {
	  this.arList[currentItem++] = item;
	   
	  
		return true; 	  
	  }
	  	
	  	return false;
  }//end addItem
/**
 * toString method 
 */
@Override
public String toString() {
	return "ArrayList [DEFAULT_SIZE=" + DEFAULT_SIZE + ", currentItem=" + currentItem + ", arList="
			+ Arrays.toString(arList) + "]";
}//end toString
  
}//end class

