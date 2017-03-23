package lab09green;

import java.util.ArrayList;

public class Question3 {
	private int num;
	
	public Question3(int n) {
		if(n < 0) {
			this.num = -n;
		} else {
			this.num = n;
		}
	}
	
	public int findNum() {
		if(num == 0 || num == 1) {
			return num;
		}
		int x=2;
		while(num%x != 0) {
			x++;
		}
		return x;
	}
	
	public ArrayList<Integer> decomp() {
		int temp = num;
		ArrayList<Integer> list = new ArrayList<>();
		if(num == 0 || num == 1) {
			return list;
		}
		while(num > 1) {
			list.add(findNum());
			num = num/findNum();
		}
		num = temp;
		return list;
	}
	
	@Override
	public String toString() {
		if(num == 0 || num == 1) {
			return num+" = "+num;
		}
		String output = num+" = "+decomp();
		output = output.replace(",", " x");
		output = output.replace("[", "").replace("]", "");
		return output;
	}
}
