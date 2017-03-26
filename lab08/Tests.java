package lab08;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class Tests {
	private static final double DELTA = 1e-6;
	
	@Test
	public void testFactorialSimple1() {
	    assertEquals(1, Recursion.factorial(0));
	}
	
	@Test
	public void testFactorialSimple2() {
	    assertEquals(1, Recursion.factorial(1));
	}
	
	@Test
	public void testFactorialSimple3() {
	    assertEquals(120, Recursion.factorial(5));
	}
	
	@Test
	public void testSquareRoot1() {
		assertEquals(0.0, Recursion.squareRoot(0), DELTA);
	}
	
	@Test
	public void testSquareRoot2() {
		assertEquals(9.0, Recursion.squareRoot(81.0), DELTA);
	}
	
	@Test
	public void testSumArrayList() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		assertEquals(6, Recursion.sum(list));
	}
	
	@Test
	public void testSumArray() {
		int[] list = {1,2,3};
		assertEquals(6, Recursion.sum(list));
	}
	
	@Test
	public void testBinomialCoefficient1() {
		int n = 6, k = 2;
		assertEquals(15, Recursion.binomialCoefficient(n, k));
	}
	
	@Test
	public void testBinomialCoefficient2() {
		int n = 10, k = 6;
		assertEquals(210, Recursion.binomialCoefficient(n, k));
	}
}
