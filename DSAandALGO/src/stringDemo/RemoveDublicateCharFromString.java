package stringDemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDublicateCharFromString {

	public static void main(String[] args) {
		//String s="programming";
		String s="google";
		
		// remove dublicate char from string;
		
		//1 approach.. using java8
		
		StringBuilder sb=new StringBuilder();
		s.chars().distinct().forEach(c->sb.append((char)c));
		
		System.out.println(sb);
		
		
		//2 Approach  using indexOf() method..
		StringBuilder sb1=new StringBuilder();
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			int index=s.indexOf(ch,i+1);
			//System.out.println(index);
			if(index==-1)
				sb1.append(ch);
			
			
		}
		System.out.println(sb1);
		
		// 3 Approach using Set collection....
		
		Set<Character> set=new LinkedHashSet<Character>();
		char[] ch=s.toCharArray();
		for(char c:ch) {
			set.add(c);
		}
	for(char c:set) {
		System.out.print(c);
	}

	}

}
