package ARRAY;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDublicateElementDemo {

	public static void main(String[] args) {
		
		Integer[] arr= {2,4,6,7,8,9,11,3,2,1,9,10,5,7};
		
		// 1st Approach....
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i].equals(arr[j]))
					System.out.println(arr[i]);
			}
		}
		
		// 2nd Approach
		System.out.println("====================================");
		Set<Integer> set=new HashSet<>();
		for(Integer x:arr) {
			if(set.add(x)==false)
				System.out.println(x);
		}
		
		
		// 3rd Approach.... 
		
		
		System.out.println("====================================");
		
		Map<Integer,Integer> map=new HashMap<>();
		
		for(Integer i:arr) {
			if(map.containsKey(i))
				map.put(i, map.get(i)+1);
			else
				map.put(i, 1);
		}
		
//		map.forEach((k,v)->{
//			System.out.println(k+":"+v);
//		});
		
		for(Map.Entry<Integer, Integer> e:map.entrySet()){
			if(e.getValue()==2)
				System.out.println(e.getKey());
		}
		
	}

}
