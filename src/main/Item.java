package main;

public class Item {
	private String serialNumber;
	private Product product;
	
	public Item(Product product) {
		this.product = product;
	}
	
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public Product getProduct() {
		return product;
	}

}
