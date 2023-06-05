package Recursion;

import java.util.Scanner;

public class SumOfNnumberUsingRecursion {
	private static long sumDemo(int n) {
		if(n==0)
			return 0;
		return n+sumDemo(n-1);
	}

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter the Number:");
		int n=sc.nextInt();
		long result=sumDemo(n);
		System.out.format("Sum of  of %d natural number is = %d",n,result);

	}

	

}
