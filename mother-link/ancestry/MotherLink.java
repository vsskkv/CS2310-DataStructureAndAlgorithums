/**
 * 
 */
package ancestry;

import jss2.LinearNode;
/**
 * To model a family line that involves only the females in the family.
 * The ancestry hierarchy is kept in a reverse order.
 * 
 * @author Sylvia Wong
 * @version 21/10/2010
 *
 */
public class MotherLink {

	// The current last in line within this motherlink.
	/* !!!! Define a field with the name "lastInLine" 
	 *      for keeping a LinearNode<Female> object. 
	 *      This variable keeps track of the last in line 
	 *      	in this mother link. 
	 */ 
	

	
	/**
	 * Constructor: Create a mother link with the first last in line.
	 * @param female	the first in line in this mother link
	 */
	public MotherLink(Female female) {
		
		/* !!!! Create a new LinearNode object for keeping the object
		 *      reference of the Female object as specified in
		 *      the parameter. This LinearNode object should now 
		 *      correspond to the current last in line this mother link. 
		 */

	}
	
	/**
	 * Add a female person to the next in line.
	 * @param daughter	the youngest female in the ancestry line
	 */
	public void addNextInLine(Female daughter)
	{
		/* !!!! Create a new LinearNode object to keep track of 
		 * 		the next last in line.
		 */

		
		/* !!!! Make the daughter link to her mother.
		 * 		The current last in line should become the next node of 
		 * 		the new last in line.
		 */

		
		// !!!! Make the daughter become the current last in line.

	}

	/**
	 * Return the number of people that are in this mother link.
	 * @return the size of the mother link.
	 */
	public int size()
	{
		int count = 0;
		
		/* !!!! To check the size, we need to go through the nodes within
		 * 		this mother link one by one and perform counting until the
		 *      end of the mother link.
		 * 		In order that we don't lose the current last in line, 
		 * 		we must NOT use the variable "lastInLine" directly during
		 * 		our counting process.
		 * 		Instead, we should define a local variable (call it "current") 
		 *      to keep track of the node that we are currently at. At the 
		 *      beginning, the variable "current" should keep the current
		 *      last in line. As the counting proceeds, "current" should 
		 *      move one node forward within the mother link. 
		 *      Don't forget to keep the counting going when we have not
		 *      yet hit the end of the mother link.  
		 */
		
		
		return count;
	}
	
	/**
	 * Return the contents of the mother link
	 * @return	all people in the mother link, starting from the youngest
	 */
	public String toString()
	{		
		String results = "This mother link "; 
		
		/* !!!! Write the missing Java statement(s) to produce the result
		 *		string as shown in the sample output.
		 */
		
		
		/* A local variable for keeping track of the number of tabs needed for
		 * 	displaying the reverse ancestry hierarchy.
		 */ 
		int tabCount = 1; 
			
		LinearNode<Female> current = lastInLine;
		
		/* !!!! Write a loop here to go through the nodes within
		 * 		mother link one by one. This process should be very
		 * 		similar to checking the size of the mother link. 
		 * 		The only difference is that as you move along the link,
		 * 		you need to append a new message to the output so as
		 * 		to ensure that the final output is a complete sentence. 
		 */

		
		
		
		return results;
	}
	
	/**
	 * The Main: 
	 * a quick test to see if this class has been implemented correctly.
	 * @param args
	 */
	public static void main(String[] args) {
		// create a mother link
		MotherLink link = new MotherLink(new Female("Angela"));
		// add a few people to the mother link
		link.addNextInLine(new Female("Belle"));
		link.addNextInLine(new Female("Clare"));
		link.addNextInLine(new Female("Dorothy"));
		link.addNextInLine(new Female("Emma"));
		// output the content of the mother link
		System.out.println(link);
	}

}
