package ARRAY;

import java.util.SortedSet;
import java.util.TreeSet;

public class SecondLargestItemInArray {

	public static void main(String[] args) {
		int[] arr= {1,2,1,5,4,7,6,8,9,19,11};
		SortedSet<Integer> set=new TreeSet<Integer>();
		for(int x:arr) {
			set.add(x);
		}

		System.out.println(set);
		
		System.out.println("Second Largest Element in Array:");
		set.remove(set.last());
		System.out.println(set.last());
	}

}
