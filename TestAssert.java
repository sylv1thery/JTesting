
import static org.junit.Assert.*;
//import junit.framework.TestCase;
import org.junit.Test;


public class TestAssert  {

	Functionality fu = new Functionality("hello");
	@Test
	public void test_simple() throws Exception {
		int j = 4;
		if (j<0){
			assertTrue(fu.f_x2(-j) == 8);
		}
			
		assertEquals(fu.f_x2(j), 8);
		assertTrue(fu.f_x2(j) == 9);
		assertTrue(fu.f_x2(j) == 10);
   }
	
	@Test
	public void test_equal() throws Exception {
		int j = 4;
		assertEquals(fu.f_x2(j), 8);
		assertEquals(fu.root(16.0), 4.0, 0.00001);
   }
}
