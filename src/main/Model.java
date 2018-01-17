package main;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Random;

import com.sun.glass.ui.View;

public class Model extends Observable {
	CustomerRegister cReg;
	ProductRegister pReg;
	private int maxNbr = 10000000;
	private List<String> idList = new LinkedList<String>();

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
		return cReg.findCustomer(cNbr);
	}

	public void removeCustomer(String customerNumber) {
		System.out.println("customerNumber (model); " + customerNumber);
		System.out.println(cReg.findCustomer(customerNumber));
		cReg.removeCustomer(customerNumber);
		System.out.println("remove");
		System.out.println(cReg.findCustomer(customerNumber));
		setChanged();
		notifyObservers();
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

		for (int i = 0; i < antal; i++) {
			Product temp = pReg.findProduct(productName); // hämta från jTable
															// inventory
			temp.addItem(new Item(temp, custNumbGen()));
			setChanged();
			notifyObservers();
		}
	}

	public void addProduct(String productID, String category, double price) {
		System.out.println("model");
		pReg.addProduct(new Product(productID, category, price));
		System.out.println(pReg.findProduct(productID).getName());
		setChanged();
		notifyObservers();
	}

	public Product searchProduct(String productID) {
		return pReg.findProduct(productID);
	}

	public Order searchOrder(String orderID) {
		for (Customer c : getCustomerCollection()) {
			Order order = c.findOrder(orderID);
			if (order != null) {
				return order;
			}
		}
		return null;
	}

	public void removeOrder(String orderID) {
		for (Customer c : getCustomerCollection()) {
			if (c.findOrder(orderID) != null) {
				c.removeOrder(orderID);
				setChanged();
				notifyObservers();
			}
		}
	}

	public void addOrder(String orderID, Customer customer, String deliveryDate) {
		customer.addOrder(orderID, deliveryDate);
		setChanged();
		notifyObservers();
	}

	public OrderLine searchOrderLine(String orderLineID, String orderID) {
		Order order = searchOrder(orderID);
		if (order != null)
			return order.getOrderLine(orderLineID);
		return null;
	}

	public void addOrderLine(String orderLineID, int amount, String orderID, String productID) {
		Order order = searchOrder(orderID);
		if (pReg.findProduct(productID) == null)
			return;
		order.addOrderLine(new OrderLine(orderLineID, amount, pReg.findProduct(productID)));
		setChanged();
		notifyObservers();
	}

	public void removeOrderLine(String orderLineID, String orderID) {
		Order order = searchOrder(orderID);
		if (order != null)
			order.removeOrderLine(orderLineID);
		setChanged();
		notifyObservers();
	}

	public void removeFromOrderLine(String orderLineID, String orderID, int amount) {
		Order order = searchOrder(orderID);
		OrderLine ol = order.getOrderLine(orderLineID);
		ol.decrease(amount);
		setChanged();
		notifyObservers();
	}

	public void addToOrderLine(String orderLineID, String orderID, int amount) {
		if (amount + searchOrderLine(orderLineID, orderID).getAmount() > searchOrderLine(orderLineID, orderID)
				.getProduct().numberInStock())
			return;
		Order order = searchOrder(orderID);
		OrderLine ol = order.getOrderLine(orderLineID);
		ol.increase(amount);
		setChanged();
		notifyObservers();
	}

	public void removeProduct(String productID) {
		pReg.removeProduct(productID);
		setChanged();
		notifyObservers();
	}

	public Collection<Product> getProductCollection() {
		return pReg.getProducts();
	}

	public Collection<Customer> getCustomerCollection() {
		return cReg.getCustomers();
	}

	public void removeItems(int amount, String seletedInventory) {
		if (amount > pReg.findProduct(seletedInventory).numberInStock())
			return;
		pReg.findProduct(seletedInventory).removeItems(amount);
		setChanged();
		notifyObservers();
	}

	public void setCustomerInfo(String customerNumber, String customerName, String customerAddress) {
		cReg.findCustomer(customerNumber).setName(customerName);
		cReg.findCustomer(customerNumber).setAddress(customerAddress);
		setChanged();
		notifyObservers();
	}

	public void setProductInfo(String currentProductID, String productCategory, double p) {
		pReg.findProduct(currentProductID).setCategory(productCategory);
		pReg.findProduct(currentProductID).setPrice(p);
		setChanged();
		notifyObservers();
	}
}