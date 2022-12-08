import java.util.List;

public class Lists {

	public static void main(String[] args) {
		

	}

	
	// in: List of Strings ( List<String> )
		// out: length of the list (int)
	public static int lift(List<String> list) {
			// use a regular counting for loop because we are modifying as we loop
			for (int i = 0; i < list.size(); i++) {
				String capitalized = list.get(i).toUpperCase();   // get the item, get the capital version
				list.set(i, capitalized);   // set the item back into the list
				
				// Shortcut version: list.set(i, list.get(i).toUpperCase());
			}
			
			return list.size();
	}
	
		
		
	public static void doubleElements(List<Integer> nums) {
			for (int i = 0; i < nums.size(); i++) {
				nums.set(i, nums.get(i) * 2);
			}
	}	
		
	
}
