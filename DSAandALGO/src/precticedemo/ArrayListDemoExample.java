package precticedemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListDemoExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		// 1st Approach to print
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println("\n");
		
		
		
		// 2 Approach to print
		
		int i=0;
		while(i<list.size()) {
			System.out.print(list.get(i)+" ");
			i++;
		}
		
		System.out.println("\n");
		
		
		// 3 Approach to print
		for(int x:list) {
			System.out.print(x+" ");
		}
		
		System.out.println("\n");
		
		
		
		// 4 Approach to print
		
		list.stream().forEach(y->{
			System.out.print(y+" ");
		});

		System.out.println("\n");
		// 5 Approach to print
		
		
		
		Iterator it=list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		
		
		System.out.println("\n");
		// 6 Approach to print
		
		list.stream().forEach(System.out::println);
		

	}

}
