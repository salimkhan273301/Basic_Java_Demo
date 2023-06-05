package ARRAY;

import java.util.ArrayList;
import java.util.List;

public class MaxDigitInStringDemo {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		int count=0,max=0;
		String s="salim23khan7654jaddupipra876547";
		for(int i=0; i<s.length(); i++) {
			if((s.charAt(i)>='0' && s.charAt(i)<='9')) {
				
				count++;
			}
			else {
				max=count;
				list.add(max);
				count=0;
			}
			
		}
		max=count;
		list.add(max);
		int big=0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i)>big)
				big=list.get(i);
		}
		
		System.out.println(list.toString());
		System.out.println(big);

	}

}
