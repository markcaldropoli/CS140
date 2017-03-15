package assignment07;

import java.util.ArrayList;

public class PancakeMenu implements Menu {
	private ArrayList<MenuEntry> menuEntries = new ArrayList<>();
	
	public PancakeMenu() {
		addItem("Plain Pancakes", "Fluffy Buttermilk Pancakes", true, new Price(1,00));
		addItem("Chocolate Chip Pancakes", "Fluffy Buttermilk Pancakes with Chocolate Chips", true, new Price(5,05));
		addItem("Plain Waffle with Syrup", "Buttermilk Waffle Served with Syrup", true, new Price(4,75));
		addItem("Waffle and Chicken", "Buttermilk Waffle Served with a Side of Chicken", false, new Price(8,35));
	}
	
	@Override
	public MenuEntryIterator createIterator() {
		return MenuEntryIterator.adapt(menuEntries.iterator());
	}
	
	public void addItem(String n, String d, boolean v, Price p) {
		menuEntries.add(new MenuEntry(n,d,v,p));
	}
}
