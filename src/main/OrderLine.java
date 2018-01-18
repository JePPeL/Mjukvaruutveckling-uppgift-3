package main;

public class OrderLine {

	private String number;
	//Shouldn't have a setter (I think)
	//Maybe rename to avoid it being interpreted as number of items
	private int amount;
	private Product product;
	
<<<<<<< HEAD
	public OrderLine(String Number, int amount) {
=======
	public OrderLine(String number, int amount, Product product) {
>>>>>>> 8a7066d94c642171b281cc5678859cc697977e51
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
	
<<<<<<< HEAD
=======
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
>>>>>>> 8a7066d94c642171b281cc5678859cc697977e51
	
	
}
