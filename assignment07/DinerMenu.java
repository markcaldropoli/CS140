package assignment07;

import java.util.ArrayList;

public class DinerMenu implements Menu {
	private ArrayList<MenuEntry> menuEntries = new ArrayList<>();
	
	public DinerMenu() {
		addItem("Mac n Cheese", "Macaroni Pasta with Cheese", true, new Price(6,50));
		addItem("Cheeseburger", "Hamburger with Cheddar Cheese on a Bun", false, new Price(12,0));
		addItem("French Fries", "French Fies in a Basket", true, new Price(2,50));
		addItem("House Salad", "Mixed Greens with Italian Dressing", true, new Price(6,25));
		addItem("Pizza", "Cheese Pizza", true, new Price(4,25));
		addItem("Chicken Noodle Soup", "Soup with Chicken and Noodles", false, new Price(5,35));
	}
	
	@Override
	public MenuEntryIterator createIterator() {
		return new DinerMenuIterator(menuEntries.toArray(new MenuEntry[]{}));
	}
	
	public void addItem(String n, String d, boolean v, Price p) {
		menuEntries.add(new MenuEntry(n,d,v,p));
	}
}
