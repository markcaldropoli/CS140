package assignment04;

import java.util.ArrayList;
import java.util.Arrays;

import assignment03.Space;

public class TestHouse {

	public static void main(String[] args) {
		House house1 = null; //null
		House house2 = new House(); //empty
		House house3 = new House();
		house3.add(new Space("Kitchen", 80.0));
		house3.add(new Space("Bathroom", 40.0));
		house3.add(new Space("Bedroom", 100.0));
		House house4 = new House();
		house4.add(new Space("Kitchen", 75.0));
		house4.add(new Space("Bathroom", 50.0));
		house4.add(new Space("Bedroom", 160.0));
		
		ArrayList<House> houses1 = null;
		ArrayList<House> houses2 = new ArrayList<>(Arrays.asList(null,null,null));
		ArrayList<House> houses3 = new ArrayList<>(Arrays.asList(house1,house2,house3,house4));
		
		System.out.println(biggestFloorSpace(houses1));
		System.out.println(biggestFloorSpace(houses2));
		System.out.println(biggestFloorSpace(houses3));
		
		System.out.println("\nIllegal Argument Exception:");
		House house5 = new House();
		house5.add(null);
	}
	
	public static House biggestFloorSpace(ArrayList<House> houses) {
		House biggest = null;
		if(houses != null) {
			for(int i=0; i<houses.size(); i++) {
				if(houses.get(i) != null) {
					if(biggest == null) {
						biggest = houses.get(i);
					} else if(houses.get(i).totalArea() > biggest.totalArea()) {
						biggest = houses.get(i);
					}
				}
			}
		}
		return biggest;
	}
}
