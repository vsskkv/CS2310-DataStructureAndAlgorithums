//************************************************************
//  LinearNode.java       Authors: Lewis/Chase (Modified by Wong)
//  @version 21-10-2010
//  Represents a node in a linked list.
//************************************************************
package jss2;

public class LinearNode<T>
{
	/* !!!! Add two fields here.
	 *      A LinearNode object keeps:
	 *      1. an element kept in a linear linked structure, and 
	 *      2. a reference to the LinearNode object which follows 
	 *         this object in the linear linked structure 
	 *         (i.e. the "follower" of this LinearNode object).  
	 */
	
	

	/**********************************************************
    Creates an empty node.
	 **********************************************************/
	public LinearNode()
	{
		/* !!!! Write Java code to initialise the two fields which
		 * 		you defined above.
		 */	
		
		
	}

	/**
	 * Creates a node storing the specified element.
	 * @param elem	the element that is to be kept in this LinearNode object
	 */
	/* !!!! Write Java code for defining a constructor for an LinearNode object.
	 * 		This constructor takes one parameter, which is the element that
	 * 		the newly created LinearNode object should keep. 
	 * 		This LinearNode object will not have a "follower".  
	 */	
	
	
	

	/**********************************************************
    Returns the node that follows this one.
	 **********************************************************/
	public LinearNode<T> getNext()
	{
		return next;
	}

	/**********************************************************
    Sets the node that follows this one.
	 **********************************************************/
	public void setNext (LinearNode<T> node)
	{
		next = node;
	}

	/**********************************************************
    Returns the element stored in this node.
	 **********************************************************/
	public T getElement()
	{
		return element;
	}

	/**********************************************************
    Sets the element stored in this node.
	 **********************************************************/
	public void setElement (T elem)
	{
		element = elem;
	}
}
