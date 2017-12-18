package main;

import java.util.HashMap;
import java.util.Map;

public class Kundregister {
	private Map<String, Kund> register;

	public Kundregister() {
		register = new HashMap<String, Kund>();
	}

	public void add(Kund kund) {
		register.put(kund.getKundnummer(), kund);
		
	}

	public Kund get(String kundnummer) {
		return register.get(kundnummer);
	}

}
