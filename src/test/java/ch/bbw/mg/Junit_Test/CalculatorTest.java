package ch.bbw.mg.Junit_Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.model.TestTimedOutException;

public class CalculatorTest {
	Calculator testee;
	
	
	@Before
	public void setUp() {
		testee = new Calculator();
	}
	

	@Test
	public void testSummeZweiPositiveIsOk() {
		assertTrue(testee.summe(10, 30) == 40);
	}
	
	@Test
	public void testSummeEineNeagtiveEinePositive() {
		assertTrue(testee.summe(-10, 50) == 40);
	}
	
	@Test
	public void testSubtraktionZweiPositiveIsOk() {
		assertTrue(testee.subtraction(30, 10) == 20);
	}
	
	@Test(expected=ArithmeticException.class)
		public void testDivisionDurchNull() {
			testee.division(40, 0);
		}
	
	@Test
	public void testDivisionDurchNullExceptionUnexpected()
	throws IndexOutOfBoundsException{
		testee.division(40, 1);
	}
	
	
	
	
	

}
