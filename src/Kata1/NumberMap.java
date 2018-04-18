package Kata1;

import java.util.HashMap;
import java.util.Map;

public class NumberMap {
	
	public Map<String, Integer> number() {
		Map<String, Integer> number = new HashMap<String, Integer>();
		number.put("I", 1);
		number.put("IV", 4);
		number.put("V", 5);
		number.put("IX", 9);
		number.put("X", 10);
		number.put("XL", 40);
		number.put("L", 50);
		number.put("XC", 90);
		number.put("C", 100);
		number.put("CD", 400);
		number.put("D", 500);
		number.put("CM", 900);
		number.put("M", 1000);
		return number;
	}

}
