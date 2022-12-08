import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

public class LinkedListTTests {

	/*
	 * Write one JUnit test case for pickLongest:
	 * Input: { "I", "love", "cheesey", "fries" } -> Output: 7
	 * [Extended Challenge: add another test] Input: { } -> Output: 0
	 * (Note: you may use any kind of List you want: ArrayList, LinkedList, etc.)	
	 */
	  @Test
	  void pickLongestTest() {
		LinkedList<String> list = new LinkedList<>(Arrays.asList("I", "love", "cheesey", "fries"));

		Integer expected = 7;
		Integer actual = LinkedListT.pickLongest(list);		
		assertEquals(expected, actual);
	  }
		
		
		
	
}
