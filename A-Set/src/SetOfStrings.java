import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOfStrings {

	public static void main(String[] args) {
	
		//  First set
	    Set<String> a = new HashSet<String>();
        a.addAll( Arrays.asList(new String[] { "Hi", "How r you", "today", "morning" }));
  
        System.out.println(a);
        // Second set
        Set<String> b = new HashSet<String>();
        b.addAll(Arrays.asList(new String[] { "I", "am fine", "." , "Thanks", "for asking" }));
        System.out.println(b);
	    
        appendItems(a, b);
		

	}

	public static void appendItems(Set<String> a,Set<String> b) {
		 a.addAll(b);
	 //	 System.out.println(a.addAll(b));               // <-------   it prints true or false !!1
		 System.out.println("After adding set b into set a, value of a  : " + a);
		 System.out.println("After adding set b into set a, value of b  : " + b);
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
	
	
}
