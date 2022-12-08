import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class HashMapGTests {

	@Test
	void testTakeItAwayReturnValue() {
		// Arrange: create the map
		Map<String, String> map = new HashMap<>();
		map.put("Pea", "Green");
		map.put("Cherry", "Red");
		map.put("Plumb", "Purple");
		
		// Act
		boolean actual = HashMapG.takeItAway(map, "Cherry");
		
		// Assert
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	void testTakeItAwayReturnValue2() {
		// Arrange: create the map
		Map<String, String> map = new HashMap<>();
		map.put("Pea", "Green");
		map.put("Cherry", "Red");
		map.put("Plumb", "Purple");
		
		// Act
		boolean actual = HashMapG.takeItAway(map, "Apple");
		
		// Assert
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	void testTakeItAwayRemovesValue() {
		// Arrange: create the map
		Map<String, String> inputMap = new HashMap<>();
		inputMap.put("Pea", "Green");
		inputMap.put("Cherry", "Red");
		inputMap.put("Plumb", "Purple");
		
		// Act
		HashMapG.takeItAway(inputMap, "Cherry");
		
		// Assert
		Map<String, String> expected = new HashMap<>();
		expected.put("Pea", "Green");
		expected.put("Plumb", "Purple");
		assertEquals(expected, inputMap);
	}
		
	
	
	
	
}
