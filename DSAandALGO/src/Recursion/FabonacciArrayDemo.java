package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class FabonacciArrayDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		arr[0]=0;
		arr[1]=1;
		for(int i=2; i<size; i++) {
			arr[i]=arr[i-1]+arr[i-2];
			
		}
		System.out.println(Arrays.toString(arr));

	}

}
