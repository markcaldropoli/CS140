package assignment08;

import static org.junit.Assert.assertEquals;

import java.awt.geom.Point2D;
import java.util.ArrayList;

import org.junit.Test;

public class Tester {

	@Test
	public void testGetArea() {
		Rectangle r1 = new Rectangle(0,5);
		Rectangle r2 = new Rectangle(5,0);
		Rectangle r3 = new Rectangle(5,10);
		assertEquals(0*5, r1.getArea());
		assertEquals(5*0, r2.getArea());
		assertEquals(5*10, r3.getArea());
	}
	
	@Test
	public void testFactorize() {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(2);
		list1.add(2);
		list1.add(2);
		list1.add(3);
		list1.add(5);
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(61);
		assertEquals(new ArrayList<Integer>(), Factorize.factors(0));
		assertEquals(new ArrayList<Integer>(), Factorize.factors(1));
		assertEquals(list1, Factorize.factors(120));
		assertEquals(list2, Factorize.factors(61));
	}
	
	@Test
	public void testBinary() {
		assertEquals("0100110", Factorize.binary(38));
		assertEquals("0100111", Factorize.binary(39));
	}
	
	@Test
	public void testReverse() {
		assertEquals("llun", Factorize.reverse(null));
		assertEquals("", Factorize.reverse(""));
		assertEquals("dneirf ,ereht ,olleH", Factorize.reverse("Hello, there, friend"));
	}
	
	@Test
	public void testIndexOf() {
		assertEquals(-1, Factorize.indexOf("a", " "));
		assertEquals(10, Factorize.indexOf("aaaaaaaaaahello", "hello"));
	}
	
	@Test
	public void testArea() {
		Point2D.Double[] pts = 
			{new Point2D.Double(1,3), new Point2D.Double(2, 2),
			new Point2D.Double(2, 1), new Point2D.Double(1, 0),
			new Point2D.Double(0, 1), new Point2D.Double(0, 2)};
		Point2D.Double[] pts2 = 
			{new Point2D.Double(1,7), new Point2D.Double(2, 5),
			new Point2D.Double(2, 2), new Point2D.Double(1, 0)};
		Point2D.Double[] pts3 =
			{new Point2D.Double(1, 7), new Point2D.Double(2, 5),
			new Point2D.Double(2, 2), new Point2D.Double(1, 0),
			new Point2D.Double(-1, 4)};
		assertEquals(4.0, Factorize.area(pts), 0);
		assertEquals(5.0, Factorize.area(pts2), 0);
		assertEquals(12.0, Factorize.area(pts3), 0);
	}
}
