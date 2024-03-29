import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}
	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals (expected, actual);
	
	}
	
	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		int a = 9999;
		int b = 1111;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 8888;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testMultiple() {
		//fail("Not yet implemented");
		int a = 9999;
		int b = 1;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		int expected = 9999;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testDivide() {
		//fail("Not yet implemented");
		int a = 1000;
		int b = 100;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 10;
		assertEquals (expected, actual);
	}

}
