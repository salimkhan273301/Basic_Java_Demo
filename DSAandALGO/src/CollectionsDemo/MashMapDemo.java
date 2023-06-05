package CollectionsDemo;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MashMapDemo {

	public static void main(String[] args) {
		
//		Map map=new HashMap<>();
//		map.put(1, "salim");
//		map.put(2, "salim");
//		map.put(1, "salim");// dose not store dublicate key but store dublicate value;
//		map.put(4, "salim");
//		map.forEach((key,value)->{
//			System.out.println(key+"-"+value);
//		});
		
		HashMap<Integer,Object> map1=new HashMap<>();
		
		map1.put(1, "salim");
		map1.put(2, new Date());
		map1.put(3, new Integer(10));
		map1.put(4, 10);
		map1.put(5, "Rehan");
		map1.put(6, 'A');
		map1.put(null, "Ajadi");
		map1.put(null, "Amina");// it allows only one null key and any number of null values,it override the privious data.;
		map1.put(7, null);
		map1.put(8,null);
		map1.put(9,null);
		map1.forEach((key,value)->{
			
			
				//System.out.println(key+"-"+value);
		});
		
		HashMap<Integer,Object> map2=new HashMap<>();
		map2.put(1, "salim");
		map2.put(2, new Date());
		map2.put(3, new Integer(10));
		map2.put(4, 10);
		map2.put(5, "Rehan");
		map2.put(6, 'A');
		
		map2.forEach((key,value)->{
			
			//if(key>3)
				//System.out.println(key+"-"+value);
	});
		
		HashMap<Integer,Object> map3=new HashMap<>();
		map3.put(1, "salim");
		map3.put(2, new Date());
		map3.put(3, new Integer(10));
		map3.put(4, 10);
		map3.put(5, "Rehan");
		map3.put(6, 'A');
		
		Set set=map3.entrySet();
		
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
