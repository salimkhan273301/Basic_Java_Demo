package CollectionsDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1, "Salim");
		 map.put(101, "Chaitanya");
		 map.put(105, "Derick");
		 map.put(111, "Logan");
		 map.put(120, "Paul");
		 
//		 System.out.println(map);
//		 
//		 Set set=map.entrySet();
//		 System.out.println(set.toString());
//		 Iterator it=set.iterator();
//		 
//		 while(it.hasNext()) {
//			 System.out.println(it.next());
//		 }
		 
		 
		 
//		 for(Map.Entry<Integer, String> o:map.entrySet()) {
//			 System.out.println(o.getKey()+"-"+o.getValue());
//		 }
		
		 
//		 map.forEach((k,v)->{
//			 System.out.println(k+"-"+v);
//		 });
		
		 
		 
		 Set set=map.entrySet();
		 Iterator it=set.iterator();
		 while(it.hasNext()) {
			 Map.Entry map1=(Map.Entry)it.next();
			 System.out.println(map1);
		 }
	
	}

}
