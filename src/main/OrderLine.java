package main;

public class OrderLine {

	private String number;
	//Shouldn't have a setter (I think)
	//Maybe rename to avoid it being interpreted as number of items
	private int amount;
	
	public String getNumber() {
		return number;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	
	
}
