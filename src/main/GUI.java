package main;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
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
	private JTable tableCustomerRegister;

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
		initialize(c, m);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Controller c, Model m) {
		this.m = m;
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		fieldCustomerID = new JTextField();
		fieldCustomerID.setBounds(14, 85, 135, 20);
		frame.getContentPane().add(fieldCustomerID);
		fieldCustomerID.setColumns(10);

		fieldProductID = new JTextField();
		fieldProductID.setColumns(10);
		fieldProductID.setBounds(589, 45, 267, 20);
		frame.getContentPane().add(fieldProductID);

		JButton btnAddProduct = new JButton("L\u00E4gg till");
		btnAddProduct.setBounds(678, 71, 89, 23);
		frame.getContentPane().add(btnAddProduct);
		btnAddProduct.addActionListener(c.addAddProductListener());

		JButton btnSearchProduct = new JButton("S\u00F6k");
		btnSearchProduct.setBounds(587, 71, 89, 23);
		frame.getContentPane().add(btnSearchProduct);
		btnSearchProduct.addActionListener(c.addSearchProductListener());

		JButton btnAddCustomer = new JButton("L\u00E4gg till");
		btnAddCustomer.setBounds(103, 112, 89, 23);
		frame.getContentPane().add(btnAddCustomer);
		btnAddCustomer.addActionListener(c.addAddCustomerListener());

		JButton btnSearchCustomer = new JButton("S\u00F6k");
		btnSearchCustomer.setBounds(12, 112, 89, 23);
		frame.getContentPane().add(btnSearchCustomer);
		btnSearchCustomer.addActionListener(c.addSearchCustomerListener());

		fieldOrderID = new JTextField();
		fieldOrderID.setBounds(14, 179, 267, 20);
		frame.getContentPane().add(fieldOrderID);
		fieldOrderID.setColumns(10);

		JButton btnAddOrder = new JButton("Lägg till");
		btnAddOrder.setBounds(103, 205, 89, 23);
		frame.getContentPane().add(btnAddOrder);
		btnAddOrder.addActionListener(c.addAddOrderListener());

		fieldOrderLineID = new JTextField();
		fieldOrderLineID.setBounds(14, 284, 267, 20);
		frame.getContentPane().add(fieldOrderLineID);
		fieldOrderLineID.setColumns(10);

		JButton btnRemoveCustomer = new JButton("Ta bort");
		btnRemoveCustomer.setBounds(196, 112, 89, 23);
		frame.getContentPane().add(btnRemoveCustomer);
		btnRemoveCustomer.addActionListener(c.addRemoveCustomerListener());

		JButton btnRemoveProduct = new JButton("Ta bort");
		btnRemoveProduct.setBounds(771, 71, 89, 23);
		frame.getContentPane().add(btnRemoveProduct);
		btnRemoveProduct.addActionListener(c.addRemoveProductListener());

		JButton btnSearchOrder = new JButton("S\u00F6k");
		btnSearchOrder.setBounds(12, 205, 89, 23);
		frame.getContentPane().add(btnSearchOrder);
		btnSearchOrder.addActionListener(c.addSearchOrderListener());

		JButton btnRemoveOrder = new JButton("Ta bort");
		btnRemoveOrder.setBounds(196, 205, 89, 23);
		frame.getContentPane().add(btnRemoveOrder);
		btnRemoveOrder.addActionListener(c.addRemoveOrderListener());

		JButton btnSearchOrderLine = new JButton("S\u00F6k");
		btnSearchOrderLine.setBounds(12, 310, 89, 23);
		frame.getContentPane().add(btnSearchOrderLine);
		btnSearchOrderLine.addActionListener(c.addSearchOrderLineListener());

		JButton btnLggTill = new JButton("L\u00E4gg till");
		btnLggTill.setBounds(103, 310, 89, 23);
		frame.getContentPane().add(btnLggTill);
		btnLggTill.addActionListener(c.addLggTillListener());

		JButton btnTaBort = new JButton("Ta bort");
		btnTaBort.setBounds(196, 310, 89, 23);
		frame.getContentPane().add(btnTaBort);
		btnTaBort.addActionListener(c.addTaBortListener());

		fieldAmountInventory = new JTextField();
		fieldAmountInventory.setBounds(589, 127, 179, 20);
		frame.getContentPane().add(fieldAmountInventory);
		fieldAmountInventory.setColumns(10);

		JButton btnRemoveFromInventory = new JButton("Ta bort");
		btnRemoveFromInventory.setBounds(683, 154, 89, 23);
		frame.getContentPane().add(btnRemoveFromInventory);
		btnRemoveFromInventory.addActionListener(c.addRemoveFromInventoryListener());

		JButton btnAddToInventory = new JButton("L\u00E4gg till");
		btnAddToInventory.setBounds(587, 154, 89, 23);
		frame.getContentPane().add(btnAddToInventory);
		btnAddToInventory.addActionListener(c.addAddToInventoryListener());

		fieldAmountOrderLine = new JTextField();
		fieldAmountOrderLine.setColumns(10);
		fieldAmountOrderLine.setBounds(14, 370, 179, 20);
		frame.getContentPane().add(fieldAmountOrderLine);

		JButton btnRemoveFromOrderLine = new JButton("Ta bort");
		btnRemoveFromOrderLine.setBounds(108, 395, 89, 23);
		frame.getContentPane().add(btnRemoveFromOrderLine);
		btnRemoveFromOrderLine.addActionListener(c.addRemoveFromOrderLineListener());

		JButton btnAddToOrderLine = new JButton("L\u00E4gg till");
		btnAddToOrderLine.setBounds(12, 395, 89, 23);
		frame.getContentPane().add(btnAddToOrderLine);
		btnAddToOrderLine.addActionListener(c.addAddToOrderLineListener());

		fieldName = new JTextField();
		fieldName.setBounds(14, 42, 269, 20);
		frame.getContentPane().add(fieldName);
		fieldName.setColumns(10);

		fieldAddress = new JTextField();
		fieldAddress.setBounds(161, 85, 122, 20);
		frame.getContentPane().add(fieldAddress);
		fieldAddress.setColumns(10);

		JLabel lblKundnummer = new JLabel("Kundnummer");
		lblKundnummer.setBounds(18, 24, 124, 16);
		frame.getContentPane().add(lblKundnummer);

		JLabel lblNamn = new JLabel("Namn");
		lblNamn.setBounds(164, 68, 61, 16);
		frame.getContentPane().add(lblNamn);

		JLabel lblAdress = new JLabel("Adress");
		lblAdress.setBounds(18, 68, 61, 16);
		frame.getContentPane().add(lblAdress);

		JLabel lblProduktnummer = new JLabel("Produktnummer");
		lblProduktnummer.setBounds(593, 24, 113, 16);
		frame.getContentPane().add(lblProduktnummer);

		JLabel lblOrdernummer = new JLabel("Ordernummer");
		lblOrdernummer.setBounds(18, 159, 113, 16);
		frame.getContentPane().add(lblOrdernummer);

		JLabel lblOrderrad = new JLabel("Orderrad");
		lblOrderrad.setBounds(18, 263, 61, 16);
		frame.getContentPane().add(lblOrderrad);

		JLabel lnlAntalLager = new JLabel("Antal");
		lnlAntalLager.setBounds(593, 108, 61, 16);
		frame.getContentPane().add(lnlAntalLager);

		JLabel lblAntalLager = new JLabel("Antal");
		lblAntalLager.setBounds(18, 350, 61, 16);
		frame.getContentPane().add(lblAntalLager);

		JList listCustomers = new JList();
		listCustomers.setBounds(293, 24, 263, 111);
		frame.getContentPane().add(listCustomers);

		JList listOrders = new JList();
		listOrders.setBounds(293, 156, 263, 70);
		frame.getContentPane().add(listOrders);

		JList listOrderLines = new JList();
		listOrderLines.setBounds(293, 263, 263, 155);
		frame.getContentPane().add(listOrderLines);

		JList listProducts = new JList();
		listProducts.setBounds(868, 24, 263, 155);
		frame.getContentPane().add(listProducts);
		
		JLabel lblNewLabel_2 = new JLabel("Lager");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(441, 68, 700, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 142, 559, 16);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 240, 556, 16);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 430, 610, 12);
		frame.getContentPane().add(separator_2);
		
		tableInventory = new JTable();
		tableInventory.setBounds(868, 25, 263, 155);
		frame.getContentPane().add(tableInventory);
		
		tableOrderLine = new JTable();
		tableOrderLine.setBounds(293, 264, 263, 154);
		frame.getContentPane().add(tableOrderLine);
		
		tableOrder = new JTable();
		tableOrder.setBounds(293, 157, 263, 70);
		frame.getContentPane().add(tableOrder);
		
	
		tableCustomerRegister = new JTable();
		tableCustomerRegister.setBounds(293, 25, 263, 110);
		frame.getContentPane().add(tableCustomerRegister);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(2, 600, 6, 600);
		frame.getContentPane().add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(571, 0, 6, 578);
		frame.getContentPane().add(separator_4);
	}

	@Override
	public void update(Observable o, Object arg) {
		// update all the displayed information (tables)

	}
}
