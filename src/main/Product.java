package main;
import java.util.HashMap;


public class Product {

	private String name;
	private String category;
	private double price;
	private HashMap <String, Item> items = new HashMap<String, Item>();
	
	public Product(String name, String category, double price) {
		this.name = name;
		this.category = category;
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void addItem(Item item){
		items.put(item.getSerialNumber(), item);
	}
	
	public void removeItem(String itemID) {
		items.remove(itemID);
	}
	
	public void removeItems(int amount) {
		for (int i = 0; i < amount; i++) {
			removeItem(items.keySet().iterator().next());
		}
	}
	
	public int numberInStock() {
		return items.size();
	}
}
