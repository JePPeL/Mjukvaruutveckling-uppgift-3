package main;

public class OrderLine {

	private String number;
	//Shouldn't have a setter (I think)
	//Maybe rename to avoid it being interpreted as number of items
	private int amount;
	
	public OrderLine(String Number, int amount) {
		this.number = number;
		this.amount = amount;
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
	
	
	
}
