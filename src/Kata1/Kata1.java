package Kata1;
public class Kata1 {
	
	//main method used for random numeral verification
	public static void main(String[] args) {
		NumberConversion numberConversion = new NumberConversion();
		Integer number = 1234;
		String romanNumeral = numberConversion.convertNumberToNumeral(number);
		System.out.println(romanNumeral);
	}

}
