package assignment09;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class InOrderTester {
	@Test
	public void testNullInOrder() {
		assertEquals(true, Sorting.inOrder(null));
	}
	
	@Test
	public void testEmptyInOrder() {
		assertEquals(true, Sorting.inOrder(new ArrayList<Integer>()));
	}
	
	@Test
	public void testArrayListInOrder() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		assertEquals(true, Sorting.inOrder(list));
	}
	
	@Test
	public void testArrayListNotInOrder() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(7);
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(2);
		
		assertEquals(false, Sorting.inOrder(list));
	}
}
