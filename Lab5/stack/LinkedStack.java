package stack;

/**
 * LinkedStack.java
 * Represents a linked implementation of a stack.
 * 
 * @author Chase/Lewis
 * @author A Barnes
 * @author S H S Wong
 * @version 20-10-2010
 * @param <T>
 */
public class LinkedStack<T> implements StackADT<T> {
	private LinearNode<T> top;
	private int count;

	/**
	 * Constructor: Creates a new empty stack
	 */
	public LinkedStack() {
		top = null;
		count = 0;
	}

	/* This stack is empty, if the top of the stack is null 
	 * (ie rather than a LinearNode object), 
	 * (non-Javadoc)
	 * @see dsaj.StackADT#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return top == null;
	}

	/* Returns the number of the elements in this stack.
	 * (non-Javadoc)
	 * @see dsaj.StackADT#size()
	 */
	@Override
	public int size() {
		return count;
	}

	/**
	 * Clears all the elements in the stack.
	 */
	public void clear() {
		top = null;
		count = 0;
	}

	/* Add the element at the top (or head) of the 
	 *  linked list of nodes
	 * (non-Javadoc)
	 * @see dsaj.StackADT#push(java.lang.Object)
	 */
	@Override
	public void push(T element) {
		LinearNode<T> tmp = new LinearNode<T>(element);
		tmp.setNext(top);
		top = tmp;
		count++;
	}

	/* Remove the element at the top (or head) of the 
	 *  linked list of nodes.
	 * (non-Javadoc)
	 * @see dsaj.StackADT#pop()
	 */
	@Override
	public T pop() {
		if (isEmpty())
			throw new IllegalStateException("Stack empty in pop");
		T result = top.getElement();
		top = top.getNext();
		count--;
		return result;
	}

	/* Return the element at the top of the linked list of nodes
	 *   without removing it.
	 * (non-Javadoc)
	 * @see dsaj.StackADT#peek()
	 */
	@Override
	public T peek() {
		if (isEmpty())
			throw new IllegalStateException("Stack empty in peek");
		return top.getElement();
	}
}
