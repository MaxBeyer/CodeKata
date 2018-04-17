package Kata1;

public class NumberConversion {
	
	private NumberSeperator numberSeperator = new NumberSeperator();
	private NumeralMap numeralMap = new NumeralMap();

	public String convertNumberToNumeral(Integer number) {
		String romanNumeral = "";
		for(int i = 0, position = 1; i < number.toString().length(); i++) {
			romanNumeral = numeralMap.numeral().get(numberSeperator.seperate(number, position)) + romanNumeral;
			position *= 10;
		}
		return romanNumeral;
	}

}
