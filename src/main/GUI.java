package main;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JSeparator;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;



import java.awt.Font;
import java.awt.Window;

import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.Box;
import javax.swing.JTextPane;

public class GUI implements Observer {
	private Model m;
	private JFrame frame;
	private JTextField fieldCustomerID;
	private JTextField fieldProductID;
	private JTextField fieldOrderID;
	private JTextField fieldOrderLineID;
	private JTextField fieldAmountInventory;
	private JTextField fieldAmountOrderLine;
	private JTextField fieldName;
	private JTextField fieldAddress;
	private JTable tableInventory;
	private JTable tableOrderLine;
	private JTable tableOrder;
	private DefaultTableModel dtmInventory;
	private JTable tableCustomerRegister;
	private JTextField fieldProductCategory;
	private JTextField fieldProductPrice;
	private Vector inventoryHeader;
<<<<<<< HEAD
	
	private JScrollPane scroll;
=======

	private JScrollPane scrollO;
	private DefaultTableModel dtmOrder;
	private UneditableJTable tableOrder;
	private JScrollPane scrollC;
	private DefaultTableModel dtmOrderLine;
	private UneditableJTable tableOrderLine;
	private JScrollPane scrollOL;
	private DefaultTableModel dtmInventory;
	private UneditableJTable tableInventory;
	private JScrollPane scrollI;
	private JTextField fieldDeliveryDate;
	private String currentProductID;
	private JTextField fieldOrderLineProduct;
>>>>>>> 8a7066d94c642171b281cc5678859cc697977e51

	/**
	 * Launch the application.
	 */
	public static void start(Controller c, Model m) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI(c, m);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI(Controller c, Model m) {
		c.addGUI(this);
		m.addObserver(this);
		initialize(c, m);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public String getCustomerID() {
		return fieldCustomerID.getText();
		}
	public String getCustomerAddress() {
		return fieldAddress.getText();
	}
	
	public String getCustomerName() {
		return fieldName.getText();
	}
<<<<<<< HEAD
	
=======

	public String getOLProduct() {
		return fieldOrderLineProduct.getText();
	}

>>>>>>> 8a7066d94c642171b281cc5678859cc697977e51
	public int getAntal() {
		return Integer.parseInt(fieldAmountInventory.getText());
	}
	
	public String getSeletedInventory() {
		return (String) tableInventory.getValueAt(tableInventory.getSelectedRow(), 0);
	}
	private void initialize(Controller c, Model m) {
		this.m = m;
		frame = new JFrame();
		frame.setBounds(100, 100, 1150, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		fieldCustomerID = new JTextField();
		fieldCustomerID.setBounds(16, 98, 128, 20);
		frame.getContentPane().add(fieldCustomerID);
		fieldCustomerID.setColumns(10);
		
		
		
		fieldProductID = new JTextField();
		fieldProductID.setColumns(10);
		fieldProductID.setBounds(593, 52, 179, 20);
		frame.getContentPane().add(fieldProductID);

		JButton btnAddProduct = new JButton("Lägg till");
		btnAddProduct.setBounds(590, 124, 89, 23);
		frame.getContentPane().add(btnAddProduct);
		btnAddProduct.addActionListener(c.addAddProductListener());

		JButton btnSearchProduct = new JButton("Sök");
		btnSearchProduct.setBounds(770, 52, 89, 23);
		frame.getContentPane().add(btnSearchProduct);
		btnSearchProduct.addActionListener(c.addSearchProductListener());

		JButton btnAddCustomer = new JButton("Lägg till");
		btnAddCustomer.setBounds(14, 124, 89, 23);
		frame.getContentPane().add(btnAddCustomer);
		btnAddCustomer.addActionListener(c.addAddCustomerListener());

		JButton btnSearchCustomer = new JButton("Sök");
		btnSearchCustomer.setBounds(195, 52, 89, 23);
		frame.getContentPane().add(btnSearchCustomer);
		btnSearchCustomer.addActionListener(c.addSearchCustomerListener());

		fieldOrderID = new JTextField();
		fieldOrderID.setBounds(16, 189, 267, 20);
		frame.getContentPane().add(fieldOrderID);
		fieldOrderID.setColumns(10);

		JButton btnAddOrder = new JButton("Lägg till");
		btnAddOrder.setBounds(105, 215, 89, 23);
		frame.getContentPane().add(btnAddOrder);
		btnAddOrder.addActionListener(c.addAddOrderListener());

		fieldOrderLineID = new JTextField();
<<<<<<< HEAD
		fieldOrderLineID.setBounds(16, 294, 267, 20);
=======
		fieldOrderLineID.setBounds(17, 384, 267, 20);
>>>>>>> 8a7066d94c642171b281cc5678859cc697977e51
		frame.getContentPane().add(fieldOrderLineID);
		fieldOrderLineID.setColumns(10);

		JButton btnRemoveCustomer = new JButton("Ta bort");
		btnRemoveCustomer.setBounds(105, 124, 89, 23);
		frame.getContentPane().add(btnRemoveCustomer);
		btnRemoveCustomer.addActionListener(c.addRemoveCustomerListener());

		JButton btnRemoveProduct = new JButton("Ta bort");
		btnRemoveProduct.setBounds(680, 124, 89, 23);
		frame.getContentPane().add(btnRemoveProduct);
		btnRemoveProduct.addActionListener(c.addRemoveProductListener());

		JButton btnSearchOrder = new JButton("Sök");
		btnSearchOrder.setBounds(14, 215, 89, 23);
		frame.getContentPane().add(btnSearchOrder);
		btnSearchOrder.addActionListener(c.addSearchOrderListener());

		JButton btnRemoveOrder = new JButton("Ta bort");
		btnRemoveOrder.setBounds(195, 215, 89, 23);
		frame.getContentPane().add(btnRemoveOrder);
		btnRemoveOrder.addActionListener(c.addRemoveOrderListener());

		JButton btnSearchOrderLine = new JButton("Sök");
<<<<<<< HEAD
		btnSearchOrderLine.setBounds(14, 320, 89, 23);
=======
		btnSearchOrderLine.setBounds(15, 410, 89, 23);
>>>>>>> 8a7066d94c642171b281cc5678859cc697977e51
		frame.getContentPane().add(btnSearchOrderLine);
		btnSearchOrderLine.addActionListener(c.addSearchOrderLineListener());

		JButton btnAddOrderLine = new JButton("Lägg till");
<<<<<<< HEAD
		btnAddOrderLine.setBounds(105, 320, 89, 23);
=======
		btnAddOrderLine.setBounds(106, 410, 89, 23);
>>>>>>> 8a7066d94c642171b281cc5678859cc697977e51
		frame.getContentPane().add(btnAddOrderLine);
		btnAddOrderLine.addActionListener(c.addAddOrderLineListener());

		JButton btnRemoveOrderLine = new JButton("Ta bort");
<<<<<<< HEAD
		btnRemoveOrderLine.setBounds(195, 320, 89, 23);
=======
		btnRemoveOrderLine.setBounds(195, 410, 89, 23);
>>>>>>> 8a7066d94c642171b281cc5678859cc697977e51
		frame.getContentPane().add(btnRemoveOrderLine);
		btnRemoveOrderLine.addActionListener(c.addRemoveFromOrderLineListener());

		fieldAmountInventory = new JTextField();
		fieldAmountInventory.setBounds(597, 188, 258, 20);
		frame.getContentPane().add(fieldAmountInventory);
		fieldAmountInventory.setColumns(10);

		JButton btnRemoveFromInventory = new JButton("Ta bort");
		btnRemoveFromInventory.setBounds(689, 215, 89, 23);
		frame.getContentPane().add(btnRemoveFromInventory);
		btnRemoveFromInventory.addActionListener(c.addRemoveFromInventoryListener());

		JButton btnAddToInventory = new JButton("Lägg till");
		btnAddToInventory.setBounds(593, 215, 89, 23);
		frame.getContentPane().add(btnAddToInventory);
		btnAddToInventory.addActionListener(c.addAddToInventoryListener());

		fieldAmountOrderLine = new JTextField();
		fieldAmountOrderLine.setColumns(10);
<<<<<<< HEAD
		fieldAmountOrderLine.setBounds(16, 380, 267, 20);
		frame.getContentPane().add(fieldAmountOrderLine);

		JButton btnRemoveFromOrderLine = new JButton("Ta bort");
		btnRemoveFromOrderLine.setBounds(105, 405, 89, 23);
=======
		fieldAmountOrderLine.setBounds(18, 452, 267, 20);
		frame.getContentPane().add(fieldAmountOrderLine);

		JButton btnRemoveFromOrderLine = new JButton("Ta bort");
		btnRemoveFromOrderLine.setBounds(107, 477, 89, 23);
>>>>>>> 8a7066d94c642171b281cc5678859cc697977e51
		frame.getContentPane().add(btnRemoveFromOrderLine);
		btnRemoveFromOrderLine.addActionListener(c.addRemoveFromOrderLineListener());

		JButton btnAddToOrderLine = new JButton("Lägg till");
<<<<<<< HEAD
		btnAddToOrderLine.setBounds(14, 405, 89, 23);
=======
		btnAddToOrderLine.setBounds(16, 477, 89, 23);
>>>>>>> 8a7066d94c642171b281cc5678859cc697977e51
		frame.getContentPane().add(btnAddToOrderLine);
		btnAddToOrderLine.addActionListener(c.addAddToOrderLineListener());

		fieldName = new JTextField();
		fieldName.setBounds(16, 52, 179, 20);
		frame.getContentPane().add(fieldName);
		fieldName.setColumns(10);

		fieldAddress = new JTextField();
		fieldAddress.setBounds(156, 98, 128, 20);
		frame.getContentPane().add(fieldAddress);
		fieldAddress.setColumns(10);

		JLabel lblKundnummer = new JLabel("Kundnummer");
		lblKundnummer.setBounds(20, 34, 124, 16);
		frame.getContentPane().add(lblKundnummer);

		JLabel lblNamn = new JLabel("Namn");
		lblNamn.setBounds(20, 80, 61, 16);
		frame.getContentPane().add(lblNamn);

		JLabel lblAdress = new JLabel("Adress");
		lblAdress.setBounds(160, 80, 61, 16);
		frame.getContentPane().add(lblAdress);

		JLabel lblProductName = new JLabel("Produktnamn");
		lblProductName.setBounds(597, 34, 113, 16);
		frame.getContentPane().add(lblProductName);

		JLabel lblOrdernummer = new JLabel("Ordernummer");
		lblOrdernummer.setBounds(20, 169, 113, 16);
		frame.getContentPane().add(lblOrdernummer);

		JLabel lblOrderrad = new JLabel("Orderrad");
<<<<<<< HEAD
		lblOrderrad.setBounds(20, 273, 61, 16);
=======
		lblOrderrad.setBounds(21, 363, 61, 16);
>>>>>>> 8a7066d94c642171b281cc5678859cc697977e51
		frame.getContentPane().add(lblOrderrad);

		JLabel lnlAntalLager = new JLabel("Antal");
		lnlAntalLager.setBounds(601, 169, 61, 16);
		frame.getContentPane().add(lnlAntalLager);

		JLabel lblAntalLager = new JLabel("Antal");
<<<<<<< HEAD
		lblAntalLager.setBounds(20, 360, 61, 16);
=======
		lblAntalLager.setBounds(22, 432, 61, 16);
>>>>>>> 8a7066d94c642171b281cc5678859cc697977e51
		frame.getContentPane().add(lblAntalLager);

//		JList listCustomers = new JList();
//		listCustomers.setBounds(295, 34, 263, 111);
//		frame.getContentPane().add(listCustomers);
//
//		JList listOrders = new JList();
//		listOrders.setBounds(295, 168, 263, 70);
//		frame.getContentPane().add(listOrders);
//
//		JList listOrderLines = new JList();
//		listOrderLines.setBounds(295, 273, 263, 155);
//		frame.getContentPane().add(listOrderLines);
//
//		JList listProducts = new JList();
//		listProducts.setBounds(868, 42, 263, 81);
//		frame.getContentPane().add(listProducts);
		
		JLabel lblNewLabel_2 = new JLabel("Lager");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(597, 14, 61, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(2, 150, 576, 16);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
<<<<<<< HEAD
		separator_1.setBounds(2, 250, 1148, 16);
=======
		separator_1.setBounds(10, 309, 1148, 16);
>>>>>>> 8a7066d94c642171b281cc5678859cc697977e51
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(2, 600, 6, 600);
		frame.getContentPane().add(separator_3);
		
		fieldProductCategory = new JTextField();
		fieldProductCategory.setBounds(593, 96, 128, 26);
		frame.getContentPane().add(fieldProductCategory);
		fieldProductCategory.setColumns(10);
		
		JLabel lblCategory = new JLabel("Kategori");
		lblCategory.setBounds(597, 77, 89, 23);
		frame.getContentPane().add(lblCategory);
		
		fieldProductPrice = new JTextField();
		fieldProductPrice.setColumns(10);
		fieldProductPrice.setBounds(731, 96, 124, 26);
		frame.getContentPane().add(fieldProductPrice);

		
		String[] s = { "Produktnummer", "Pris" };

		dtmInventory = new DefaultTableModel(s, 0);
		tableInventory = new UneditableJTable(dtmInventory);
		tableInventory.setBounds(868, 37, 263, 108);
<<<<<<< HEAD
		scroll = new JScrollPane(tableInventory);
		scroll.setBounds(868, 37, 263, 108);
		frame.getContentPane().add(scroll);
	
		tableOrderLine = new JTable();
		tableOrderLine.setBounds(295, 264, 264, 154);
		frame.getContentPane().add(tableOrderLine);
		
		tableOrder = new JTable();
		tableOrder.setBounds(295, 167, 264, 70);
		frame.getContentPane().add(tableOrder);
		
	
		tableCustomerRegister = new JTable();
		tableCustomerRegister.setBounds(293, 25, 264, 201);
		frame.getContentPane().add(tableCustomerRegister);
		
=======
		scrollI = new JScrollPane(tableInventory);
		scrollI.setBounds(868, 37, 263, 108);
		frame.getContentPane().add(scrollI);

		String[] s2 = { "Ordernummer", "Leveransdatum", "Pris" };

		dtmOrder = new DefaultTableModel(s2, 0);
		tableOrder = new UneditableJTable(dtmOrder);
		tableOrder.setBounds(295, 264, 264, 154);
		scrollO = new JScrollPane(tableOrder);
		scrollO.setBounds(301, 169, 264, 129);
		frame.getContentPane().add(scrollO);

		String[] s3 = { "Produktnamn", "Produktnummer", "Lagersaldo", "Pris" };

		dtmOrderLine = new DefaultTableModel(s3, 0);
		tableOrderLine = new UneditableJTable(dtmOrderLine);
		tableOrderLine.setBounds(868, 37, 263, 108);
		scrollOL = new JScrollPane(tableOrderLine);
		scrollOL.setBounds(301, 328, 263, 160);
		frame.getContentPane().add(scrollOL);

>>>>>>> 8a7066d94c642171b281cc5678859cc697977e51
		JLabel lblBestllning = new JLabel("Beställning");
		lblBestllning.setHorizontalAlignment(SwingConstants.LEFT);
		lblBestllning.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblBestllning.setBounds(18, 14, 98, 16);
		frame.getContentPane().add(lblBestllning);
		
		JButton btnChangeCustomer = new JButton("Ändra");
		btnChangeCustomer.setBounds(195, 124, 89, 23);
		frame.getContentPane().add(btnChangeCustomer);
<<<<<<< HEAD
		
=======
		btnChangeCustomer.addActionListener(c.addChangeCustomerListener());

>>>>>>> 8a7066d94c642171b281cc5678859cc697977e51
		JLabel lblPrice = new JLabel("Pris");
		lblPrice.setBounds(735, 77, 89, 23);
		frame.getContentPane().add(lblPrice);
		
		JButton btnChangeProduct = new JButton("Ändra");
		btnChangeProduct.setBounds(770, 124, 89, 23);
		frame.getContentPane().add(btnChangeProduct);
<<<<<<< HEAD
=======
		btnChangeProduct.addActionListener(c.addChangeProductListener());
>>>>>>> 8a7066d94c642171b281cc5678859cc697977e51
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(571, -21, 6, 509);
		frame.getContentPane().add(separator_2);
<<<<<<< HEAD
=======

		fieldDeliveryDate = new JTextField();
		fieldDeliveryDate.setBounds(24, 186, 267, 26);
		frame.getContentPane().add(fieldDeliveryDate);
		fieldDeliveryDate.setColumns(10);

		JLabel labelDeliveryDate = new JLabel("Leveransdatum (YYYY-MM-DD)");
		labelDeliveryDate.setBounds(24, 169, 231, 16);
		frame.getContentPane().add(labelDeliveryDate);

		fieldOrderLineProduct = new JTextField();
		fieldOrderLineProduct.setBounds(16, 337, 268, 20);
		frame.getContentPane().add(fieldOrderLineProduct);
		fieldOrderLineProduct.setColumns(10);

		JLabel lblProdukt = new JLabel("Produkt");
		lblProdukt.setBounds(16, 322, 46, 14);
		frame.getContentPane().add(lblProdukt);
>>>>>>> 8a7066d94c642171b281cc5678859cc697977e51
	}

	@Override
	public void update(Observable o, Object arg) {
		// update all the displayed information (tables)
		updateInventory();
		System.out.println("update");

	}

<<<<<<< HEAD
	private void updateInventory() {
		int j = dtmInventory.getRowCount();
		for(int i = 0; i<j; i++) {
			dtmInventory.removeRow(0);
			System.out.println("removed line");
=======
	private void updateCustomer() {
		clearTable(dtmCustomer);
		if (currentCustomerID != null && m.findCustomer(currentCustomerID) != null) {
			System.out.println("1");
			Customer c = m.findCustomer(currentCustomerID);
			String[] s = { c.getCustomerNumber(), c.getName(), c.getAddress() };
			dtmCustomer.addRow(s);
		} else {
			System.out.println("2");
			for (Customer a : m.getCustomerCollection()) {
				String[] s = { a.getCustomerNumber(), a.getName(), a.getAddress() };
				System.out.println(s[0]);
				dtmCustomer.addRow(s);
			}
		}
	}

	private void updateInventory() {
		clearTable(dtmInventory);
		if (currentProductID != null && m.searchProduct(currentProductID) != null) {
			Product a = m.searchProduct(currentProductID);
			String[] s = { a.getName(), Double.toString(a.getPrice()), Integer.toString(a.numberInStock()),
					a.getCategory() };
			dtmInventory.addRow(s);
		} else
			for (Product a : m.getProductCollection()) {
				String[] s = { a.getName(), Double.toString(a.getPrice()), Integer.toString(a.numberInStock()),
						a.getCategory() };
				dtmInventory.addRow(s);
			}
	}

	private void updateOrder() {
		clearTable(dtmOrder);
		if (currentOrderID != null && m.searchOrder(currentOrderID) != null) {
			Order a = m.searchOrder(currentOrderID);
			String[] s = { a.getOrderID(), a.getDeliveryDate(), Double.toString(a.getPrice()) };
			dtmOrder.addRow(s);
		} else if (currentCustomerID != null)
			for (Order a : m.findCustomer(currentCustomerID).getOrderCollection()) {
				String[] s = { a.getOrderID(), a.getDeliveryDate(), Double.toString(a.getPrice()) };
				dtmOrder.addRow(s);
			}
	}

	private void updateOrderLine() {
		clearTable(dtmOrderLine);
		if (currentOrderID != null && m.searchOrder(currentOrderID) != null) {
			System.out.println("updating, currentOrderID == " + currentOrderID);
			if (currentOrderLineID != null && m.searchOrderLine(currentOrderLineID, currentOrderID) != null) {
				System.out.println("single line");
				OrderLine a = m.searchOrder(currentOrderID).getOrderLine(currentOrderLineID);
				if (a != null) {
					String[] s = { a.getProduct().getName(), a.getNumber(), Integer.toString(a.getAmount()),
							Double.toString(a.getPrice()) };
					dtmOrderLine.addRow(s);
				}
			} else {
				for (OrderLine a : m.searchOrder(currentOrderID).getOrderLineCollection()) {
					String[] s = { a.getProduct().getName(), a.getNumber(), Integer.toString(a.getAmount()),
							Double.toString(a.getPrice()) };
					dtmOrderLine.addRow(s);
				}
			}

>>>>>>> 8a7066d94c642171b281cc5678859cc697977e51
		}
		for (Product a : m.getProductList()) {
			System.out.println("in loop: " + a.getName());
			String[] s = { a.getName(), Double.toString(a.getPrice())};
			dtmInventory.addRow(s);
			System.out.println(s[0] + "||" + s[1]);
			System.out.println("added line");
		}
	}
	
	public String getProductID() {
		return fieldProductID.getText();
	}

	public String getProductCategory() {
		return fieldProductCategory.getText();
	}

<<<<<<< HEAD
	public double getProductPrice() {
		return Double.parseDouble((fieldProductPrice.getText()));
		
=======
	public String getProductPrice() {
		return fieldProductPrice.getText();

	}

	public String getOrderID() {
		return fieldOrderID.getText();
	}

	public String getCurrentCustomerID() {
		return currentCustomerID;
	}

	public void setCurrentCustomerID(String currentCustomerID) {
		this.currentCustomerID = currentCustomerID;
		updateCustomer();
	}

	public void clearCurrentCustomerID() {
		currentCustomerID = null;
		updateCustomer();
		updateOrder();
	}

	public String getCurrentOrderID() {
		return currentOrderID;
	}

	public void setCurrentOrderID(String currentOrderID) {
		this.currentOrderID = currentOrderID;
		updateOrder();
	}

	public String getOrderLineID() {
		return fieldOrderLineID.getText();
>>>>>>> 8a7066d94c642171b281cc5678859cc697977e51
	}
	
	private class UneditableJTable extends JTable {
		public UneditableJTable(DefaultTableModel dtm) {
			super(dtm);
		}

		public boolean isCellEditable(int row, int column) {
			return false;
		}
	}
	
}
