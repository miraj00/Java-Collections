import java.util.HashSet;
import java.util.Set;


public class ArrayM {

	public static void main(String[] args) {
		
		double [] mylist = new double[] { 2.4, 4.6, 7.9 }; 	
		System.out.println(findSum(mylist));

		
		
		String[] test = createArray("No I am your father", "");
		for(int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
		}
		
		
		
		int result = catchThis("1", "2", "3");
		System.out.println(result);
		System.out.println( catchThis("3", "blah", "2") );
		System.out.println( catchThis("seven", "2", "125") );
		System.out.println( catchThis("1000", "2", "125") );
			
		
		
		
		
	}

	
	public static int catchThis(String a, String b, String c) {
		try {
			int numA = Integer.parseInt(a);
			int numB = Integer.parseInt(b);
			int numC = Integer.parseInt(c);
			
			return numA + numB + numC;
		} catch (NumberFormatException ex) {
			return 0;
		}
	}
	
	
	
	
	
	/*
	 * Write a public static method named findSum that takes in an array of doubles and
	 * returns the sum of all numbers in the array.
	 */
	 public static double findSum(double [] nums) {
		 double sum = 0; 
		 for (double num : nums) {
			 sum += num; 
		 }
		 return sum;		 
	 }
	
	 
	 
	 
	/*
	 * Create a static method named createArray that returns a String[], and takes in two String parameters: a value and a delimiter. 
	 * Your method should split the string based on the delimiter parameter and assign the values to a String[]. 
	 * The method should return the String[] of delimited values at the respective indices.
	
	  Example: given the parameters “Merry-go-round” and “-”, return the array { “Merry”, “go”, “round” }.
	 */

	public static String[] createArray(String words, String splitter) {
		String[] wordArr = words.split(splitter);
		return wordArr;
	}
	 
	 
	
	public static int liftArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			String capitalized = array[i].toUpperCase();
			array[i] = capitalized;
		}
		return array.length;
	}
	
	
	
	// in: array of int
		// out: Set of Integer
		// Strategy: loop through the array, 
	public static Set<Integer> neverTellMeTheOdds(int[] numbers) {
			// WRONG:  Set<Integer> mySet = new Set<Integer>(); // Cannot say new Set (Set is a category)
			Set<Integer> evenNumbers = new HashSet<Integer>();
			// Enhanced for loop
			// - does not use an index (no "i")
			// - instead uses a variable for each element (same type as the array)
			for (int num : numbers) {
				if (num % 2 == 0) { // it's even
					evenNumbers.add(num);
				}
			}
			
			return evenNumbers;
	}
	
	
	// From the slides...
	public static void doubleElements(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] * 2;
		}
	}
		
		

		
		
		
		
		
		
		
		
		
		
		
		
	
}
