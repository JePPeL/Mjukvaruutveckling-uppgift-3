package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		// confirmed works
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (view.getCurrentCustomerID() != null) {
					model.addOrder(view.getOrderID(), model.findCustomer(view.getCurrentCustomerID()),
							view.getDeliveryDate());
				}
				else if (view.getTableCustomerID() != null){
					model.addOrder(view.getTableCustomerID(), model.findCustomer(view.getCurrentCustomerID()),
							view.getDeliveryDate());
				}
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
					view.setCurrentOrderID(view.getOrderID());
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
				if (model.searchOrderLine(view.getOrderLineID(), view.getCurrentOrderID()) != null) {
					view.setCurrentOrderLineID(view.getOrderLineID());
				}
			}
		};
	}

	public ActionListener addAddOrderLineListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				model.addOrderLine(view.getOrderLineID(), 0, view.getCurrentOrderID());
			}
		};
	}

	public ActionListener addRemoveOrderLineListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				model.removeOrderLine(view.getOrderLineID(), view.getCurrentOrderID());
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
				model.removeFromOrderLine(view.getCurrentOrderLineID(), view.getCurrentOrderID(),
						Integer.parseInt(view.getAmountOrderLine()));

			}
		};
	}

	public ActionListener addAddToOrderLineListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				model.addToOrderLine(view.getCurrentOrderLineID(), view.getCurrentOrderID(),
						Integer.parseInt(view.getAmountOrderLine()));
			}
		};
	}
}
