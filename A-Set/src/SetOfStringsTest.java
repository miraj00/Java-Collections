import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class SetOfStringsTest {

	
	/*
	 * Write one JUnit test case for appendItems
	 * Before: { "A", "B", "C" }, + { "D", "E" } -> After: { "A", "B", "C", "D", "E" }
	 * (Note: you may use any kind of Set you want: HashSet, TreeSet, etc.)
	 */
	  @Test
	  void appendItems() {

		Set<String> expected = new HashSet<String>();
		expected.add("A");
	    expected.add("B");
	    expected.add("C");
	    expected.add("D");
	    expected.add("E");
		
	    System.out.println("Expected : " + expected);
		
		
		//  First set
	    Set<String> a = new HashSet<String>();
	     a.add("A");
	     a.add("B");
	     a.add("C");
	    System.out.println("First Set :" + a);
	    
	    
	    Set<String> b = new HashSet<String>();
	     b.add("D");
	     b.add("E");
	    System.out.println("Second Set :" + b);

//	    // Second set                                    
//	    Set<String> b = new HashSet<String>();
//	    b.addAll(Arrays.asList(new String[] {  "D", "E" }));        < ---- Wrong !!   This adds as an array List 
//	    System.out.println(b);
	    
	    SetOfStrings.appendItems(a, b);
	           
	    System.out.println("Actual Set :" + a);
	    assertEquals(expected, a);  
	  }	
	
}
