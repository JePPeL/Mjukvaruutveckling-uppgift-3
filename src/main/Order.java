package main;

import java.util.Collection;
import java.util.HashMap;

public class Order {
	private String orderID;
	//NB: Shouldn't change, don't create setter
	private Customer customer;
	//Changed customer to be immutable, seems cleaner to me /Jesper
	private String deliveryDate;
	private HashMap<String, OrderLine> orderLines  = new HashMap<String, OrderLine>();
	
	public Order(String orderID, Customer customer, String deliveryDate) {
		this.orderID = orderID;
		this.customer = customer;
		this.deliveryDate = deliveryDate;
	}
	
	public void addOrderLine(OrderLine line) {
		orderLines.put(line.getNumber(), line);
		
	}

	public String getOrderID() {
		return orderID;
	}

	public Customer getCustomer() {
		return customer;
	}

	public String getDeliveryDate() {
		// TODO Auto-generated method stub
		return deliveryDate;
	}

	public Collection<OrderLine> getOrderLineCollection() {
		// TODO Auto-generated method stub
		return orderLines.values();
	}

}
