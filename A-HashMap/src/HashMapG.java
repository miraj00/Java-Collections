import java.util.HashMap;
import java.util.Map;

public class HashMapG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	/* Create a static method named modifyMap that takes in a HashMap<String, String> and returns a String. 
	 * Add the key “java” with the String value “test” to the map. Your method should return the newly added value only, as a String.
	 * Example: given the HashMap parameter { key: “peanut butter” -> value: “jelly”, key: “bread” -> value: “butter” }, add to the HashMap so that
	 * it is { key: “peanut butter” -> value: “jelly”, key: “bread” -> value: “butter”, key: “java” -> value: “test” } AND return “test”.
	 */
	public static String modifyMap(HashMap<String, String> map) {
		map.put("java", "test");

		return map.get("java");
	}
	

	public static boolean takeItAway(Map<String, String> map, String key) {
		boolean keyExists = map.containsKey(key);
		if (keyExists) {
			map.remove(key);
		}
		
		return keyExists;
	}
	
	
	
	
	
	
	
	
	
	
}
