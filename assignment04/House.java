package assignment04;

import java.util.ArrayList;

import assignment03.Space;

public class House {
	private ArrayList<Space> spaces = new ArrayList<>();
	
	/**
	 * Adds non-null Spaces to the arraylist of Spaces.
	 * If a Space is null, an IllegalArgumentException is thrown.
	 * @param sp the space to be added to the arraylist
	 */
	public void add(Space sp) {
		if(sp == null) {
			throw new IllegalArgumentException("Rooms cannot be null");
		} else {
			spaces.add(sp);
		}
	}
	
	/**
	 * Calculates the total area of the Spaces within the arraylist spaces.
	 * @return a double containing the total area of the spaces within the
	 * arraylist spaces
	 */
	public double totalArea() {
		double totalArea = 0;
		for(int i=0; i<spaces.size(); i++) {
			totalArea += spaces.get(i).getArea();
		}
		return totalArea;
	}
	
	/**
	 * Converts the arraylist to an easy to read String
	 */
	public String toString() {
		return spaces.toString();
	}
}
