package CollectionsDemo;

import java.util.TreeMap;

public class TreeMapDemo {
/*
 * it dose not store dublicate key
 * if we store it overeride previous stored key
 * 
 */
	public static void main(String[] args)  {
		TreeMap<Object,Character> tm=new TreeMap<>();
		tm.put(1, 'A');
		tm.put(3, 'C');
		tm.put(2, 'B');
		tm.put(5, 'E');
		tm.put(4, 'D');
		tm.put(1, 'A');
		tm.put(3, 'C');
		tm.put(2, 'B');
		tm.put(5, 'E');
		tm.put(4, 'D');
		tm.put(6, null);
		tm.put(7, null);
		tm.put(8, 'B');
		tm.put(5, 'E');
		tm.put(null, 'D');
		tm.forEach((k,v)->{
			System.out.println(k+"-"+v);
		});

	}

}
