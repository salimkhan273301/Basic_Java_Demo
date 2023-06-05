package Recursion;

import java.util.Scanner;

public class Print1toNwithoutLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int i=1;
		printDigit(n,i);
		

	}

	private static void printDigit( int n, int i) {
		if(i<=n) {
			System.out.print(i+" ");
			 printDigit(n,++i);
			 }

		
			
	}
	
}