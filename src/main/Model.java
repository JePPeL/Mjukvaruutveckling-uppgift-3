package main;

import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Random;

public class Model extends Observable {
	CustomerRegister cReg;
	ProductRegister pReg;
	private int maxNbr = 10000000;
	private List<String> idList = new LinkedList<String>();
	private String CustomerNumber;
	
	public Model() {
		cReg = new CustomerRegister();
		pReg = new ProductRegister();
	}
	public void addGUI(GUI gui) {
		addObserver(gui);
	}
	public void addCustomer(String name, String address) {
		cReg.addCustomer(new Customer(custNumbGen(), name, address));
		setChanged();
		notifyObservers();
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
	public void addToInventory(int antal, String productName) {
		
		for(int i=0; i<= antal; i++) {
			Product temp = pReg.findProduct(productName); //hämta från jTable inventory
			temp.addItem(new Item(temp, custNumbGen()));
			setChanged();
			notifyObservers();
		}
	}
	
	public void addProduct(String productID, String category, double price) {
		pReg.addProduct(new Product(productID, category, price));
		setChanged();
		notifyObservers();
	}
	
	public void searchProduct(String productID) {
		pReg.findProduct(productID);
	}
	
	public void addOrder(String orderID) {
		
	}
	
	public void removeItem(String productID) {
		pReg.removeProduct(productID);
	}
}
