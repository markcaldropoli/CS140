package assignment09;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class SelectionTester {
	
	@Test
	public void testNullSelection() {
		assertNull(Sorting.selection(null));
	}
	
	@Test
	public void testEmptySelection() {
		assertEquals(new ArrayList<Integer>(), Sorting.selection(new ArrayList<Integer>()));
	}
	
	@Test
	public void testNonEmptySelection() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(7);
		list.add(3);
		list.add(4);
		list.add(1);
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(1);
		result.add(3);
		result.add(4);
		result.add(7);
		
		assertEquals(result, Sorting.selection(list));
	}
}
