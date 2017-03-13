package assignment07;

public class MenuEntry {
	private String name;
	private String description;
	private boolean vegetarian;
	private Price price;
	
	public MenuEntry(String name, String description, boolean vegetarian, Price price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public boolean isVegetarian() {
		return vegetarian;
	}
	
	public Price getPrice() {
		return price;
	}
	
	public String toString() {
		return name+", $"+price+" -- "+description;
	}
}
