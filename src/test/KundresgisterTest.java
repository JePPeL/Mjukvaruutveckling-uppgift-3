package test;

import static org.junit.Assert.*;

import org.junit.Test;
import main.*;

public class KundresgisterTest {
	Kundregister kr = new Kundregister();

	@Test
	public void testAdd() {
		Kund k = new Kund("123", "Bert Bertsson", "Sm�gatan 99");
		kr.add(new Kund("123", "Anders Andersson", "Storgatan 1"));
		kr.add(k);
		assertEquals(kr.get("123"), k);
		//antar att det ska skrivas �ver vid konflikt. Om den gamla kunden skall vara kvar ist�llet, l�gg till k innan Anders.
	}

}
