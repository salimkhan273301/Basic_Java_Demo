package ARRAY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySortingDemoByMethod {

	public static void main(String[] args) {
		int[] arr= {2,4,5,3,7,8,5,9,0,22,11,3,34,55};
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Sorting in Reverseorder:");
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		String[] s= {"Salim","Hasan","Nadeem","Amirullah","Rehan"};
		
		List list=new ArrayList<String>();
		Collections.addAll(list, s);// best technic from array to ArrayList;
		
		List list1=new ArrayList<String>(Arrays.asList(s));// this is also a technic to chenge from array to arraylist but not good technic;
		
		System.out.println("Sort the String Array:");
		
		Collections.sort(list);
		
		System.out.println(list.toString());
		
		System.out.println(" Reverse order:");
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list.toString());
		

	}

}
