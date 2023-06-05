package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortinginAccendingandDecending {

	public static void main(String[] args) {
		 ArrayList<String>
         list = new ArrayList<String>(); 

  // Populate the ArrayList
  list.add("sorting");
  list.add("java");
  list.add("arraylist");
  list.add("in"); 
  System.out.println("Unsorted ArrayList: "
                        + list); // printed unsorted arraylist
  Collections.sort(list); // sort method for ascending order  

  System.out.println("Sorted ArrayList "
                        + "in Ascending order : "
                        + list); // print sorted arraylist
  
  // in reverse order
  Collections.sort(list, Collections.reverseOrder());
  
  System.out.println("Sorted ArrayList "
          + "in Decccending order : "
          + list); // print sorted reverse  arraylist
  
  
	}

}
