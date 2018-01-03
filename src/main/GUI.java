package main;

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

import uppgift5.GUI.UneditableJTable;

import java.awt.Font;
import javax.swing.JTable;

public class GUI implements Observer{

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
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		fieldCustomerID = new JTextField();
		fieldCustomerID.setBounds(14, 85, 135, 20);
		frame.getContentPane().add(fieldCustomerID);
		fieldCustomerID.setColumns(10);
		
		fieldProductID = new JTextField();
		fieldProductID.setColumns(10);
		fieldProductID.setBounds(14, 499, 267, 20);
		frame.getContentPane().add(fieldProductID);
		
		JButton btnAddProduct = new JButton("L\u00E4gg till");
		btnAddProduct.setBounds(103, 525, 89, 23);
		frame.getContentPane().add(btnAddProduct);
		
		JButton btnSearchProduct = new JButton("S\u00F6k");
		btnSearchProduct.setBounds(12, 525, 89, 23);
		frame.getContentPane().add(btnSearchProduct);
		
		JButton btnAddCustomer = new JButton("L\u00E4gg till");
		btnAddCustomer.setBounds(103, 112, 89, 23);
		frame.getContentPane().add(btnAddCustomer);
		
		JButton btnSearchCustomer = new JButton("S\u00F6k");
		btnSearchCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSearchCustomer.setBounds(12, 112, 89, 23);
		frame.getContentPane().add(btnSearchCustomer);
		
		fieldOrderID = new JTextField();
		fieldOrderID.setBounds(14, 179, 267, 20);
		frame.getContentPane().add(fieldOrderID);
		fieldOrderID.setColumns(10);
		
		JButton btnAddOrder = new JButton("L\u00E4gg Till");
		btnAddOrder.setBounds(103, 205, 89, 23);
		frame.getContentPane().add(btnAddOrder);
		
		fieldOrderLineID = new JTextField();
		fieldOrderLineID.setBounds(14, 284, 267, 20);
		frame.getContentPane().add(fieldOrderLineID);
		fieldOrderLineID.setColumns(10);
		
		JButton btnRemoveCustomer = new JButton("Ta bort");
		btnRemoveCustomer.setBounds(196, 112, 89, 23);
		frame.getContentPane().add(btnRemoveCustomer);
		
		JButton btnRemoveProduct = new JButton("Ta bort");
		btnRemoveProduct.setBounds(196, 525, 89, 23);
		frame.getContentPane().add(btnRemoveProduct);
		
		JButton btnSearchOrder = new JButton("S\u00F6k");
		btnSearchOrder.setBounds(12, 205, 89, 23);
		frame.getContentPane().add(btnSearchOrder);
		
		JButton btnRemoveOrder = new JButton("Ta bort");
		btnRemoveOrder.setBounds(196, 205, 89, 23);
		frame.getContentPane().add(btnRemoveOrder);
		
		JButton btnSearchOrderLine = new JButton("S\u00F6k");
		btnSearchOrderLine.setBounds(12, 310, 89, 23);
		frame.getContentPane().add(btnSearchOrderLine);
		
		JButton btnLggTill = new JButton("L\u00E4gg till");
		btnLggTill.setBounds(103, 310, 89, 23);
		frame.getContentPane().add(btnLggTill);
		
		JButton btnTaBort = new JButton("Ta bort");
		btnTaBort.setBounds(196, 310, 89, 23);
		frame.getContentPane().add(btnTaBort);
		
		fieldAmountInventory = new JTextField();
		fieldAmountInventory.setBounds(14, 581, 179, 20);
		frame.getContentPane().add(fieldAmountInventory);
		fieldAmountInventory.setColumns(10);
		
		JButton btnRemoveFromInventory = new JButton("Ta bort");
		btnRemoveFromInventory.setBounds(108, 608, 89, 23);
		frame.getContentPane().add(btnRemoveFromInventory);
		
		JButton btnAddToInventory = new JButton("L\u00E4gg till");
		btnAddToInventory.setBounds(12, 608, 89, 23);
		frame.getContentPane().add(btnAddToInventory);
		
		fieldAmountOrderLine = new JTextField();
		fieldAmountOrderLine.setColumns(10);
		fieldAmountOrderLine.setBounds(14, 370, 179, 20);
		frame.getContentPane().add(fieldAmountOrderLine);
		
		JButton btnRemoveFromOrderLine = new JButton("Ta bort");
		btnRemoveFromOrderLine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRemoveFromOrderLine.setBounds(108, 395, 89, 23);
		frame.getContentPane().add(btnRemoveFromOrderLine);
		
		JButton btnAddToOrderLine = new JButton("L\u00E4gg till");
		btnAddToOrderLine.setBounds(12, 395, 89, 23);
		frame.getContentPane().add(btnAddToOrderLine);
		
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
		lblProduktnummer.setBounds(18, 478, 113, 16);
		frame.getContentPane().add(lblProduktnummer);
		
		JLabel lblOrdernummer = new JLabel("Ordernummer");
		lblOrdernummer.setBounds(18, 159, 113, 16);
		frame.getContentPane().add(lblOrdernummer);
		
		JLabel lblOrderrad = new JLabel("Orderrad");
		lblOrderrad.setBounds(18, 263, 61, 16);
		frame.getContentPane().add(lblOrderrad);
		
		JLabel lnlAntalLager = new JLabel("Antal");
		lnlAntalLager.setBounds(18, 562, 61, 16);
		frame.getContentPane().add(lnlAntalLager);
		
		JLabel lblAntalLager = new JLabel("Antal");
		lblAntalLager.setBounds(18, 350, 61, 16);
		frame.getContentPane().add(lblAntalLager);
		
		JLabel lblNewLabel_2 = new JLabel("Lager");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(18, 450, 700, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 142, 700, 16);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 240, 700, 16);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 430, 700, 12);
		frame.getContentPane().add(separator_2);
		
		tableInventory = new JTable();
		tableInventory.setBounds(328, 452, 337, 179);
		frame.getContentPane().add(tableInventory);
		
		tableOrderLine = new JTable();
		tableOrderLine.setBounds(328, 264, 337, 154);
		frame.getContentPane().add(tableOrderLine);
		
		tableOrder = new JTable();
		tableOrder.setBounds(328, 162, 337, 67);
		frame.getContentPane().add(tableOrder);
		
	
		tableCustomerRegister = new JTable();
		tableCustomerRegister.setBounds(328, 25, 337, 110);
		scroll = new JScrollPane(accountTable);
		scroll.setBounds(328, 25, 337, 110);

		frame.getContentPane().add(tableCustomerRegister);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}
