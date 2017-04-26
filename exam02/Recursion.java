package exam02;

import java.util.ArrayList;

public class Recursion {
	public static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}
		return gcd(b, a%b);
	}
	
	public static int maxElement(ArrayList<Integer> list) {
		//Assume not null and has at least one element
		if(list.size() == 1) {
			return list.get(0);
		}
		if(list.get(0) >= list.get(1)) {
			list.remove(1);
		} else {
			list.remove(0);
		}
		return maxElement(list);
	}
}
