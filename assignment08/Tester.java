package assignment08;

import static org.junit.Assert.assertEquals;

import java.awt.geom.Point2D;
import java.util.ArrayList;

import org.junit.Test;

public class Tester {

	@Test
	public void testGetArea1() {
		Rectangle r = new Rectangle(0,5);
		assertEquals(0*5, r.getArea());
	}
	
	@Test
	public void testGetArea2() {
		Rectangle r = new Rectangle(5,0);
		assertEquals(5*0, r.getArea());
	}
	
	@Test
	public void testGetArea3() {
		Rectangle r = new Rectangle(5,10);
		assertEquals(5*10, r.getArea());
	}
	
	@Test
	public void testFactorize1() {
		assertEquals(new ArrayList<Integer>(), Factorize.factors(0));
	}
	
	@Test
	public void testFactorize2() {
		assertEquals(new ArrayList<Integer>(), Factorize.factors(1));
	}
	
	@Test
	public void testFactorize3() {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(2);
		list1.add(2);
		list1.add(2);
		list1.add(3);
		list1.add(5);
		assertEquals(list1, Factorize.factors(120));
	}
	
	@Test
	public void testFactorize4() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(61);
		assertEquals(list, Factorize.factors(61));
	}
	
	@Test
	public void testBinary1() {
		assertEquals("0100110", Factorize.binary(38));
	}
	
	@Test
	public void testBinary2() {
		assertEquals("0100111", Factorize.binary(39));
	}
	
	@Test
	public void testReverseNull() {
		assertEquals("llun", Factorize.reverse(null));
	}
	
	@Test
	public void testReverseEmpty() {
		assertEquals("", Factorize.reverse(""));
	}
	
	@Test
	public void testReverse() {
		assertEquals("dneirf ,ereht ,olleH", Factorize.reverse("Hello, there, friend"));
	}
	
	@Test
	public void testIndexOfDoesNotContain() {
		assertEquals(-1, Factorize.indexOf("a", " "));
	}
	
	@Test
	public void testIndexOfContains() {
		assertEquals(10, Factorize.indexOf("aaaaaaaaaahello", "hello"));
	}
	
	@Test
	public void testArea1() {
		Point2D.Double[] pts = 
			{new Point2D.Double(1,3), new Point2D.Double(2, 2),
			new Point2D.Double(2, 1), new Point2D.Double(1, 0),
			new Point2D.Double(0, 1), new Point2D.Double(0, 2)};
		assertEquals(4.0, Factorize.area(pts), 0);
	}
	
	@Test
	public void testArea2() {
		Point2D.Double[] pts = 
			{new Point2D.Double(1,7), new Point2D.Double(2, 5),
			new Point2D.Double(2, 2), new Point2D.Double(1, 0)};
		assertEquals(5.0, Factorize.area(pts), 0);
	}
	
	@Test
	public void testArea3() {
		Point2D.Double[] pts =
			{new Point2D.Double(1, 7), new Point2D.Double(2, 5),
			new Point2D.Double(2, 2), new Point2D.Double(1, 0),
			new Point2D.Double(-1, 4)};
		assertEquals(12.0, Factorize.area(pts), 0);
	}
}
