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
	
	public Stack(int maxCapacity){
		capacity = maxCapacity;
		S = new Object[maxCapacity];
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
		return top<0;	
	}
	
	/**
	 * @return a count of the number of elements in the stack
	 */
	public int size(){
		// TODO
		return top+1;
	}
	

	/** Adds a new element to the stack
	 * 
	 * @param e the object to add to the top of the stack
	 */
	public void push(Object e) throws StackException {
		// TODO
	if(size()==capacity)
		throw new StackException ("stack is full");
	S[++top] = e;
	}
	
	/** Removes an element from the top of the stack
	 * 
	 * @return the object that was at the top of the stack
	 * @throws StackException if the stack is empty
	 */
	public Object pop() throws StackException{
		if(isEmpty())
			throw new StackException("stack is empty");
		return S[top--];
	}
	
	/** Returns object at the top of the stack
	 * 
	 * @return the object at the top of the stack
	 * @throws StackException is the stack is empty
	 */
	public Object top() throws StackException{
		// TODO
		return S[top];
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
