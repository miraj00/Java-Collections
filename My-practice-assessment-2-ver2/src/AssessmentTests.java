import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class AssessmentTests {

	
/*
 * Write one JUnit test case for pickLongest:
 * Input: { "I", "love", "cheesey", "fries" } -> Output: 7
 * [Extended Challenge: add another test] Input: { } -> Output: 0
 * (Note: you may use any kind of List you want: ArrayList, LinkedList, etc.)	
 */
  @Test
  void pickLongestTest() {
	List<String> list = new LinkedList<>(Arrays.asList("I", "love", "cheesey", "fries"));

	Integer expected = 7;
	Integer actual = Assessment.pickLongest(list);		
	assertEquals(expected, actual);
  }
	
	
	

/*  ====================== option 1 :  With Array List =========================================
 * Write one JUnit test case for appendItems
 * Before: { "A", "B", "C" }, + { "D", "E" } -> After: { "A", "B", "C", "D", "E" }
 * (Note: you may use any kind of Set you want: HashSet, TreeSet, etc.)
 */
  @Test
  void appendItems() {

	Set<String> expected = new HashSet<String>(Arrays.asList("A", "B", "C", "D", "E"));
    System.out.println("Expected : " + expected);
	
	
	//  First set
    Set<String> a = new HashSet<String>(Arrays.asList("A", "B", "C"));
    System.out.println("First Set :" + a);
    
    
    Set<String> b = new HashSet<String>(Arrays.asList("D", "E"));
    System.out.println("Second Set :" + b);
  
    Assessment.appendItems(a, b);
           
    System.out.println("Actual Set :" + a);
    assertEquals(expected, a);  
  }
	
  
  
  
  /* ======================  Option 2 : With HashSet =========================================================================
   * Write one JUnit test case for appendItems
   * Before: { "A", "B", "C" }, + { "D", "E" } -> After: { "A", "B", "C", "D", "E" }
   * (Note: you may use any kind of Set you want: HashSet, TreeSet, etc.)
   */
    @Test
    void appendItems1() {

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

//      // Second set                                    
//      Set<String> b = new HashSet<String>();
//      b.addAll(Arrays.asList(new String[] {  "D", "E" }));        < ---- Wrong !!   This adds as an array List 
//      System.out.println(b);
      
      Assessment.appendItems(a, b);
             
      System.out.println("Actual Set :" + a);
      assertEquals(expected, a);  
    }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
