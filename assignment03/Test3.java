package assignment03;

public class Test3 {

	public static void main(String[] args) {
		House house = new House();
		Space kitchen = new Space("Kitchen", 60.0);
		Space bathroom = new Space("Bathroom", 20.0);
		Space bedroom = new Space("Bedroom", 80.0);
		Space basement = new Space("Basement", 120.0);
		
		house.add(kitchen);
		house.add(bathroom);
		house.add(bedroom);
		house.add(basement);
		
		System.out.println(house);
		System.out.println("Total Area = "+house.totalArea()+"\n");
		
		House house1 = null; //null
		House house2 = new House(); //empty
		House house3 = new House();
		house3.add(null);
		house3.add(null);
		house3.add(null);
		House house4 = new House();
		house4.add(new Space("Kitchen", 80.0));
		house4.add(new Space("Bathroom", 40.0));
		house4.add(new Space("Bedroom", 100.0));
		House house5 = new House();
		house5.add(null);
		house5.add(null);
		house5.add(new Space("Kitchen", 75.0));
		house5.add(null);
		house5.add(new Space("Bathroom", 50.0));
		house5.add(null);
		house5.add(new Space("Bedroom", 160.0));
		
		House[] houses1 = null;
		House[] houses2 = {null,null,null};
		House[] houses3 = {house1,house2,house3,house4,house5};
		
		System.out.println(biggestFloorSpace(houses1));
		System.out.println(biggestFloorSpace(houses2));
		System.out.println(biggestFloorSpace(houses3));
	}
	
	public static House biggestFloorSpace(House[] houses) {
		House biggest = null;
		if(houses != null) {
			for(int i=0; i<houses.length; i++) {
				if(houses[i] != null) {
					if(biggest == null) {
						biggest = houses[i];
					} else if(houses[i].totalArea() > biggest.totalArea()) {
						biggest = houses[i];
					}
				}
			}
		}
		return biggest;
	}
}
