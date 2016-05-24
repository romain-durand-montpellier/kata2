package kata2;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	
	StringCalculator sc ;
	public StringCalculatorTest() {
		// Given
		 sc = new StringCalculator();
	}
	
	@Test
	public void StringCalculatorShouldReturnZeroWithEmptyStringParam() {
		// WHEN
		int somme = sc.add("");

		// THEN
		assertEquals(0, somme);
	}

	@Test
	public void StringCalculatorShouldReturnTheParamIfOnlyOneParam() {
		// WHEN
		int somme = sc.add("8");

		// THEN
		assertEquals(8, somme);
	}

	@Test
	public void StringCalculatorShouldReturnSumWithStringParamAsIntegerSeparateWithComma() {
		// WHEN
		int somme = sc.add("2,1");

		// THEN
		assertEquals(3, somme);
	}

}
