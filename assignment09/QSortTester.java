package assignment09;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;

import org.junit.Test;

public class QSortTester {
	@Test
	public void testNullQSort() {
		assertNull(Sorting.qsort(null));
	}
	
	@Test
	public void testEmptyQSort() {
		assertEquals(new ArrayList<Integer>(), Sorting.qsort(new ArrayList<Integer>()));
	}
	
	@Test
	public void testSortedQSort() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		assertEquals(list, Sorting.qsort(list));
	}
	
	@Test
	public void testNonSortedQSort() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(7);
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(2);
		
		ArrayList<Integer> result = new ArrayList<>();
		result.add(1);
		result.add(2);
		result.add(3);
		result.add(4);
		result.add(7);
		
		assertEquals(result, Sorting.qsort(list));
	}
}
