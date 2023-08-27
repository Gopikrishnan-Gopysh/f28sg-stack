class StackException extends RuntimeException{    
	public StackException(String err) {
		super(err);
	}
}

public class Stack implements StackADT {
	private Object[] S;
	private int top;
	private int capacity;
	
	private static int DEFAULT_SIZE = 100;
	
	public Stack(int size){
		capacity = size;
		S = new Object[size];
		top = -1;
	}

	/* 
	 * Stack myStack = new Stack();
	 * Stack myStack = new Stack(100000000);
	 */
	public Stack(){
		this(DEFAULT_SIZE);
	}
	
	/**
	 * @return true if there are no elements in the stack
	 */
	public boolean isEmpty(){
		// TODO
		return (top == -1);

		// return (top == -1) ? true : false; 

		
		/* 
		switch (top) {
		case -1 :
			return true;
		default :
			return false;
		}
		*/
		
		
	/*
		if (top < 0)
		{
			return true;
		}
		else {
			return false;
		}
	*/	
		
	}
	
	/**
	 * @return a count of the number of elements in the stack
	 */
	public int size(){
		return top + 1;
	}
	

	/** Adds a new element to the stack
	 * 
	 * @param e the object to add to the top of the stack
	 */
	public void push(Object e) throws StackException {
		if (capacity == size()) {
			throw new StackException("push: sorry, stack full");
		}
		else {
		int nextPosition = top + 1;
		S[nextPosition] = e;
		// top = top + 1;
		top++;
		}
		
		// check if it's at capacity
	}
	
	/** Removes an element from the top of the stack
	 * 
	 * @return the object that was at the top of the stack
	 * @throws StackException if the stack is empty
	 */
	public Object pop() throws StackException{
		if (isEmpty()) {
			throw new StackException("pop: sorry, empty stack.");
		} 
		else {
		Object myObject = S[top];
		top--;
		return myObject;
		}
	}
	
	/** Returns object at the top of the stack
	 * 
	 * @return the object at the top of the stack
	 * @throws StackException is the stack is empty
	 */
	public Object top() throws StackException{
		if (isEmpty()) {
			throw new StackException("top: sorry, empty stack.");
		} 
		else {
		return S[top];
		}
	}
	
	/** A helper method to pretty-print the elements in the stack
	 *
	 */
	public String toString(){
		StringBuffer buf = new StringBuffer("[");
		if(size() > 0)
			buf.append(S[0]);
		for(int i = 1; i <= top;i++){
			buf.append(", " + S[i]);
		}
		buf.append("]");
		return buf.toString();
	}
}
