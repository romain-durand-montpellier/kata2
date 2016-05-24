package kataromjon;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	
	private static final String EMPTY_PARAM = "";
	private static final int EMPTY_PARAM_RESULT = 0;
	
	private static final String ONE_PARAM = "1";
	private static final int ONE_PARAM_RESULT = 1;
	
	private static final String TWO_PARAM = "1,2";
	private static final int TWO_PARAM_RESULT = 3;	
	
	private static final String INFINITE_PARAM = "1,2,3,4";
	private static final int INFINITE_PARAM_RESULT = 10;
	
	private static final String CARRIER_PARAM = "1\n2,3";
	private static final int CARRIER_PARAM_RESULT = 6;
	
	private static final String CUSTOM_PARAM = "//;\n1;2";
	private static final int CUSTOM_PARAM_RESULT = 3;	
	
	
	private StringCalculator sc ;
	public StringCalculatorTest() {
		// Given
		 sc = new StringCalculator();
	}
	
	@Test
	public void StringCalculatorShouldReturnZeroWithEmptyStringParam() {
		// WHEN
		int somme = sc.add(EMPTY_PARAM);

		// THEN
		assertEquals(EMPTY_PARAM_RESULT, somme);
	}

	@Test
	public void StringCalculatorShouldReturnTheParamIfOnlyOneParam() {
		// WHEN
		int somme = sc.add(ONE_PARAM);

		// THEN
		assertEquals(ONE_PARAM_RESULT, somme);
	}

	@Test
	public void StringCalculatorShouldReturnSumWithStringParamAsTwoIntegerSeparateWithComma() {
		// WHEN
		int somme = sc.add(TWO_PARAM);

		// THEN
		assertEquals(TWO_PARAM_RESULT, somme);
	}
	
	@Test
	public void StringCalculatorShouldReturnSumWithStringParamAsInfiniteIntegerSeparateWithComma() {
		// WHEN
		int somme = sc.add(INFINITE_PARAM);

		// THEN
		assertEquals(INFINITE_PARAM_RESULT, somme);
	}	
	
	@Test
	public void StringCalculatorShouldReturnSumWithStringParamAsInfiniteIntegerSeparateWithCommaAndCarrier() {
		// WHEN
		int somme = sc.add(CARRIER_PARAM);

		// THEN
		assertEquals(CARRIER_PARAM_RESULT, somme);
	}	

	@Test
	public void ReturnSumWithCustomDelim() {
		// WHEN
		int somme = sc.add(CUSTOM_PARAM);

		// THEN
		assertEquals(CUSTOM_PARAM_RESULT, somme);
	}	
}
