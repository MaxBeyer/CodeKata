package Kata1;

import java.util.HashMap;
import java.util.Map;

public class NumeralMap {
	
	//our kata only has us converting up to 1000, so we only map up to that value
	public Map<Integer, String> numeral() {
		Map<Integer, String> numeral = new HashMap<Integer, String>();
		numeral.put(0, "");
		numeral.put(1, "I");
		numeral.put(2, "II");
		numeral.put(3, "III");
		numeral.put(4, "IV");
		numeral.put(5, "V");
		numeral.put(6, "VI");
		numeral.put(7, "VII");
		numeral.put(8, "VIII");
		numeral.put(9, "IX");
		numeral.put(10, "X");
		numeral.put(20, "XX");
		numeral.put(30, "XXX");
		numeral.put(40, "XL");
		numeral.put(50, "L");
		numeral.put(60, "LX");
		numeral.put(70, "LXX");
		numeral.put(80, "LXXX");
		numeral.put(90, "XC");
		numeral.put(100, "C");
		numeral.put(200, "CC");
		numeral.put(300, "CCC");
		numeral.put(400, "CD");
		numeral.put(500, "D");
		numeral.put(600, "DC");
		numeral.put(700, "DCC");
		numeral.put(800, "DCCC");
		numeral.put(900, "CM");
		numeral.put(1000, "M");
		return numeral;
	}
}
