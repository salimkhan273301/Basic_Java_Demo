package List;

import java.util.Iterator;
import java.util.LinkedList;



public class ArrayListDemo {
	
	// there i have written some diffrent ways to print the data.

	public static void main(String[] args) {
		  LinkedList<String> l = new LinkedList<String>();
	      l.add("John");
	      l.add("Sara");
	      l.add("Susan");
	      l.add("Betty");
	      l.add("Nathan");
	      System.out.println("The LinkedList elements are: ");
	      
	      
	      Iterator i = l.iterator();
	      while ( i.hasNext()) {
	         System.out.println(i.next());
	      }
	      
	      
	      System.out.println("-------------------------------------------");
	      for (Iterator it = l.iterator(); it.hasNext();) {
	          System.out.print(it.next()+"\t");
	       }
	      
	      System.out.println("\n-----------------------------------------");
	      
	      for(String x:l) {
	    	  System.out.println(x);
	      }
	      
	      System.out.println("---------------------------------------------");
	      
	      for(int j=0; j<l.size(); j++)
	      {
	    	  System.out.print(l.get(j)+"\t");
	      }
	      
	  System.out.println("\n------------------------------------------------------");    
	      int m=0;
	      while(m<l.size()) {
	    	  System.out.println(l.get(m));
	    	  m++;
	      }

	}

}
