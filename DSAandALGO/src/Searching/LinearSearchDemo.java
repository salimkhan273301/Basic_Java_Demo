package Searching;

import java.util.Scanner;

public class LinearSearchDemo {
	private static int linearSearch(int[] arr, int item) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==item)
			
				return i;
			break;
			
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int arr[]= {10,20,30,40,50,70,90};
		System.out.println("Please Enter the element you want to Search:");
		int item=sc.nextInt();
		
		int result=linearSearch(arr,item);
		if(result>0)
			System.out.println(item+" is found at position "+ result);
		else
			System.out.println("Item is not present in list");
		
	}

	

}
