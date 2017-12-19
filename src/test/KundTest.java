package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.*;

public class KundTest {
	Kund k = new Kund("123", "Bert Bertsson", "Smågatan 99");
	Order o = new Order("987");
	
	@Test
	public void testAddAndGetOrder() {
		k.addOrder(new Order("987"));
		k.addOrder(o);
		assertEquals(o, k.getOrder("987"));
		assertEquals(null, k.getOrder("000"));
		//antar att det ska skrivas över vid konflikt. Om den gamla kunden skall vara kvar istället, lägg till k innan Anders.
	}
	@Test
	public void testRemoveOrder() {
		k.addOrder(o);
		assertEquals(o, k.getOrder("987"));
		assertEquals(o, k.removeOrder("987"));
		assertEquals(null, k.getOrder("987"));
	}
	@Test
	public void testChangingCustomer() {
		k.setNamn("Anders Andersson");
		k.setAdress("Storgatan 1");
		assertEquals("Anders Andersson", k.getNamn());
		assertEquals("Storgatan 1", k.getAdress());
	}

}