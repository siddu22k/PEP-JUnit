package removeA;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestA {

	@Test
	public void test() {
		RemoveA test = new RemoveA();
		String op = test.removingFirst2A("ABC");
		assertEquals(op,"BC");
		
	
	}
		
			
	@Test
	public  void test1() {
		RemoveA test = new RemoveA();
		String op = test.removingFirst2A("ABCD");
		assertEquals("BCD",op);
	}
	@Test	
	public void test2() {
		RemoveA test = new RemoveA();
		String op = test.removingFirst2A("AACD");
		assertEquals("CD",op);
	}
	@Test		
	public void test3() {
		RemoveA test = new RemoveA();
		String op = test.removingFirst2A("BACD");
		assertEquals("BCD",op);
	}
	@Test
	public void test4() {
		RemoveA test = new RemoveA();
		String op = test.removingFirst2A("BBAA");
		assertEquals("BBAA",op);

}
}
