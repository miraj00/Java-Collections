import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListO {

	public static void main(String[] args) {
		
//		ArrayList<Integer> newList = new ArrayList<Integer>() { 4, 6, 8, 10 };    < ----- Wrong
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 6, 8, 10));
		System.out.println(list);
	    add(list, 5);
	       

	}

	
	/* ====================================================================================================
	 * Write a public static method named add that takes a List of Integers and
	 * a single int as parameters. It returns nothing.
	 * The method modifies all the Integers in the list by adding the single int.
	 */
	public static void add (ArrayList<Integer> numList, int num ) {
		// ArrayList<Integer> newList = new ArrayList<Integer>();
	
		for (int i =0; i< numList.size(); i++ ) {
			numList.set(i, numList.get(i) + num );				
		}
		
//		for ( Integer list : numList ) {                  < ------  advanced for loop will not work since making changes in arraylist elements
//			 numList.add(list + num );			 
//		}
		
		System.out.println(numList);
	}
	
	
	/* =================================================================================================================
	 * Create a static method named addNum that returns an ArrayList<Integer> and takes in an int and an ArrayList<Integer> as parameters.
	 * You should check to see if the ArrayList contains the int parameter that was passed into the method, if not add that value to the list and 
	 * return the updated ArrayList. If the number already exists in the list don’t make any modifications to the list, and return the original list.
	
	Example 1: given the parameters 4 and { 3, 7, 2 }, update the ArrayList to { 3, 7, 2, 4 } and return it.
	Example 2: given the parameters 4 and { 4, 6, 8 }, don’t make modifications. Just return the ArrayList as is.

	 */
	
	public static ArrayList<Integer> addNum(int num, ArrayList<Integer> list) {
		if (!list.contains(num)) {
			list.add(num);
		}

		return list;
	}
	
	
	public static int lift(List<String> list) {
		// use a regular counting for loop because we are modifying as we loop
		for (int i = 0; i < list.size(); i++) {
			String capitalized = list.get(i).toUpperCase();   // get the item, get the capital version
			list.set(i, capitalized);   // set the item back into the list
			
			// Shortcut version: list.set(i, list.get(i).toUpperCase());
		}
		
		return list.size();
	}
	
	
	
	
	
}
