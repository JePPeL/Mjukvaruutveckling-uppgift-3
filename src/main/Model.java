package main;

import java.util.Observable;

public class Model extends Observable {
	CustomerRegister cr;
	ProductRegister pr;
	
	public Model(GUI gui) {
		cr = new CustomerRegister();
		pr = new ProductRegister();
		addObserver(gui);
	}
}
