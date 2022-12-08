import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ListsTests {

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
			int actual = Lists.lift(inputList);
			assertEquals(expected, actual);
		}
		
		@Test
		void testLift2() {
			// How to create a list. (Option 2) WARNING: This List is not an ArrayList and cannot change length.
			List<String> inputList = Arrays.asList("This", "is", "Java.");
			
			int expected = 3;
			int actual = Lists.lift(inputList);
			assertEquals(expected, actual);
		}
		
		@Test
		void testLift3() {
			// How to create a list. (Option 3) 
			ArrayList<String> inputList = new ArrayList<>(Arrays.asList("This", "is", "very", "Java."));
			
			int expected = 4;
			int actual = Lists.lift(inputList);
			assertEquals(expected, actual);
		}	





}
