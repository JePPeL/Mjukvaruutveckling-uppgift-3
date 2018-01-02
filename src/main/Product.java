package main;

public class Product {

	private String name;
	private String category;
	private double price;
	
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
	
}
