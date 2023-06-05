package Recursion;

import java.util.Scanner;

public class FabonaciiSeriseUsingRecursion {
	private static int fabonacciDemo(int n) {
		if(n>=1) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			return fabonacciDemo(n-1);
		}
		return 0;
	}

	static int a=0,b=1,c;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter how many fabonacci Element You Want to Print:");
		int n=sc.nextInt();
		
		System.out.print(a+" "+b);
		
		FabonaciiSeriseUsingRecursion obj=new FabonaciiSeriseUsingRecursion();
		obj.fabonacciDemo(n);
		
		
	}
	

}
