package assignment03;

import java.util.Arrays;

public class House {
	private Space[] spaces = new Space[3];
	private int nextIndex = 0;
	
	public void add(Space sp) {
		spaces[nextIndex] = sp;
		nextIndex++;
		if(nextIndex == spaces.length) {
			spaces = Arrays.copyOf(spaces, spaces.length*2);
		}
	}
	
	public double totalArea() {
		int totalArea = 0;
		for(int i=0; i<spaces.length && spaces[i] != null; i++) {
			totalArea += spaces[i].getArea();
		}
		return totalArea;
	}
	
	public String toString() {
		return Arrays.toString(spaces);
	}
}
