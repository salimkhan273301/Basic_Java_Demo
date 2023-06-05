package List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l = new LinkedList<String>();
		l.add("John");
		l.add("Sara");
		l.add("Susan");
		l.add("Betty");
		l.add("Nathan");
		System.out.println("The LinkedList elements are: ");
		for (Iterator i = l.iterator(); i.hasNext();) {
		   System.out.println(i.next());
		}

	}

}
