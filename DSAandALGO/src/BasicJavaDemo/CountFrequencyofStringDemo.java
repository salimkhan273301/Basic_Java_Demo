package BasicJavaDemo;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyofStringDemo {
	public static void countFreq(String s) {
		HashMap<Character, Integer> map=new HashMap<>();
		char arr[]=s.toCharArray();
		for(char x:arr) {
			if(map.containsKey(x))
				map.put(x, map.get(x)+1);
			else
				map.put(x, 1);
		}
		for(Map.Entry<Character, Integer> x:map.entrySet()) {
			//System.out.println(x.getKey()+"-"+ x.getValue());
			
			if(x.getValue()==1)
				System.out.println(x.getKey());
		}
			
	}

	public static void main(String[] args) {
		String s="salimullah";
		countFreq(s);

	}

}
