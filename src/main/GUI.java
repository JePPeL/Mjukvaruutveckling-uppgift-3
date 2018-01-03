package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import java.awt.event.ActionEvent;

public class GUI implements Observer{

	private JFrame frame;
	private JTextField fieldCustomerID;
	private JTextField fieldProductID;
	private JTextField fieldOrderID;
	private JTextField fieldOrderLineID;
	private JTextField fieldOrderLineAmount;
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
		frame.setBounds(100, 100, 700, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		fieldCustomerID = new JTextField();
		fieldCustomerID.setBounds(10, 57, 287, 20);
		frame.getContentPane().add(fieldCustomerID);
		fieldCustomerID.setColumns(10);
		
		fieldProductID = new JTextField();
		fieldProductID.setColumns(10);
		fieldProductID.setBounds(10, 150, 287, 20);
		frame.getContentPane().add(fieldProductID);
		
		JButton btnAddProduct = new JButton("L\u00E4gg till");
		btnAddProduct.setBounds(109, 179, 89, 23);
		frame.getContentPane().add(btnAddProduct);
		
		JButton btnSearchProduct = new JButton("S\u00F6k");
		btnSearchProduct.setBounds(10, 179, 89, 23);
		frame.getContentPane().add(btnSearchProduct);
		
		JButton btnAddCustomer = new JButton("L\u00E4gg till");
		btnAddCustomer.setBounds(109, 88, 89, 23);
		frame.getContentPane().add(btnAddCustomer);
		
		JButton btnSearchCustomer = new JButton("S\u00F6k");
		btnSearchCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSearchCustomer.setBounds(10, 88, 89, 23);
		frame.getContentPane().add(btnSearchCustomer);
		
		fieldOrderID = new JTextField();
		fieldOrderID.setBounds(362, 11, 267, 20);
		frame.getContentPane().add(fieldOrderID);
		fieldOrderID.setColumns(10);
		
		JButton btnAddOrder = new JButton("L\u00E4gg Till");
		btnAddOrder.setBounds(455, 42, 89, 23);
		frame.getContentPane().add(btnAddOrder);
		
		fieldOrderLineID = new JTextField();
		fieldOrderLineID.setBounds(362, 146, 86, 20);
		frame.getContentPane().add(fieldOrderLineID);
		fieldOrderLineID.setColumns(10);
		
		JButton btnRemoveCustomer = new JButton("Ta bort");
		btnRemoveCustomer.setBounds(208, 88, 89, 23);
		frame.getContentPane().add(btnRemoveCustomer);
		
		JButton btnRemoveProduct = new JButton("Ta bort");
		btnRemoveProduct.setBounds(208, 178, 89, 23);
		frame.getContentPane().add(btnRemoveProduct);
		
		JButton btnSearchOrder = new JButton("S\u00F6k");
		btnSearchOrder.setBounds(362, 42, 89, 23);
		frame.getContentPane().add(btnSearchOrder);
		
		JButton btnRemoveOrder = new JButton("Ta bort");
		btnRemoveOrder.setBounds(554, 42, 89, 23);
		frame.getContentPane().add(btnRemoveOrder);
		
		JButton btnSearchOrderLine = new JButton("S\u00F6k");
		btnSearchOrderLine.setBounds(359, 178, 89, 23);
		frame.getContentPane().add(btnSearchOrderLine);
		
		fieldOrderLineAmount = new JTextField();
		fieldOrderLineAmount.setBounds(455, 146, 156, 20);
		frame.getContentPane().add(fieldOrderLineAmount);
		fieldOrderLineAmount.setColumns(10);
		
		JButton btnLggTill = new JButton("L\u00E4gg till");
		btnLggTill.setBounds(455, 178, 89, 23);
		frame.getContentPane().add(btnLggTill);
		
		JButton btnTaBort = new JButton("Ta bort");
		btnTaBort.setBounds(554, 178, 89, 23);
		frame.getContentPane().add(btnTaBort);
		
		fieldAmountInventory = new JTextField();
		fieldAmountInventory.setBounds(10, 212, 179, 20);
		frame.getContentPane().add(fieldAmountInventory);
		fieldAmountInventory.setColumns(10);
		
		JButton btnRemoveFromInventory = new JButton("Ta bort");
		btnRemoveFromInventory.setBounds(109, 243, 89, 23);
		frame.getContentPane().add(btnRemoveFromInventory);
		
		JButton btnAddToInventory = new JButton("L\u00E4gg till");
		btnAddToInventory.setBounds(10, 243, 89, 23);
		frame.getContentPane().add(btnAddToInventory);
		
		fieldAmountOrderLine = new JTextField();
		fieldAmountOrderLine.setColumns(10);
		fieldAmountOrderLine.setBounds(356, 212, 179, 20);
		frame.getContentPane().add(fieldAmountOrderLine);
		
		JButton btnRemoveFromOrderLine = new JButton("Ta bort");
		btnRemoveFromOrderLine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRemoveFromOrderLine.setBounds(455, 243, 89, 23);
		frame.getContentPane().add(btnRemoveFromOrderLine);
		
		JButton btnAddToOrderLine = new JButton("L\u00E4gg till");
		btnAddToOrderLine.setBounds(356, 243, 89, 23);
		frame.getContentPane().add(btnAddToOrderLine);
		
		fieldName = new JTextField();
		fieldName.setBounds(10, 26, 86, 20);
		frame.getContentPane().add(fieldName);
		fieldName.setColumns(10);
		
		fieldAddress = new JTextField();
		fieldAddress.setBounds(112, 26, 86, 20);
		frame.getContentPane().add(fieldAddress);
		fieldAddress.setColumns(10);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}
