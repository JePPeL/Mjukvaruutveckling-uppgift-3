package main;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Controller {
	private CustomerRegister cReg = new CustomerRegister();
	private int maxNbr = 10000000;
	private List<String> idList = new LinkedList<String>();
	
	public void addCustomer(String name, String adress) {
		cReg.addCustomer(new Customer(custNumbGen(), name, adress));
		
	}
	
	public Customer getCustomer(String CustomerNumber) {
		return cReg.findCustomer(CustomerNumber);
	}
	
	public void removeCustomer() {
		cReg.removeCustomer();
	}
	
	
	public String custNumbGen() {
		Random rand = new Random();
		
		String random = Integer.toString(rand.nextInt(maxNbr));
		boolean b = true;
		while (b) {
			String idList;
			if (idList.contains(random)) {
				random = Integer.toString(rand.nextInt(maxNbr));
			} else
				idList.add(random);
			b = false;
		}
		return random;
	}
	
	
}
