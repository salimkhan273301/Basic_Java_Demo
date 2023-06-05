package precticedemo;

import java.util.Scanner;

public class FabonacciDemo1 {
	public static int fabDemo(int n) {
		if(n<=1)
			return n;
		else
			return fabDemo(n-1)+fabDemo(n-2);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the terms:");
		int n=sc.nextInt();
		for(int i=0; i<n;i++) {
		int x=fabDemo(i);
		System.out.print(x+",");
		}
		
	}

}
