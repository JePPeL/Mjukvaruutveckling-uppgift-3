package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import com.sun.glass.ui.View;

public class Controller {

	// Start Customer & Customer Register
	private GUI view;
	private Model model;

	public Controller(GUI view, Model model) {
		this.view = view;
		this.model = model;
	}

	public ActionListener getSearchCustomerListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		};
	}

	// End Customer & CustomerRegister
}
