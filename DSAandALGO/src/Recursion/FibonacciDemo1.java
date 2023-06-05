package Recursion;

import java.util.Scanner;

public class FibonacciDemo1 {
	
	private static int fibo(int i) {
		if(i==0)
			return 0;
		if(i==1 || i==2)
			return 1;
		return fibo(i-2)+fibo(i-1);
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
