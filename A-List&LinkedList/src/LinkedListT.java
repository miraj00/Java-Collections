import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListT {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		
		
		
		
		LinkedList<String> blanklist = new LinkedList<>(Arrays.asList(""));
		System.out.println(blanklist);
		
		LinkedList<String> list = new LinkedList<>(Arrays.asList("Take a Break and go on the vacation next week", "Hello", "how are you", "Come here", "I am here, where are you"));
		System.out.println(list);
				
		//Longest
		System.out.println(pickLongest(list));
	    //Blank list
	    System.out.println(pickLongest(blanklist));
		
		//Shortest	    
	    System.out.println(pickShortest(list));
	    //Blank list
	    System.out.println(pickShortest(blanklist));

	}

	
	/*  =============================================================================================================
	 * Create a static method named findMin that takes in a LinkedList<Integer> as a parameter and returns an int.
	 * Your method should return the smallest number in the LinkedList<Integer>.
 	 * Example: given the LinkedList { 5, 2, 88 }, return 2.
	*/
	
	public static int findMin(LinkedList<Integer> list) {
		int min = Integer.MAX_VALUE;                                                //      <-------------------------------- ????????????????????
		for (int i : list) {
			if (i < min) {
				min = i;
			}
		}
		return min;
	}
	
	
	

/*  ======================================================================================================
 * 	Write a public static method named pickLongest that takes in a List of Strings 
 * and returns the length of the longest String. If the list is empty, return 0. 
 * (Hint… this is similar to a "max" algorithm.)
 */
 public static Integer pickLongest(LinkedList<String> list ) {
	 	int length = 0;                                           
		for (String word : list) {
			if (length < word.length()) {
				length = word.length();
			}
		}
		return length;	 	  
 }
 
 /*  ====================================================================================================
  * 	Write a public static method named pickShortest that takes in a List of Strings 
  * and returns the length of the shortest String. If the list is empty, return 0. 
  * (Hint… this is similar to a "max" algorithm.)
  */
 
 public static Integer pickShortest(LinkedList<String> list ) {
	 	int length = list.get(0).length();              	 //	System.out.println("length :" + length);
		for (String word : list) {
			if (length > word.length()) {
				length = word.length();
			}
		}
		return length;	 	  
}
 
	
	
	
	
	
	
}
