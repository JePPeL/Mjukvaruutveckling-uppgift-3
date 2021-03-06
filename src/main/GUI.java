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
	
	private JScrollPane scroll;

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
	public String getCustomerId() {
		return fieldCustomerID.getText();
		}
	public String getCustomerAddress() {
		return fieldAddress.getText();
	}
	
	public String getCustomerName() {
		return fieldName.getText();
	}
	
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
		fieldOrderLineID.setBounds(16, 294, 267, 20);
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
		btnSearchOrderLine.setBounds(14, 320, 89, 23);
		frame.getContentPane().add(btnSearchOrderLine);
		btnSearchOrderLine.addActionListener(c.addSearchOrderLineListener());

		JButton btnAddOrderLine = new JButton("Lägg till");
		btnAddOrderLine.setBounds(105, 320, 89, 23);
		frame.getContentPane().add(btnAddOrderLine);
		btnAddOrderLine.addActionListener(c.addAddOrderLineListener());

		JButton btnRemoveOrderLine = new JButton("Ta bort");
		btnRemoveOrderLine.setBounds(195, 320, 89, 23);
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
		fieldAmountOrderLine.setBounds(16, 380, 267, 20);
		frame.getContentPane().add(fieldAmountOrderLine);

		JButton btnRemoveFromOrderLine = new JButton("Ta bort");
		btnRemoveFromOrderLine.setBounds(105, 405, 89, 23);
		frame.getContentPane().add(btnRemoveFromOrderLine);
		btnRemoveFromOrderLine.addActionListener(c.addRemoveFromOrderLineListener());

		JButton btnAddToOrderLine = new JButton("Lägg till");
		btnAddToOrderLine.setBounds(14, 405, 89, 23);
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
		lblOrderrad.setBounds(20, 273, 61, 16);
		frame.getContentPane().add(lblOrderrad);

		JLabel lnlAntalLager = new JLabel("Antal");
		lnlAntalLager.setBounds(601, 169, 61, 16);
		frame.getContentPane().add(lnlAntalLager);

		JLabel lblAntalLager = new JLabel("Antal");
		lblAntalLager.setBounds(20, 360, 61, 16);
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
		separator_1.setBounds(2, 250, 1148, 16);
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
		
		JLabel lblBestllning = new JLabel("Beställning");
		lblBestllning.setHorizontalAlignment(SwingConstants.LEFT);
		lblBestllning.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblBestllning.setBounds(18, 14, 98, 16);
		frame.getContentPane().add(lblBestllning);
		
		JButton btnChangeCustomer = new JButton("Ändra");
		btnChangeCustomer.setBounds(195, 124, 89, 23);
		frame.getContentPane().add(btnChangeCustomer);
		
		JLabel lblPrice = new JLabel("Pris");
		lblPrice.setBounds(735, 77, 89, 23);
		frame.getContentPane().add(lblPrice);
		
		JButton btnChangeProduct = new JButton("Ändra");
		btnChangeProduct.setBounds(770, 124, 89, 23);
		frame.getContentPane().add(btnChangeProduct);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(571, -21, 6, 509);
		frame.getContentPane().add(separator_2);
	}

	@Override
	public void update(Observable o, Object arg) {
		// update all the displayed information (tables)
		updateInventory();
		System.out.println("update");

	}

	private void updateInventory() {
		int j = dtmInventory.getRowCount();
		for(int i = 0; i<j; i++) {
			dtmInventory.removeRow(0);
			System.out.println("removed line");
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

	public double getProductPrice() {
		return Double.parseDouble((fieldProductPrice.getText()));
		
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
