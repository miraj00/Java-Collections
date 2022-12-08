
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeTest {

	// test cases : 
	// pineapple ---> false
	// racecar -----> true
	// noon  -------> true
	// moon  -------> false 
	// noun  --------> false
	// (empty string? ) ----> ???
	
	
	@Test
	void test1() {
		// what we expect to get back ( i.e. return value)
		boolean expected = false;
		// what the method actually gave us back
		boolean actual = PalindromeApp.isPalindrome("pineapple");
		// make sure they match!
		assertEquals(expected, actual);
	}

	@Test
	void test2() {
		boolean expected = true;
		boolean actual = PalindromeApp.isPalindrome("racecar");
		assertEquals(expected, actual);
	}	
	
	@Test
	void test3() {
		// here is an example of shorter syntax
		assertEquals(true, PalindromeApp.isPalindrome("noon"));
	}	
	
	@Test
	void test4() {
		boolean expected = false;
		boolean actual = PalindromeApp.isPalindrome("moon");
		assertEquals(expected, actual);
	}
	
	
	@Test
	void test5() {
		boolean expected = false;
		boolean actual = PalindromeApp.isPalindrome("noun");
		assertEquals(expected, actual);
	}

	@Test
	void test6() {
		boolean expected = true;
		boolean actual = PalindromeApp.isPalindrome("MoM");
		assertEquals(expected, actual);
	}
	
	
}
