package assignment07;

public class Server {
	private Menu pancakeMenu;
	private Menu dinerMenu;
	
	public Server(Menu pancakeMenu, Menu dinerMenu) {
		this.pancakeMenu = pancakeMenu;
		this.dinerMenu = dinerMenu;
	}
	
	private void printMenu(MenuEntryIterator iterator) {
		for(MenuEntry menuEntry : iterator.toIterable()) {
			System.out.println(menuEntry);
		}
	}
	
	public void printMenu() {
		System.out.println("MENU\n----\nBREAKFAST");
		MenuEntryIterator peit = pancakeMenu.createIterator();
		printMenu(peit);
		System.out.println("\nLUNCH");
		MenuEntryIterator deit = dinerMenu.createIterator();
		printMenu(deit);
	}
	
	private boolean isVegetarian(String name, MenuEntryIterator iterator) {
		for(MenuEntry menuEntry : iterator.toIterable()) {
			if(name.equals(menuEntry.getName()) && menuEntry.isVegetarian()) {
				return true;
			}
		}
		return false;
	}
	
	private void printVegetarianMenu(MenuEntryIterator iterator) {
		for(MenuEntry menuEntry : iterator.toIterable()) {
			if(menuEntry.isVegetarian()) {
				System.out.println(menuEntry);
			}
		}
	}
	
	public void printVegetarianMenu() {
		System.out.println("\nVEGETARIAN MENU\n----\nBREAKFAST");
		MenuEntryIterator peit = pancakeMenu.createIterator();
		printVegetarianMenu(peit);
		System.out.println("\nLUNCH");
		MenuEntryIterator deit = dinerMenu.createIterator();
		printVegetarianMenu(deit);
	}
	
	public boolean isEntryVegetarian(String name) {
		MenuEntryIterator peit = pancakeMenu.createIterator();
		for(MenuEntry menuEntry : peit.toIterable()) {
			if(name.equals(menuEntry.getName())) {
				return isVegetarian(name, pancakeMenu.createIterator());
			}
		}
		return isVegetarian(name, dinerMenu.createIterator());
	}
}
