import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ArrayListOTest {


	/* Write one JUnit test case for add
	 * Before: { 4, 12, 5 }, + 5 -> After: { 9, 17, 10 }
	 * (Note: you may use any kind of List you want: ArrayList, LinkedList, etc.)
	 */
	@Test
	void addTest() {
	
		ArrayList<Integer> expectedlist = new ArrayList<>(Arrays.asList(9, 17, 10));
		ArrayList<Integer> expected = expectedlist  ;
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 12, 5));
		 ArrayListO.add(list, 5);	
		 assertEquals(expected, list); 
	}


	/* ================================================================================================
	 * addNum()
		the parameters 4 and { 3, 7, 2 }, the resulting ArrayList should be { 3, 7, 2, 4 }
		the parameters 4 and { 4, 6, 8 }, the ArrayList should remain unchanged at { 4, 6, 8 }.	
	 */
		
		@Test
		void testAddNum1() {
			ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 7, 2)); 
			ArrayList<Integer> actual = ArrayListO.addNum(4, list);
			ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(3, 7, 2, 4)); 
			assertEquals(expected, actual);
			assertSame(list, actual); // It returned the same list
		}
		
		@Test
		void testAddNum2() {
			ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 6, 8)); 
			ArrayList<Integer> actual = ArrayListO.addNum(4, list);
			ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(4, 6, 8)); 
			assertEquals(expected, actual);
			assertSame(list, actual); // It returned the same list
		}
	
	
		// { "hi", "mom!" } -> changes { "HI", "MOM!" }
		// { "hi", "mom!" } -> return 2 **
		// { "This", "is", "Java." } -> changes { "THIS", "IS", "JAVA." }
		// { "This", "is", "Java." } -> return 3	
		
		@Test // Type 1: input --> output
		void testLift1() {
			// How to create a list. (Option 1)
			ArrayList<String> inputList = new ArrayList<>();
			inputList.add("hi");
			inputList.add("mom!");
			
			int expected = 2;
			int actual = ArrayListO.lift(inputList);
			assertEquals(expected, actual);
		}
		
		@Test
		void testLift2() {
			// How to create a list. (Option 2) WARNING: This List is not an ArrayList and cannot change length.
			List<String> inputList = Arrays.asList("This", "is", "Java.");
			
			int expected = 3;
			int actual = ArrayListO.lift(inputList);
			assertEquals(expected, actual);
		}
		
		@Test
		void testLift3() {
			// How to create a list. (Option 3) 
			ArrayList<String> inputList = new ArrayList<>(Arrays.asList("This", "is", "very", "Java."));
			
			int expected = 4;
			int actual = ArrayListO.lift(inputList);
			assertEquals(expected, actual);
		}
	

		@Test // TYPE 2 - before and after
		void testLiftCapitalizes1() {
			// Arrange: create the list
			ArrayList<String> inputList = new ArrayList<>();
			inputList.add("hi");
			inputList.add("mom!");
			
			// Act: call the method
			int lengthOfList = ArrayListO.lift(inputList);
			
			// Assert: did it actually capitalize the list
			// List of "HI", "MOM!"
			List<String> expected = Arrays.asList("HI", "MOM!");
			assertEquals(expected, inputList);
		}	
		
		
		
		
	
}
