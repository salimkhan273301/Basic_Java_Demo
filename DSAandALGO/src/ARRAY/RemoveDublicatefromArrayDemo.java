package ARRAY;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDublicatefromArrayDemo {

	public static void main(String[] args) throws Exception{
		Integer[] arr= {10,20,30,40,50,40,60,30,20,10};
		
		System.out.println("Before remove Dublicate:");
		System.out.println(Arrays.toString(arr));
		
		
		// 1st Approach ....
		Set<Integer> set=new TreeSet<Integer>();
		Collections.addAll(set, arr);
		System.out.println(set.toString());
		
		//2nd Approach....
		Map<Integer,Integer> map=new HashMap<>();
		for(Integer i:arr) {
			if(map.containsKey(i))
				map.put(i, map.get(i)+1);
			else
				map.put(i, 1);
				}
		for(Map.Entry<Integer,Integer> e: map.entrySet()) {
			//System.out.println(e.getKey()+"-"+e.getValue());
			if(e.getValue()>=1)
				System.out.print(e.getKey()+",");
	}
		
		System.out.println("\n===================================");
		System.out.print(map.toString());
		
		
		
		System.out.println("\n===================================");
		
		//3rd Approach....
		map.forEach((k,v)->{
			System.out.println(k+"-"+v);
		}

		);
		
		int max=Collections.max(set);
		System.out.println("Max item  :"+max);
	}
	
	

}
