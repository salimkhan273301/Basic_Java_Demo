package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

//it can contain multiple  null value.
	//it can  hold dublicate value.
	// it  follow insertion Order...
	 // we can add homogenious and nonhomogenious data in Collection if it is not generic(ArrayList<String> li=new ArrayList<String>())



public class ListDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		List l=new ArrayList();
//		System.out.println("how many element you want to enter:");
//		int a=sc.nextInt();
//		for(int i=0; i<=a; i++) {
//			l.add(sc.next());
//		}
//		System.out.println(l);
		//sc.close();
		
		System.out.println("---------------------------------------------------------------------");
		
		
//		List l=new LinkedList();
//		System.out.println("how many element you want to enter:");
//		int a=sc.nextInt();
//		for(int i=0; i<=a; i++) {
//			l.add(sc.next());
//		}
//		System.out.println(l);
		
		
		
		
//		List l=new Vector();
//		System.out.println("how many element you want to enter:");
//		int a=sc.nextInt();
//		for(int i=0; i<=a; i++) {
//			l.add(sc.next());
//		}
//		System.out.println(l);
//		
		
		
		List l=new Stack();
		System.out.println("how many element you want to enter:");
		int a=sc.nextInt();
		for(int i=0; i<=a; i++) {
			l.add(sc.next());
			//System.out.println(l.remove(0));
		}
		System.out.println(l);
		
		Iterator it=l.iterator();
		
		while(it.hasNext()) {
			
			
			
			System.out.println(it.next());
		}
		
		for(Object x:l) {
			System.out.print(x+"\t");
			
		}
		
		System.out.println("\n");
		for(int i=0; i<l.size(); i++) {
			
			System.out.print(l.get(i)+"\t");
		}

	}

}
