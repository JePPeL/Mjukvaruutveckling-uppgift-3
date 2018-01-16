package main;
//hejhej

import java.util.Collection;
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

	public Collection<Customer> getCustomers() {
		// TODO Auto-generated method stub
		System.out.println("Collection size: " + register.size());
		System.out.println("Map contains: ");
		for (String s : register.keySet())
			System.out.println(register.get(s).getCustomerNumber());
		return register.values();
	}
	
	

}
