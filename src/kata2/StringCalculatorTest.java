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

	@Test
	public void StringCalculatorShouldReturnTheParamIfOnlyOneParam() {

		// Given
		StringCalculator s = new StringCalculator();

		// WHEN
		int somme = s.add("8");

		// THEN
		assertEquals(8, somme);
	}
	
	@Test
	public void StringCalculatorShouldReturnSumWithStringParamAsIntegerSeparateWithComma()
	{
		// Given
				StringCalculator s = new StringCalculator();

				// WHEN
				int somme = s.add("2,1");

				// THEN
				assertEquals(3, somme);
		
	}

}
