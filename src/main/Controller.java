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

	public ActionListener addAddProductListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				model.addProduct(view.getProductID(), view.getProductCategory(), view.getProductPrice());				
				
			}			
		};
	}
	public ActionListener addSearchProductListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				model.searchProduct(view.getProductID());
			}			
		};
	}
	public ActionListener addAddCustomerListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				model.addCustomer(view.getCustomerName(), view.getCustomerAddress());
			}			
		};
	}
	public ActionListener addSearchCustomerListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
<<<<<<< HEAD
				model.findCustomer(view.getCustomerId());			
			}			
=======
				if (model.findCustomer(view.getCustomerID()) != null)
					view.setCurrentCustomerID(view.getCustomerID());
				view.clearCurrentOrderID();
				view.clearCurrentOrderLineID();
				view.clearCurrentProductID();
			}
>>>>>>> 8a7066d94c642171b281cc5678859cc697977e51
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
<<<<<<< HEAD
=======
				model.removeCustomer(view.getCustomerID());
>>>>>>> 8a7066d94c642171b281cc5678859cc697977e51
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
	public ActionListener addAddOrderLineListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
<<<<<<< HEAD
				// TODO Auto-generated method stub				
			}			
=======
				if (view.getCurrentOrderID() != null)
					model.addOrderLine(view.getOrderLineID(), 0, view.getCurrentOrderID(), view.getOLProduct());
			}
>>>>>>> 8a7066d94c642171b281cc5678859cc697977e51
		};
	}
	public ActionListener addRemoveOrderLineListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//TODO: Implement
			}			
		};
	}
	public ActionListener addRemoveFromInventoryListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
<<<<<<< HEAD
				model.removeItem(view.getProductID());			
			}			
=======
				if (model.searchProduct(view.getSeletedInventory()) != null)
					model.removeItems(view.getAntal(), view.getSeletedInventory());
			}
>>>>>>> 8a7066d94c642171b281cc5678859cc697977e51
		};
	}	public ActionListener addAddToInventoryListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				model.addToInventory(view.getAntal(), view.getSeletedInventory());				
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

	public ActionListener addChangeCustomerListener() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.setCustomerInfo(view.getCurrentCustomerID(), view.getCustomerName(), view.getCustomerAddress());
			}
		};
	}

	public ActionListener addChangeProductListener() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double p = 0;
				if (!view.getProductPrice().equals(""))
					p = Double.parseDouble(view.getProductPrice());
				model.setProductInfo(view.getCurrentProductID(), view.getProductCategory(), p);
			}
		};
	}
}
