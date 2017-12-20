package test;

import static org.junit.Assert.*;

import org.junit.Test;
import main.*;

public class CustomerResgisterTest {
	CustomerRegister cr = new CustomerRegister();
	Customer c = new Customer("123", "Bert Bertsson", "Smågatan 99");

	@Test
	public void testAddAndGet() {
		cr.addCustomer(new Customer("123", "Anders Andersson", "Storgatan 1"));
		cr.addCustomer(c);
		assertEquals(c, cr.findCustomer("123"));
		assertEquals(null, cr.findCustomer("000"));
		//Assumes the customer should be overwritten in case of conflict, if it should stay the same, add c before Anders.
	}
	@Test
	public void testRemove() {
		cr.addCustomer(c);
		assertEquals(c, cr.findCustomer("123"));
		assertEquals(c, cr.removeCustomer("123"));
		assertEquals(null, cr.findCustomer("123"));
	}

}
