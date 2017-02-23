package lab06;

import java.util.ArrayList;

public class OneInt {
	private int one;

	public OneInt(int o) {
		this.one = o;
	}

	public int sum() {
		return one;
	}

	public String toString() {
		return ""+one;
	}

	public static int sumAll(ArrayList<OneInt> list) {
		int sum = 0;
		int countNull = 0;
		if(list == null) {
			return -1;
		} else if(list.size() == 0) {
			return 0;
		} else {
			for(OneInt element : list) {
				if(element != null) {
					sum+=element.sum();
				} else {
					countNull++;
				}
			}
		}
		if(countNull == list.size()) {
			return 0;
		} else {
			return sum;
		}
	}
}
