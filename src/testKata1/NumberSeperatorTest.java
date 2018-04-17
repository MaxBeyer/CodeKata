package testKata1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Kata1.NumberSeperator;

class NumberSeperatorTest {

	@Test
	void testSeperate1000s() {
		int testNum = 1234;
		NumberSeperator numberSeperator = new NumberSeperator();
		int onesValue = numberSeperator.seperate(testNum, 1);
		int tensValue = numberSeperator.seperate(testNum, 10);
		int hundredsValue = numberSeperator.seperate(testNum, 100);
		int thousandsValue = numberSeperator.seperate(testNum, 1000);
		assertEquals(1000, thousandsValue);
		assertEquals(200, hundredsValue);
		assertEquals(30, tensValue);
		assertEquals(4, onesValue);
	}
	@Test
	void testSeperateWith0s() {
		int testNum = 100;
		NumberSeperator numberSeperator = new NumberSeperator();
		int onesValue = numberSeperator.seperate(testNum, 1);
		int tensValue = numberSeperator.seperate(testNum, 10);
		int hundredsValue = numberSeperator.seperate(testNum, 100);
		assertEquals(100, hundredsValue);
		assertEquals(00, tensValue);
		assertEquals(0, onesValue);
	}
	@Test
	void testSeperate1s() {
		int testNum = 1;
		NumberSeperator numberSeperator = new NumberSeperator();
		int onesValue = numberSeperator.seperate(testNum, 1);
		assertEquals(1, onesValue);
	}
}
