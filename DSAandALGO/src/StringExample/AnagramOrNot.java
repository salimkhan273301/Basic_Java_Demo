package StringExample;

import java.util.Arrays;

public class AnagramOrNot {
private static boolean anagramDemo(String s1, String s2) {
		
		if(s1.length()!=s2.length())
		return false ;
		else {
			char arr1[]=s1.toCharArray();
			char arr2[]=s2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			return Arrays.equals(arr1, arr2);
		}
	}

	public static void main(String[] args) {
	
		String s1="Listen".toLowerCase();
		String s2="Silent".toLowerCase();
		
		boolean b=anagramDemo(s1,s2);
			if(b)
				System.out.println("Anagram");
			else
				System.out.println("not Anagram");
		

	}

	

}
