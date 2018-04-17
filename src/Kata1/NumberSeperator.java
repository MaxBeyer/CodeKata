package Kata1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberSeperator {
	
	private static final Set<Integer> values = new HashSet<Integer>(Arrays.asList(1, 10, 100, 1000));

	public Integer seperate(int number, int position) {
		int result = 0;
		try {
			if(!values.contains(position)) {
				throw new IllegalArgumentException("The position variable must be 1, 10, 100, or 1000");
			}
			result = number % (position * 10);
			result = result - (result % position);
		}
		catch(IllegalArgumentException e) {

		}
		return result;
	}

}
