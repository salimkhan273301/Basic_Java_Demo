package Recursion;

import java.util.Scanner;

public class ReverseAstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the String:");
		String s=sc.nextLine();
		sc.close();
		String s1=reverseDemo(s);
		
		
		//Integer sm=Integer.valueOf(s1);
		
		int sm=Integer.parseInt(s1);
		
		System.out.println("Sum of Digit is = "+sumDemo(sm));
		System.out.println("Reverse of String is = "+s1);

	}

	// this is summation of digit function;
	private static int sumDemo(Integer sm) {
		int sum=0;
		int reminder;
		while(sm!=0) {
			reminder=sm%10;
			sum=sum+reminder;
			sm=sm/10;
		}
		
		return sum;
	}

	
	// this is reverse function;
	private static String reverseDemo(String s) {
		if(s.isEmpty())
			return s;
		return reverseDemo(s.substring(1))+s.charAt(0);
	}

}
