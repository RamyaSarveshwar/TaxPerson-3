import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test_Calculate_Tax {
	Calculate_Tax ct = new Calculate_Tax();
	@Test
	public void test1_Necessary() {
		
		float ip =ct.get_ItemTotalPrice("Necessary", 100);
		assertEquals(ip,101.0,0.0);
		
	}
	@Test
	public void test2_Luxury() {
		float ip =ct.get_ItemTotalPrice("Luxury", 10000);
		assertEquals(ip,10900.0,0.0);
		
	}
	
	@Test
	public void test3_Error() {
		float ip =ct.get_ItemTotalPrice("", 10000);
		assertEquals(ip,10000.0,0.0);
		
	}
	
}
