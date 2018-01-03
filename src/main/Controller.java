package main;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;



public class Controller {
	
	//Start Customer & Customer Register
	private CustomerRegister cReg = new CustomerRegister();
	private int maxNbr = 10000000;
	private List<String> idList = new LinkedList<String>();
	private String CustomerNumber;
	
	public void addCustomer(String name, String address) {
		cReg.addCustomer(new Customer(custNumbGen(), name, address));
		
	}
	
	public Customer findCustomer(String cNbr) {
		if (cReg.findCustomer(cNbr) != null) {
			this.CustomerNumber = cReg.findCustomer(cNbr).getCustomerNumber();
			return cReg.findCustomer(cNbr);
		} else {
			return null;
		}
	}
	
	public Customer getCustomer() {
		return cReg.findCustomer(CustomerNumber);
	}
	
	public void removeCustomer() {
		cReg.removeCustomer(CustomerNumber);
	}
	
	
	public String custNumbGen() {
		Random rand = new Random();
		
		String random = Integer.toString(rand.nextInt(maxNbr));
		boolean b = true;
		while (b) {
	
			if (idList.contains(random)) {
				random = Integer.toString(rand.nextInt(maxNbr));
			} else
				idList.add(random);
			b = false;
		}
		return random;
	}
	
	//End Customer & CustomerRegister
}
