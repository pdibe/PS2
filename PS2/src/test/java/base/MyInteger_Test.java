package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	MyInteger a;
	MyInteger b;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		a = new MyInteger(10);
		b = new MyInteger(11);
	}

	@After
	public void tearDown() throws Exception {
		a = null;
		b = null;
	}

	@Test
	public void test() {
		assertTrue(a.isEven());
		assertFalse(b.isEven());
		assertTrue(b.isOdd());
		assertFalse(a.isOdd());
		assertTrue(b.isPrime());
		assertFalse(a.isPrime());
		assertTrue(a.isEven(100));
		assertFalse(b.isEven(1));
		assertTrue(b.isOdd(111));
		assertFalse(a.isOdd(12));
		assertTrue(b.isPrime(17));
		assertFalse(a.isPrime(90));
		assertTrue(a.isEven(a));
		assertFalse(b.isEven(b));
		assertTrue(b.isOdd(b));
		assertFalse(a.isOdd(a));
		assertTrue(b.isPrime(b));
		assertFalse(a.isPrime(a));
		assertTrue(a.equals(10));
		assertFalse(a.equals(11));
		assertTrue(a.equals(a));
		assertFalse(a.equals(b));
	}

}
