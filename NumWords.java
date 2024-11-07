// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int number = Integer.parseInt(args[0]);
		int hundreds, tens, ones = 0;
	
		// number = number % 1000;
		hundreds = number / 100;
		tens = number / 10 % 10;
		ones = number % 10;
		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
	}
}
