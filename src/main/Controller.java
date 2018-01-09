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
				if (model.searchProduct(view.getProductID()) != null)
					view.setCurrentProductID(view.getProductID());
				view.clearCurrentCustomerID();
				view.clearCurrentOrderID();
				view.clearCurrentOrderLineID();
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
				if (model.findCustomer(view.getCustomerId()) != null)
					view.setCurrentCustomerID(view.getCostumerID());
				view.clearCurrentOrderID();
				view.clearCurrentOrderLineID();
				view.clearCurrentProductID();
			}
		};
	}

	public ActionListener addAddOrderListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				model.addOrder(view.getOrderID(), model.findCustomer(view.getCurrentCustomerID()),
						view.getDeliveryDate());
			}
		};
	}

	public ActionListener addRemoveCustomerListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				model.removeCustomer(view.getCurrentCustomerID());
			}
		};
	}

	public ActionListener addRemoveProductListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				model.removeItem(view.getProductID());
			}
		};
	}

	public ActionListener addSearchOrderListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (model.searchOrder(view.getOrderID()) != null)
					view.setCurrentOrderID(view.getCurrentOrderID());
				;
				view.clearCurrentCustomerID();
				view.clearCurrentOrderLineID();
				view.clearCurrentProductID();
			}
		};
	}

	public ActionListener addRemoveOrderListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				model.removeOrder(view.getOrderID());
			}
		};
	}

	public ActionListener addSearchOrderLineListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (model.searchOrderLine(view.getOrderLineID(), view.getOrderID()) != null) {
					view.setCurrentOrderLineID(view.getOrderLineID());
				}
			}
		};
	}

	public ActionListener addAddOrderLineListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				model.addOrderLine(view.getOrderLineID(), Integer.parseInt(view.getAmountOrderLine()), view.getOrderID());
			}			
		};
	}

	public ActionListener addRemoveOrderLineListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO: Implement
			}
		};
	}

	public ActionListener addRemoveFromInventoryListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				model.removeItem(view.getProductID());
			}
		};
	}

	public ActionListener addAddToInventoryListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				model.addToInventory(view.getAntal(), view.getSeletedInventory());
			}
		};
	}

	public ActionListener addRemoveFromOrderLineListener() {
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
