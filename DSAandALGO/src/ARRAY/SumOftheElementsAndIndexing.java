package ARRAY;

import java.util.Scanner;

public class SumOftheElementsAndIndexing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int[] arr= {6,8,16,30,55,7,12};
		System.out.println("Enter the Elements:");
		int n=sc.nextInt();
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				sum=arr[i]+arr[j];
				if(sum==n)
				{
					System.out.println(i+","+j);
				}
			}
			
		
		}

	}

}
