package main;

public class Item {
	private String serialNumber;
	private Product product;
	
	public Item(Product product, String serialNumber) {
		this.product = product;
		this.serialNumber = serialNumber;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public Product getProduct() {
		return product;
	}

}
