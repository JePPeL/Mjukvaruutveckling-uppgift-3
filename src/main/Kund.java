package main;

import java.util.HashMap;
import java.util.Map;

public class Kund {
	private String kundnummer; //OBS: Får ej ändras, skapa ingen setter
	private Map<String, Order> ordrar;

	public Kund(String kundnummer, String namn, String adress) {
		this.kundnummer = kundnummer;
		ordrar = new HashMap<String, Order>();
		//TODO: Andra attribut
	}
	
	public String getName() {
		//TODO: implement
		return null;
	}
	public String getKundnummer() {
		return kundnummer;
	}

	public void addOrder(Order order) {
		ordrar.put(order.getID(), order);
		
	}

	public Order getOrder(String ID) {
		return ordrar.get(ID);
	}

	public Order removeOrder(String ID) {
		return ordrar.remove(ID);
	}
}
