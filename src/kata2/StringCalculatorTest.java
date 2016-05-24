package kata2;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void StringCalculatorShouldReturnZeroWithEmptyStringParam() {

		// Given
		StringCalculator s = new StringCalculator();

		// WHEN
		int somme = s.add("");

		// THEN
		assertEquals(0, somme);
	}

}
