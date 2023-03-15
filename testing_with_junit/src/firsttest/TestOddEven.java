package firsttest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestOddEven {
      static Calculator calc;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calc=new Calculator();
		System.out.println("before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after all test case");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after");
	}

	@Test
	public void testOdd_even() {
		int n=5;
		boolean expectedValue=false;
		boolean actualValue=calc.odd_even(n);
		assertEquals(expectedValue,actualValue);
		//fail("Not yet implemented");
	}

}
