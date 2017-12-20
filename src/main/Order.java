package main;

import java.util.HashMap;

public class Order {
	private String orderID;
	//NB: Shouldn't change, don't create setter
	private Customer customer;
	private String deliveryDate;
	private HashMap<String, OrderLine> orderLines  = new HashMap<String, OrderLine>();
	
	public Order(String orderID) {
		this.orderID = orderID;
	}
	
	public void addOrderLine(String number) {
		//TODO: Implement
		
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getOrderID() {
		return orderID;
	}

}
