package assignment07;

public class Tester {
	public static void main(String[] args) {
		//Test Price Class
		MenuEntry me = new MenuEntry("Steamed Veggies and Brown Rice", "Steamed vegetables over brown rice",
				true, new Price(3,99));
		System.out.println(me);
		
		System.out.println();
		
		//Test A Menu
		PancakeMenu pancakeMenu = new PancakeMenu();
		DinerMenu dinerMenu = new DinerMenu();
		Server server = new Server(pancakeMenu, dinerMenu);
		server.printMenu();
		server.printVegetarianMenu();
		
		System.out.println("\nCustomer asks, is the Cheeseburger vegetarian?");
		System.out.println("Server says: ");
		System.out.println(server.isEntryVegetarian("Cheeseburger")?"Yes":"No");
		System.out.println("\nCustomer asks, are the Chocolate Chip Pancakes vegetarian?");
		System.out.println("Server says: ");
		System.out.println(server.isEntryVegetarian("Chocolate Chip Pancakes")?"Yes":"No");
		
		System.out.println();
		
		//Test changePrices
		changePrices(pancakeMenu);
		changePrices(dinerMenu);
		server.printMenu();
	}
	
	//Test changeDown & changeUp
	public static void changePrices(Menu menu) {
		for(MenuEntry menuEntry : menu.createIterator().toIterable()) {
			if(menuEntry.isVegetarian()) {
				menuEntry.changeDown(5);
			} else {
				menuEntry.changeUp(10);
			}
		}
	}
}
