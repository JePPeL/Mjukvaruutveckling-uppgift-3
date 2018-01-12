package main;

public class OrderLine {

	private String number;
	//Shouldn't have a setter (I think)
	//Maybe rename to avoid it being interpreted as number of items
	private int amount;
	private Product product;
	
	public OrderLine(String number, int amount, Product product) {
		this.number = number;
		this.amount = amount;
		this.product = product;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void increase(int amount) {
		this.amount += amount;
	}
	
	public void decrease(int amount) {
		this.amount -= amount;
	}
	
	public Product getProduct(){
		return product;
	}
	
	public double getPrice() {
		return amount*product.getPrice();
	}
	
	
}
