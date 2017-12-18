package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.*;

public class KundTest {
	Kund k = new Kund("123", "Bert Bertsson", "Sm�gatan 99");
	Order o = new Order("987");
	
	@Test
	public void testAddAndGet() {
		k.addOrder(new Order("987"));
		k.addOrder(o);
		assertEquals(o, k.getOrder("987"));
		assertEquals(null, k.getOrder("000"));
		//antar att det ska skrivas �ver vid konflikt. Om den gamla kunden skall vara kvar ist�llet, l�gg till k innan Anders.
	}
	@Test
	public void testRemove() {
		k.addOrder(o);
		assertEquals(o, k.getOrder("987"));
		assertEquals(o, k.removeOrder("987"));
		assertEquals(null, k.getOrder("987"));
	}
	//TODO: Namn och adress

}