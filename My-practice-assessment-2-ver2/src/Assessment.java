import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Assessment {

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
	
	    
	    
	   //  First set
	    Set<String> a = new HashSet<String>();
        a.addAll( Arrays.asList(new String[] { "Hi", "How r you", "today", "morning" }));
  
        System.out.println(a);
        // Second set
        Set<String> b = new HashSet<String>();
        b.addAll(Arrays.asList(new String[] { "I", "am fine", "." , "Thanks", "for asking" }));
        System.out.println(b);
	    
        appendItems(a, b);
    
	}

/*  ======================================================================================================
 * 	Write a public static method named pickLongest that takes in a List of Strings 
 * and returns the length of the longest String. If the list is empty, return 0. 
 * (Hint… this is similar to a "max" algorithm.)
 */
 public static Integer pickLongest(List<String> list ) {
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
 
 public static Integer pickShortest(List<String> list ) {
	 	int length = list.get(0).length();              	 //	System.out.println("length :" + length);
		for (String word : list) {
			if (length > word.length()) {
				length = word.length();
			}
		}
		return length;	 	  
}
 
	
/*  ====================================================================================
 * Write a public static method named appendItems that takes in two Sets of Strings. 
 * The method adds all items from the second set into the first set. 
 * It does not change the second set. 
 * It returns nothing.
 */
public static void appendItems(Set<String> a,Set<String> b) {
	 a.addAll(b);
 //	 System.out.println(a.addAll(b));               // <-------   it prints true or false !!1
	 System.out.println("After adding set b into set a, value of a  : " + a);
	 System.out.println("After adding set b into set a, value of b  : " + b);
}
	
 
 
 
}
