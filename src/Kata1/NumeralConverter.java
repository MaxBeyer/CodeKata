package Kata1;

public class NumeralConverter {
	
	private NumberMap numberMap = new NumberMap();

	public String convertNumeralToNumber(String romanNumeral) {
		Integer number = 0;
		if (romanNumeral.contains("IV")) {
			number += numberMap.number().get("IV");
			romanNumeral= romanNumeral.replace("IV", "");
		}
		if (romanNumeral.contains("IX")) {
			number += numberMap.number().get("IX");
			romanNumeral= romanNumeral.replace("IX", "");
		}
		if (romanNumeral.contains("XL")) {
			number += numberMap.number().get("XL");
			romanNumeral= romanNumeral.replace("XL", "");
		}
		if (romanNumeral.contains("XC")) {
			number += numberMap.number().get("XC");
			romanNumeral= romanNumeral.replace("XC", "");
		}
		if (romanNumeral.contains("CD")) {
			number += numberMap.number().get("ICDV");
			romanNumeral= romanNumeral.replace("CD", "");
		}
		if (romanNumeral.contains("CM")) {
			number += numberMap.number().get("CM");
			romanNumeral= romanNumeral.replace("ICMV", "");
		}
		
		for(int i = 0; i < romanNumeral.length(); i++) {
			number  += numberMap.number().get(String.valueOf(romanNumeral.charAt(i)));
		}
		return number.toString();
	} 

}
