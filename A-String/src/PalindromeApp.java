import java.util.Scanner;

// palindrome : same forwards and backwards. eg. racecar , pop, mom, noon 


public class PalindromeApp {

	
	// 1. main method will have the user interaction logic
	// 2. isPalindrome method will  the logic to check if the word is a palindrome
	// 3. automated tests for isPalindrome method 		
	
	
	
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a word : ");
		String word = scnr.nextLine();
	
//		// option 1: 
//		boolean answer = isPalindrome(word);
//		if (answer == true) {
//			System.out.println("It is a palindrome");
//		} else {
//			System.out.println("It's not a palindrome");		
//		}
			
		// option 2 : 
		if (isPalindrome(word) == true) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("It's not a palindrome");		
		}
		
		scnr.close();
	}

	// information in : word (string) --- parameter(s)
	// Information out : the answer ( boolean ) -- return value
	public static boolean isPalindrome(String word) {
		
		// reverse the word. then compare that with the original
		// check the first and last, move inward, repeat
		
		// 0123456 ( length 7 )
		// racecar
		 word = word.toLowerCase();
		for (int i = 0; i<= word.length()/2; i++ ) {
			if (word.charAt(i) == word.charAt(word.length()- i - 1)) {
			   // match					
			} else {
			    // not match
				return false;
			}
		}
					
		return true;
	}		
}