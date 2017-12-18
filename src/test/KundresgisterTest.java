package test;

import static org.junit.Assert.*;

import org.junit.Test;
import main.*;

public class KundresgisterTest {
	Kundregister kr = new Kundregister();
	Kund k = new Kund("123", "Bert Bertsson", "Sm�gatan 99");

	@Test
	public void testAddAndGet() {
		kr.add(new Kund("123", "Anders Andersson", "Storgatan 1"));
		kr.add(k);
		assertEquals(kr.get("123"), k);
		assertEquals(kr.get("000"), null);
		//antar att det ska skrivas �ver vid konflikt. Om den gamla kunden skall vara kvar ist�llet, l�gg till k innan Anders.
	}
	public void testRemove() {
		kr.add(k);
		assertEquals(k, kr.get("123"));
		assertEquals(k, kr.remove("123"));
		assertEquals(null, kr.get("123"));
	}

}
