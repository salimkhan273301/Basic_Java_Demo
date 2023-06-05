package ARRAY;

import java.util.Scanner;

public class CountUpperCaseandLowerCaseDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		int upper=0,lower=0;
		String s=sc.nextLine();
		char[] arr=s.toCharArray();
		for(char x:arr) {
			if(x>='A' && x<='Z')
				upper++;
			else
				lower++;
		}
		System.out.println("Total Upper Later "+upper);
		System.out.println("Total lower Later "+lower);
	}

}
