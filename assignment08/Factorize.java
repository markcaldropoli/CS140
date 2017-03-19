package assignment08;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Arrays;

public class Factorize {
	
	public static ArrayList<Integer> factors(int n) {
		if(n == 0 | n == 1) {
			return new ArrayList<Integer>();
		}
		if(n < 0) {
			throw new IllegalArgumentException("n cannot be negative.");
		}
		if(n == 2) {
			ArrayList<Integer> temp = new ArrayList<>();
			temp.add(2);
			return temp;
		}
		ArrayList<Integer> temp = new ArrayList<>();
		int f = 2;
		while(n % f != 0 && n != f) {
			f++;
		}
		temp.add(f);
		temp.addAll(factors(n/f));
		return temp;
	}
	
	public static String binary(int n) {
		if(n < 0) {
			throw new IllegalArgumentException("n must be positive.");
		}
		if(n > 0 && n % 2 == 0) {
			return binary(n/2) + "0";
		} else if(n > 0 && n % 2 != 0) {
			return binary(n/2) + "1";
		}
		return "0";
	}
	
	public static String reverse(String text) {
		if(text == null) {
			return "llun";
		}
		if(text.length() == 0) {
			return "";
		}
		return text.substring(text.length()-1) + reverse(text.substring(0, text.length()-1));
	}
	
	public static int indexOf(String text, String str) {
		if(!text.contains(str)) {
			return -1;
		} else {
			return indexOf(0, text, str);
		}
	}
	
	public static int indexOf(int count, String text, String str) {
		if(text.startsWith(str)) {
			return count;
		} else {
			count++;
			return indexOf(count, text.substring(1), str);
		}
	}
	
	public static double area(Point2D.Double[] pts) {
		int len = pts.length;
		if(len >= 3) {
			double area = Math.abs(pts[0].getX()*pts[1].getY()+pts[1].getX()*pts[len-1].getY()+pts[len-1].getX()*pts[0].getY()-pts[0].getY()*pts[1].getX()-pts[1].getY()*pts[len-1].getX()-pts[len-1].getY()*pts[0].getX())/2;
			return area + area(Arrays.copyOfRange(pts, 1, len));
		} else {
			return 0;
		}
	}
}
