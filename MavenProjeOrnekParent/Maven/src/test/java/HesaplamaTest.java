import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamaTest {

	@Test
	public void testTopla() {
		hesaplama.topla(25, 14);
		assertEquals(39, gercekSonuc);
	}

}
