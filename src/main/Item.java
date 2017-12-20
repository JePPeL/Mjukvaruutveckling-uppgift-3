package main;

public class Item {
	private String serialNumber;
	private Product product;
	
	
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public void setProduct (Product product) {
		//Should you really be able to change what product an item is?
		this.product = product;
	}
	
	public Product getProduct() {
		return product;
	}

}
