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
	
	
	// Summe Tests
	@Test
	public void testSummeZweiPositiveIsOk() {
		assertTrue(testee.summe(10, 30) == 40);
	}
	
	@Test
	public void testSummeEineNeagtiveEinePositive() {
		assertTrue(testee.summe(-10, 50) == 40);
	}
	
	@Test
	public void testSummeNullMitEinerPositiven() {
		assertTrue(testee.summe(0, 40) == 40);
	}
	
	@Test
	public void testSummeNullMitEinerNegativen() {
		assertTrue(testee.summe(0, -40) == -40);
	}
	
	@Test
	public void testSummeMAXValueMitEinerPositiven() {
		assertTrue(testee.summe(Integer.MAX_VALUE, 1) < 0);
	}
	
	@Test
	public void testSummeMAXValueMitEinerNegativen() {
		assertTrue(testee.summe(Integer.MAX_VALUE, -1) == 2147483646);
	}
	
	@Test
	public void testSummeMINValueMitEinerPositiven() {
		assertTrue(testee.summe(Integer.MIN_VALUE, 1) == -2147483647);
	}
	
	@Test
	public void testSummeMINValueMitEinerNegativen() {
		assertTrue(testee.summe(Integer.MIN_VALUE, -1) > 0);
	}
	
	// Subtraktion Tests
	@Test
	public void testSubtraktionZweiPositiveIsOk() {
		assertTrue(testee.subtraction(30, 10) == 20);
	}
	
	@Test
	public void testSubtraktionEineNeagtiveEinePositive() {
		assertTrue(testee.subtraction(-10, 50) == -60);
	}
	
	@Test
	public void testSubtraktionNullMitEinerPositiven() {
		assertTrue(testee.subtraction(0, 40) == -40);
	}
	
	@Test
	public void testSubtraktionNullMitEinerNegativen() {
		assertTrue(testee.subtraction(0, -40) == 40);
	}
	
	@Test
	public void testSubtraktionMAXValueMitEinerPositiven() {
		assertTrue(testee.subtraction(Integer.MAX_VALUE, 1) == 2147483646);
	}
	
	@Test
	public void testSubtraktionMAXValueMitEinerNegativen() {
		assertTrue(testee.subtraction(Integer.MAX_VALUE, -1) == -2147483648);
	}
	
	@Test
	public void testSubtraktionMINValueMitEinerPositiven() {
		assertTrue(testee.subtraction(Integer.MIN_VALUE, 1) == 2147483647);
	}
	
	@Test
	public void testSubtraktionMINValueMitEinerNegativen() {
		assertTrue(testee.subtraction(Integer.MIN_VALUE, -1) == -2147483647);
	}
	
	
	// Test Protected Methode
	@Test
	public void testProtectedMethodeMultiplizieren() {
		assertTrue(testee.multiplikation(30, 4) == 120 );
	}
	
	// Test package Private Methode
	@Test public void testPackagePrivateMethodePotenzieren() {
		assertTrue(testee.potenzieren(3, 3) == 27);
	}
	
	
	
	// Test Exceptions
	
	@Test(expected=ArithmeticException.class)
		public void testDivisionDurchNull() {
			testee.division(40, 0);
		}
	
	
	@Test
	public void testDivisionDurchNullExceptionUnexpected()
	throws IndexOutOfBoundsException{
		testee.division(40, 1);
	}
	
	// Division Tests
	
	@Test
	public void testDivisionZweiPositiveZahlen() {
		assertTrue(testee.division(30, 3) == 10);
	}
	
	@Test
	public void testDivisionNullDurchPositiveZahl() {
		assertTrue(testee.division(0, 40) == 0);
	}
	
	@Test
	public void testDivisionNullDurchNegativeZahl() {
		assertTrue(testee.division(0, -40) == 0);
	}
	
	@Test
	public void testDivisionPositiveZahlDurchNegativeZahl() {
		assertTrue(testee.division(50, -10) == -5);
	}
	
	@Test
	public void testDivisionMINValueDurchNegativeZahl() {
		assertTrue(testee.division(Integer.MIN_VALUE, -100) == 21474836);
	}
	
	@Test
	public void testDivisionMINValueDurchPositiveZahl() {
		assertTrue(testee.division(Integer.MIN_VALUE, 100) == -21474836);
	}
	
	@Test
	public void testDivisionMAXValueDurchNegativeZahl() {
		assertTrue(testee.division(Integer.MAX_VALUE, -100) == -21474836);
	}
	
	@Test
	public void testDivisionMAXValueDurchPositiveZahl() {
		assertTrue(testee.division(Integer.MAX_VALUE, 100) == 21474836);
	}
	
	
	
	
	
	
	

}
