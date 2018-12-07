package ch.bbw.mg.Junit_Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.model.TestTimedOutException;

public class CalculatorTest {
	Calculator testee;
	
	
	@Before
	public void setUp() {
		Calculator testee = new Calculator();
	}
	

	@Test
	public void testSummeZweiPositiveIsOk() {
		testee = new Calculator();
		assertTrue(testee.summe(10, 30) == 40);
	}
	
	@Test
	public void testSubtraktionZweiPositiveIsOk() {
		testee = new Calculator();
		assertTrue(testee.subtraction(30, 10) == 20);
	}

}
