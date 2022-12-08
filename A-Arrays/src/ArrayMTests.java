import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class ArrayMTests {

	/* Write one JUnit test case for findSum:
	 * Input: { 2.5, 7.5, 10.0 } -> Output: 20.0	
	 */	
	@Test
	void findSumTest() {
		double [] mylist = new double[] { 2.5, 7.5, 10.0 }; 
		double expected = 20.0 ;
		double actual = ArrayM.findSum(mylist);
		assertEquals(expected, actual);		
	}
	
	
	/*
	 * Using JUnit, write some tests for the previous methods. Test cases should include the following: 
	createArray 
		the parameters "hello" and "" should return an array of size 5 containing {"h","e","l","l","o"} 
		the parameters "No I am your father" and " " should return an array of size 5 with the following values: {"No", "I", "am","your","father"}
		the parameters "I'm making waffles" and "a" should return an array of size 3 with the following values: {"I'm m", "king w", "ffles"}
	 */				
		@Test
		void testCreateArray1() {
			String[] expected = { "h", "e", "l", "l", "o" };
			String[] actual = ArrayM.createArray("hello", "");
			assertArrayEquals(expected, actual);
		}

		@Test
		void testCreateArray2() {
			String[] expected = { "No", "I", "am", "your", "father" };
			String[] actual = ArrayM.createArray("No I am your father", " ");
			assertArrayEquals(expected, actual);
		}

		@Test
		void testCreateArray3() {
			String[] expected = { "I'm m", "king w", "ffles" };
			String[] actual = ArrayM.createArray("I'm making waffles", "a");
			assertArrayEquals(expected, actual);
		}
	
	
		@Test
		void testLiftArray1() {
			// How to create a array. (Option 1)
			String[] inputArray = new String[2];
			inputArray[0] = "hi";
			inputArray[1] = "mom!";	
			
			int expected = 2;
			int actual = ArrayM.liftArray(inputArray);
			assertEquals(expected, actual);
		}
		
		@Test
		void testLiftArray2() {
			// How to create a array. (Option 2) - exact same result
			String[] inputArray = new String[] { "Java", "is", "cool!" };	
			
			int expected = 3;
			int actual = ArrayM.liftArray(inputArray);
			assertEquals(expected, actual);
		}		
	
		
		@Test
		void testLiftCapitalizesArray1() {
			// Arrange: create the array
			String[] inputArray = new String[2];
			inputArray[0] = "hi";
			inputArray[1] = "mom!";	
			
			// Act: call the method
			int lengthOfArray = ArrayM.liftArray(inputArray);
			
			// Assert: did it actually capitalize the array
			// List of "HI", "MOM!"
			String[] expected = { "HI", "MOM!" };
			assertArrayEquals(expected, inputArray); // MUST use assertArrayEquals for arrays
		}
		
	
		@Test
		void testNeverTellMeTheOdds() {
			// Arrange:
			int[] nums = { 1, 2, 3, 5, 8 };
			
			// Act
			Set<Integer> actual = ArrayM.neverTellMeTheOdds(nums);
			
			// Assert:
			// Option 1 for creating a set
			Set<Integer> expected = new HashSet<>();
			expected.add(2);
			expected.add(8);
			
			assertEquals(expected, actual);
		}		
	
		
		@Test
		void testNeverTellMeTheOdds2() {
			// Arrange:
			int[] nums = { 1, 5, 7, 2, 24 };
			
			// Act
			Set<Integer> actual = ArrayM.neverTellMeTheOdds(nums);
			
			// Assert:
			// Option 2 for creating a set (shortcut)
			Set<Integer> expected = new HashSet<>(Arrays.asList(2, 24));
			assertEquals(expected, actual);
		}
		
		
		
		
}
