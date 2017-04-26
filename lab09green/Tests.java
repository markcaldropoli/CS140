package lab09green;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {
	@Test
	public void testAverage() {
		int[] test1 = null;
		int[] test2 = {};
		int[] test3 = {5, 2, -3, 0, -4, 3};
		
		assertEquals(0, new Parent(test1).average(), 0);
		assertEquals(0, new Parent(test2).average(), 0);
		assertEquals(0.5, new Parent(test3).average(), 0);
		
		assertEquals(0, new Child(test1,test2).average(), 0);
		assertEquals(0, new Child(test2,test1).average(), 0);
		assertEquals(0, new Child(test3,test1).average(), 0);
		assertEquals(0.5, new Child(test1,test3).average(), 0);
		assertEquals(0.5, new Child(test2,test3).average(), 0);
		assertEquals(0, new Child(test3,test2).average(), 0);
	}
	
	@Test
	public void testMin() {
		int[] test1 = null;
		int[] test2 = {};
		int[] test3 = {5, 2, -3, 0, -4, 3};
		
		assertEquals(2147483647, new Parent(test1).min());
		assertEquals(2147483647, new Parent(test2).min());
		assertEquals(-4, new Parent(test3).min());
		
		assertEquals(2147483647, new Child(test1,test2).min());
		assertEquals(2147483647, new Child(test2,test1).min());
		assertEquals(-4, new Child(test1,test3).min());
		assertEquals(-4, new Child(test3,test1).min());
		assertEquals(-4, new Child(test2,test3).min());
		assertEquals(-4, new Child(test3,test2).min());
	}
	
	@Test
	public void testToString() {
		int int1 = 0, int2 = 1, int3 = 31, int4 = 2310;
		assertEquals("0 = 0", new Question3(int1).toString());
		assertEquals("1 = 1", new Question3(int2).toString());
		assertEquals("31 = 31", new Question3(int3).toString());
		assertEquals("2310 = 2 x 3 x 5 x 7 x 11", new Question3(int4).toString());
	}
}
