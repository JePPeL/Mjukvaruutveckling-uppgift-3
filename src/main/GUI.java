package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class GUI {

	private JFrame frame;
	private JTextField fieldCustomerID;
	private JTextField fieldProductID;
	private JTextField fieldOrderID;
	private JTextField fieldOrderLineID;
	private JTextField fieldAmountInventory;
	private JTextField fieldAmountOrderLine;
	private JTextField fieldName;
	private JTextField fieldAddress;

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
		fieldCustomerID.setBounds(12, 73, 287, 20);
		frame.getContentPane().add(fieldCustomerID);
		fieldCustomerID.setColumns(10);
		
		fieldProductID = new JTextField();
		fieldProductID.setColumns(10);
		fieldProductID.setBounds(10, 269, 287, 20);
		frame.getContentPane().add(fieldProductID);
		
		JButton btnAddProduct = new JButton("L\u00E4gg till");
		btnAddProduct.setBounds(109, 298, 89, 23);
		frame.getContentPane().add(btnAddProduct);
		
		JButton btnSearchProduct = new JButton("S\u00F6k");
		btnSearchProduct.setBounds(10, 298, 89, 23);
		frame.getContentPane().add(btnSearchProduct);
		
		JButton btnAddCustomer = new JButton("L\u00E4gg till");
		btnAddCustomer.setBounds(111, 104, 89, 23);
		frame.getContentPane().add(btnAddCustomer);
		
		JButton btnSearchCustomer = new JButton("S\u00F6k");
		btnSearchCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSearchCustomer.setBounds(12, 104, 89, 23);
		frame.getContentPane().add(btnSearchCustomer);
		
		fieldOrderID = new JTextField();
		fieldOrderID.setBounds(359, 73, 267, 20);
		frame.getContentPane().add(fieldOrderID);
		fieldOrderID.setColumns(10);
		
		JButton btnAddOrder = new JButton("L\u00E4gg Till");
		btnAddOrder.setBounds(452, 104, 89, 23);
		frame.getContentPane().add(btnAddOrder);
		
		fieldOrderLineID = new JTextField();
		fieldOrderLineID.setBounds(359, 269, 267, 20);
		frame.getContentPane().add(fieldOrderLineID);
		fieldOrderLineID.setColumns(10);
		
		JButton btnRemoveCustomer = new JButton("Ta bort");
		btnRemoveCustomer.setBounds(210, 104, 89, 23);
		frame.getContentPane().add(btnRemoveCustomer);
		
		JButton btnRemoveProduct = new JButton("Ta bort");
		btnRemoveProduct.setBounds(208, 297, 89, 23);
		frame.getContentPane().add(btnRemoveProduct);
		
		JButton btnSearchOrder = new JButton("S\u00F6k");
		btnSearchOrder.setBounds(359, 104, 89, 23);
		frame.getContentPane().add(btnSearchOrder);
		
		JButton btnRemoveOrder = new JButton("Ta bort");
		btnRemoveOrder.setBounds(551, 104, 89, 23);
		frame.getContentPane().add(btnRemoveOrder);
		
		JButton btnSearchOrderLine = new JButton("S\u00F6k");
		btnSearchOrderLine.setBounds(359, 298, 89, 23);
		frame.getContentPane().add(btnSearchOrderLine);
		
		JButton btnLggTill = new JButton("L\u00E4gg till");
		btnLggTill.setBounds(452, 301, 89, 23);
		frame.getContentPane().add(btnLggTill);
		
		JButton btnTaBort = new JButton("Ta bort");
		btnTaBort.setBounds(551, 301, 89, 23);
		frame.getContentPane().add(btnTaBort);
		
		fieldAmountInventory = new JTextField();
		fieldAmountInventory.setBounds(14, 351, 179, 20);
		frame.getContentPane().add(fieldAmountInventory);
		fieldAmountInventory.setColumns(10);
		
		JButton btnRemoveFromInventory = new JButton("Ta bort");
		btnRemoveFromInventory.setBounds(113, 382, 89, 23);
		frame.getContentPane().add(btnRemoveFromInventory);
		
		JButton btnAddToInventory = new JButton("L\u00E4gg till");
		btnAddToInventory.setBounds(14, 382, 89, 23);
		frame.getContentPane().add(btnAddToInventory);
		
		fieldAmountOrderLine = new JTextField();
		fieldAmountOrderLine.setColumns(10);
		fieldAmountOrderLine.setBounds(360, 355, 179, 20);
		frame.getContentPane().add(fieldAmountOrderLine);
		
		JButton btnRemoveFromOrderLine = new JButton("Ta bort");
		btnRemoveFromOrderLine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRemoveFromOrderLine.setBounds(459, 386, 89, 23);
		frame.getContentPane().add(btnRemoveFromOrderLine);
		
		JButton btnAddToOrderLine = new JButton("L\u00E4gg till");
		btnAddToOrderLine.setBounds(360, 386, 89, 23);
		frame.getContentPane().add(btnAddToOrderLine);
		
		fieldName = new JTextField();
		fieldName.setBounds(10, 26, 137, 20);
		frame.getContentPane().add(fieldName);
		fieldName.setColumns(10);
		
		fieldAddress = new JTextField();
		fieldAddress.setBounds(164, 26, 122, 20);
		frame.getContentPane().add(fieldAddress);
		fieldAddress.setColumns(10);
		
		JLabel lblKundnummer = new JLabel("Kundnummer");
		lblKundnummer.setBounds(12, 7, 124, 16);
		frame.getContentPane().add(lblKundnummer);
		
		JLabel lblNamn = new JLabel("Namn");
		lblNamn.setBounds(164, 7, 61, 16);
		frame.getContentPane().add(lblNamn);
		
		JLabel lblAdress = new JLabel("Adress");
		lblAdress.setBounds(15, 53, 61, 16);
		frame.getContentPane().add(lblAdress);
		
		JLabel lblProduktnummer = new JLabel("Produktnummer");
		lblProduktnummer.setBounds(12, 248, 113, 16);
		frame.getContentPane().add(lblProduktnummer);
		
		JLabel lblOrdernummer = new JLabel("Ordernummer");
		lblOrdernummer.setBounds(359, 53, 113, 16);
		frame.getContentPane().add(lblOrdernummer);
		
		JLabel lblOrderrad = new JLabel("Orderrad");
		lblOrderrad.setBounds(359, 248, 61, 16);
		frame.getContentPane().add(lblOrderrad);
		
		JLabel lblNewLabel = new JLabel("Antal");
		lblNewLabel.setBounds(17, 328, 61, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Antal");
		lblNewLabel_1.setBounds(364, 332, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
