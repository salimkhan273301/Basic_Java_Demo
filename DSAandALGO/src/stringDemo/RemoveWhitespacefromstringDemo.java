package stringDemo;

import java.util.Arrays;

public class RemoveWhitespacefromstringDemo {

	public static void main(String[] args) {
		String s="  j  av    a    sta   r   ";
		
		String s1=s.trim(); // trim() removes white space from start and end..
		System.out.println(s1);
		
		
		String s2=s.replaceAll("[\\s+]","");
		System.out.println(s2);
		
		
		String[] s3=s1.split("\\s+");
		System.out.println(Arrays.toString(s3));

	}

}
