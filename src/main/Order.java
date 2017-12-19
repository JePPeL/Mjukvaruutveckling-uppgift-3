package main;

import java.util.HashMap;

public class Order {
	private String orderID;
	private Kund kund;
	private String leverandsdatum;
	private HashMap<String, Orderrad> orderrader  = new HashMap<String, Orderrad>();
	
	
	public void addOrderrad(String nummer) {

		
	}
	
	public Order(String OrderID) {
		orderID = OrderID;
		
	}

	public void setKund(Kund kund) {
		this.kund = kund;
	}

	public String getOrderID() {
		return orderID;
	}

}
