package testKata1;

import static org.junit.jupiter.api.Assertions.*;
import Kata1.*;

import org.junit.jupiter.api.Test;

class NumberConversionTest {

	private NumberConversion converter = new NumberConversion();
	@Test
	void testNumberToNumeral1() {
		String result1 = converter.convertNumberToNumeral(1);
		assertEquals("I", result1);
	}
	@Test
	void testNumberToNumeral4() {
		String result4 = converter.convertNumberToNumeral(4);
		assertEquals("IV", result4);
	}
	@Test
	void testNumberToNumeral5() {
		String result5 = converter.convertNumberToNumeral(5);
		assertEquals("V", result5);
	}
	@Test
	void testNumberToNumeral7() {
		String result7 = converter.convertNumberToNumeral(7);
		assertEquals("VII", result7);
	}
	@Test
	void testNumberToNumeral10() {
		String result10 = converter.convertNumberToNumeral(10);
		assertEquals("X", result10);
	}
	@Test
	void testNumberToNumeral49() {
		String result49 = converter.convertNumberToNumeral(49);
		assertEquals("XLIX", result49);
	}
	@Test
	void testNumberToNumeral50() {
		String result50 = converter.convertNumberToNumeral(50);
		assertEquals("L", result50);
	}
	@Test
	void testNumberToNumeral59() {
		String result59 = converter.convertNumberToNumeral(59);
		assertEquals("LIX", result59);
	}
	@Test
	void testNumberToNumeral100() {
		String result100 = converter.convertNumberToNumeral(100);
		assertEquals("C", result100);
	}
	@Test
	void testNumberToNumeral500() {
		String result500 = converter.convertNumberToNumeral(500);
		assertEquals("D", result500);
	}
	@Test
	void testNumberToNumeral504() {
		String result504 = converter.convertNumberToNumeral(504);
		assertEquals("DIV", result504);
	}
	@Test
	void testNumberToNumeral700() {
		String result700 = converter.convertNumberToNumeral(700);
		assertEquals("DCC", result700);
	}
	@Test
	void testNumberToNumeral1000() {
		String result1000 = converter.convertNumberToNumeral(1000);
		assertEquals("M", result1000);
	}

}
