package main;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Customer {
	private String customerNumber;
	// NB: Shouldn't be changed, don't add a setter
	private String name;
	private String address;
	private Map<String, Order> orderMap;


	public Customer(String customerNumber, String name, String address) {
		this.customerNumber = customerNumber;
		setName(name);
		setAddress(address);
		orderMap = new HashMap<String, Order>();

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void addOrder(String orderID, Customer customer, String deliveryDate) {
		orderMap.put(orderID, new Order(orderID, customer, deliveryDate));
	}
	/*public void addOrder(Order order) {
		orderMap.put(order.getOrderID(), order);
		order.setCustomer(this);
		*/
	
	public Order findOrder(String ID) {
		return orderMap.get(ID);
	}

	public Order removeOrder(String ID) {
		return orderMap.remove(ID);
	}
	
	public Collection<Order> getOrderCollection() {
		return orderMap.values();
	}
	

	
}
