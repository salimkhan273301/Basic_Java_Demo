package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class StringSortingDemo {
	private static String sortString(String s) {
		char[] ch=s.toCharArray();
		Arrays.sort(ch);
		
		return new String(ch);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		String result=sortString(s);
		System.out.println("Sorted String : "+result);
		

	}

	

}
