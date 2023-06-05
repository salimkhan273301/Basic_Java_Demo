package BasicJavaDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Demo1 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.addAll(Arrays.asList(1,2,2,3,4,4,5,6,7,7,8));
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int x:list) {
			if(map.containsKey(x))
				map.put(x, map.get(x)+1);
			else
				map.put(x, 1);
		}
		
		/*
		 * for(Map.Entry<Integer, Integer> x:map.entrySet()) { if(x.getValue()>1)
		 * System.out.println(x); }
		 */
		map.forEach((key,value)->{
			if(value>1)
				System.out.print(key+" ");
		});
		
	}

}
