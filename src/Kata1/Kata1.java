package Kata1;
public class Kata1 {
	
	//main method used for random numeral verification
	public static void main(String[] args) {
		NumberConverter numberConverter = new NumberConverter();
		NumeralConverter numeralConverter = new NumeralConverter();
		Integer testNumber = 1234;
		String romanNumeral = numberConverter.convertNumberToNumeral(testNumber);
		System.out.println("Roman Numeral: " + romanNumeral);
		String number = numeralConverter.convertNumeralToNumber(romanNumeral);
		System.out.println("Number: " + number);
	}

}
