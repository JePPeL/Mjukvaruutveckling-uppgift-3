package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import com.sun.glass.ui.View;

public class Controller {

	private Model model;
	private GUI view;

	public Controller(Model model) {
		this.model = model;
	}
	
	public void addGUI(GUI view) {
		this.view = view;
	}
	
	public void testClass(){
		int i = 1 + 1;
		System.out.print(i);
	}

	public ActionListener addAddProductListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub				
			}			
		};
	}
	public ActionListener addSearchProductListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub				
			}			
		};
	}
	public ActionListener addAddCustomerListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub				
			}			
		};
	}
	public ActionListener addSearchCustomerListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub				
			}			
		};
	}
	public ActionListener addAddOrderListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub				
			}			
		};
	}
	public ActionListener addRemoveCustomerListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub				
			}			
		};
	}
	public ActionListener addRemoveProductListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub				
			}			
		};
	}
	public ActionListener addSearchOrderListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub				
			}			
		};
	}
	public ActionListener addRemoveOrderListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub				
			}			
		};
	}
	public ActionListener addSearchOrderLineListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			}			
		};
	}
	public ActionListener addLggTillListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub				
			}			
		};
	}
	public ActionListener addTaBortListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub				
			}			
		};
	}
	public ActionListener addRemoveFromInventoryListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub				
			}			
		};
	}	public ActionListener addAddToInventoryListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub				
			}			
		};
	}	public ActionListener addRemoveFromOrderLineListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub				
			}			
		};
	}	
	public ActionListener addAddToOrderLineListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub				
			}			
		};
	}
}
