package ARRAY;

import java.util.Scanner;

public class FabonacciDemoRecursion {

	public static int fabSeries(int j) {
		if(j==0)
			return 0;
		if(j==1 ||  j==2)
			return 1;
		return fabSeries(j-1)+fabSeries(j-2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the last point:");
		int n=sc.nextInt();
		for(int i=0; i<n; i++) {
			int f=fabSeries(i);
			System.out.print(f+" ");
		}
		

	}

}
