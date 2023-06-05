package stringDemo;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st String:");
		String s=sc.nextLine().toUpperCase();
		System.out.println("Enter 2nd String:");
		String s1=sc.nextLine().toUpperCase();
		if(s.length()!=s1.length()) {
			System.out.println("Not  Anagrams");
		}
		else {
			
			char[] arr1=s.toCharArray();
			char[] arr2=s1.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			System.out.println(Arrays.toString(arr1));// print array 1 after sorting
			System.out.println(Arrays.toString(arr2));// print array2 after sorting
			if(Arrays.equals(arr1, arr2)==true) {
				System.out.println("they are Anagrams");
			}
			else {
				System.out.println("Not Anagrams:");
			}
		}
	}

}
