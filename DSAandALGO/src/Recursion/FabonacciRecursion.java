package Recursion;

import java.util.Scanner;

// Fibonacci Series Using Recursion

public class FabonacciRecursion {
	private static int fibo(int n) {
		
		if(n<=1)
			return n;
		
		return fibo(n-1)+fibo(n-2);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter how many fabonacci Element You Want to Print:");
		int n=sc.nextInt();
		
		for(int i=0; i<=n; i++)
		{
		
		System.out.print(fibo(i)+" ");
		}
	}

}
