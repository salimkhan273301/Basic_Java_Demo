package precticedemo;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountNoOfwordsInString {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> map=new LinkedHashMap<>();
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Please Enter String:");
		//String s=sc.nextLine().toLowerCase();
		String s="java is very power full language and we all use it in daily life"
				+ "java is very trusted and portable language"
				+ "java is robust and  structural nutral language".toLowerCase();
		
		String[] arr=s.split("\\s");
		
		System.out.println(Arrays.toString(arr));
		for(String s1:arr) {
			//System.out.print(s1+",");
			
			if(map.containsKey(s1))
				map.put(s1, map.get(s1)+1);
			else
				map.put(s1, 1);
			
		}
		
		System.out.println(map.toString());
		
		
		// 1st Approach to Print Map...
		System.out.println("============================================");
		map.forEach((k,v)->{
			System.out.println(k+"-"+v);
		}
		);
		
		System.out.println("==========================================");
		// 2nd Approach To Print Map...
		
		for(Map.Entry<String, Integer> e:map.entrySet()) {
			System.out.println(e.getKey()+"-"+e.getValue());
		}
		
		
	}

}
