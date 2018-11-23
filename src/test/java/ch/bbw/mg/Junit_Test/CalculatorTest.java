package ch.bbw.mg.Junit_Test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runners.model.TestTimedOutException;

public class CalculatorTest {
	Calculator testee;

	@Test
	public void testSummeZweiPositiveIsOk() {
		testee = new Calculator();
		assertTrue(testee.Summe(10, 30) == 40);
	}
	
	@Test
	public void testSubtraktionZweiPositiveIsOk() {
		testee = new Calculator();
		assertTrue(testee.Summe(30, 10) == 20);
	}

}
