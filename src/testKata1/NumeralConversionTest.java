package testKata1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Kata1.NumeralConverter;

class NumeralConversionTest {

	@Test
	void testNumeralConverter4() {
		NumeralConverter converter = new NumeralConverter();
		String result = converter.convertNumeralToNumber("IV");
		assertEquals("4", result);
	}
	@Test
	void testNumeralConverter1234() {
		NumeralConverter converter = new NumeralConverter();
		String result = converter.convertNumeralToNumber("MCCXXXIV");
		assertEquals("1234", result);
	}
	@Test
	void testNumeralConverter19() {
		NumeralConverter converter = new NumeralConverter();
		String result = converter.convertNumeralToNumber("XIX");
		assertEquals("19", result);
	}

}
