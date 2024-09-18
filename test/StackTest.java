import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class StackTest {

	Stack st;
	@Before
	public void setup()
	{
		st = new Stack(2);
	}
	
	/* How do we know that Stack.java is correctly implemented?
	 * 
	 * We really need mechanised tests!
	 * 
	 * Below is one example of a unit test, the method under test
	 * is size() in the Stack class.
	 * 
	 * Part 1 of lab 1 is to write more tests to have confidence in
	 * other methods like: isEmpty, size, push, pop and top.
	 * 
	 * */
	
	/* this is an example to give you a clue for lab 1, part 1 */
	@Test
	public void exampleTest() {
		assertEquals(0, st.size());
	}
	@Test
	public void testPush() {
		st.push("A");
		st.push("B");
		System.out.println(st);
		assertEquals(2,st.size());

	}
	@Test
	public void testpop() {
		st.push("A");
		st.push("B");
		//assertEquals("B" st.pop());
		st.pop();
		assertEquals("A",st.pop());
	}
	@Test
	public void testtop() {
		st.push("A");
		st.push("B");

		assertEquals("B",st.top());
		assertEquals("B",st.top());
	}
}