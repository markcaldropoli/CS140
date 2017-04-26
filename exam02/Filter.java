package exam02;

import java.util.ArrayList;

public class Filter {
	public static ArrayList<Integer> filter(ArrayList<Integer> list, BooleanFunction func) {
		ArrayList<Integer> temp = new ArrayList<>();
		for(int n : list) {
			if(func.apply(n)) {
				temp.add(n);
			}
		}
		return temp;
	}
}
