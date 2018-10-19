/**
 * 
 */
package game;

import java.util.ArrayList;
/* !!!! There is an import statement missing here.
 */

import java.util.Random;

/**
 * This is a generic class which works like a collection. 
 * 
 * A box can keep a collection of items. 
 * The items within the box are not ordered in any logic order.
 * Each box has an unlimited capacity.
 * 
 * @author S H S Wong
 * @version 4 Oct 2012
 */

/* !!!!
 *  
 * 1. Class Box is intended to be a generic class.
 * 
 * 2. An enhanced for statement is expected to be used 
 *    to iterate through the items kept in a Box object.
 *    Class Box is therefore expected to implement a certain interface.
 *    Modify the header of the class Box to meet this requirement.
 */
public class Box {
	
	/* !!!! The ArrayList object is intended to keep 
	 * a generic type of items. 
	 * Modify the following instance variable declaration
	 * 	so as to enable ArrayList to work a generic type of objects.
	 */ 
	private ArrayList contents; // Models the contents of the box
	
	/**
	 * Constructor
	 */
	public Box() {
		/* !!!! Write an assignment statement 
		 * to initialise the value of the instance variable here.
		 */
		
	}
	
	/**
	 * Draws an item from the box. 
	 * When the item is drawn, it is physically removed from the box. Its
	 * 	object reference is returned as a result.
	 * 
	 * If the box is empty, this method will simply return null.
	 * 
	 * @return
	 */
	public T draw() {
		
		T drawnItem = null;
		
		if(!contents.isEmpty()) {
			/* Use a random number generator to determine which item is to
			 * be drawn from the box.
			 */ 
			Random randomizer = new Random();
			int which = randomizer.nextInt(contents.size());
			drawnItem = contents.remove(which);
		}
		
		return drawnItem;
	}
	
	/**
	 * Puts an item into the box.
	 * @param item
	 */
	public void put(T item) {
		contents.add(item);
	}

	/**
	 * Returns true if the specified item is currently in the box.
	 * Returns false otherwise.
	 * @param item
	 * @return
	 */
	public boolean find(T item) {
		return contents.contains(item);
	}

	/* !!!! As class Box is expected to implement a certain interface,
	 * it is therefore responsible for implementing the abstract method(s)
	 * inherited from that interface.
	 * 
	 * Provide an implementation for the inherited abstract method(s).
	 *  
	 * (non-Javadoc)
	 * @see java.lang.Iterable#iterator()
	 */
	
	
	
	/**
	 * Returns true if the box is empty.
	 * Returns false otherwise. 
	 * @return
	 */
	public boolean isEmpty() {
		
		/* !!!! There is a single return statement missing in this
		 * method. How can we determine if the box is empty?
		 * Complete the implementation.
		 */
		
	}
}
