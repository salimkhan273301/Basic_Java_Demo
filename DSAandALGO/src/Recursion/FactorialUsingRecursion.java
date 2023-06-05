package Recursion;

import java.util.Scanner;

public class FactorialUsingRecursion {
	
	private static long factorialDemo(int n) {
		if(n==0)
			return 1;
		
		return n*factorialDemo(n-1);
	}


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter the Number:");
		int n=sc.nextInt();
		long result=factorialDemo(n);
		System.out.format("Factorial of %d is = %d",n,result);
		

	}

	
}
