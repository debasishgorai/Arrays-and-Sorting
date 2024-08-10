package practice;

import java.util.HashMap;
import java.util.Map;

public class nonrepea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String inputString = "abacabad";

		        int sum = sumOfNonRepeatingCharacters(inputString);
		        
		        System.out.println("Sum of non-repeating characters: " + sum);
		    }

		    public static int sumOfNonRepeatingCharacters(String input) {
		        Map<Character, Integer> m = new HashMap<>();

		        // Count the occurrences of each character in the string
		        for (char c : input.toCharArray()) {
		         m.put(c, m.getOrDefault(c, 0) + 1);
		        }

		        // Calculate the sum of values for non-repeating characters
		        int sum = 0;
		        for (char c : input.toCharArray()) {
		            if (m.get(c) == 1) {
		                sum += 1; // Assuming each character's value is set to 1
		            }
		        }

		        return sum;
		    }
	
}
