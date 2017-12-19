package main;

import java.util.HashMap;
import java.util.Map;

public class Kund {
	private String kundnummer; // OBS: F�r ej �ndras, skapa ingen setter
	private Map<String, Order> ordrar;
	private String namn;
	private String adress;

	public Kund(String kundnummer, String namn, String adress) {
		this.kundnummer = kundnummer;
		ordrar = new HashMap<String, Order>();
		this.setNamn(namn);
		this.setAdress(adress);

	}

	public void setNamn(String namn) {
		this.namn = namn;
	}

	public String getNamn() {
		return namn;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getAdress() {
		return adress;
	}

	public String getKundnummer() {
		return kundnummer;
	}

	public void addOrder(Order order) {
		ordrar.put(order.getOrderID(), order);
		order.setKund(this);

	}

	public Order getOrder(String ID) {
		return ordrar.get(ID);
	}

	public Order removeOrder(String ID) {
		return ordrar.remove(ID);
	}

}
