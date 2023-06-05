package Sorting;

import java.util.Arrays;

public class StringAreAnagramsOrNotDemo {

	/*Two strings are said to be anagram if
	 *  we can form one string
	 *  by arranging the characters of another string.
	 *   For example,Race and Care. Listner and Silence
	 */
	
	public static void main(String[] args) {
		
		String s1="Race".toLowerCase();
		String s2="Care".toLowerCase();
		char[] arr1=s1.toCharArray();
		char[] arr2=s2.toCharArray();
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
