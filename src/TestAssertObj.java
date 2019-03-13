import static org.junit.Assert.*;
import junit.framework.TestCase;
//import java.util.*;
import org.junit.Test;


public class TestAssertObj extends TestCase {

	Functionality fu = new Functionality("hello");
	@Test
	public void test_equal() throws Exception {
		String s1 = fu.hello();
		String s2 = fu.hello();
		String s3 = new String("hello");
		assertSame(s1,s2);
		assertSame(s1,s1);
   }
	
	@Test
	public void test_Obj() throws Exception {
		int j = 4;
		assertNotNull(fu.hello());
		assertNotNull(fu.fake_hello());
   }
	

}
