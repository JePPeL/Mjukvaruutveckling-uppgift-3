package main;
//hejhej

import java.util.HashMap;
import java.util.Map;

public class CustomerRegister {
	private Map<String, Customer> register;

	public CustomerRegister() {
		register = new HashMap<String, Customer>();
	}

	public void addCustomer(Customer customer) {
		register.put(customer.getCustomerNumber(), customer);
		
	}

	public Customer findCustomer(String customerNumber) {
		return register.get(customerNumber);
	}

	public Customer removeCustomer(String customerNumber) {
		return register.remove(customerNumber);		
	}
	
	

}
