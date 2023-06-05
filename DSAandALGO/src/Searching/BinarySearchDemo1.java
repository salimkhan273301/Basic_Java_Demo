package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchDemo1 {

	private static int binaryS(int[] arr, int n) {
		int i=0,j=arr.length-1;
		while(i<=j) {
			int mid=(i+j)/2;
			
			if(arr[mid]==n)
				return mid;
			else if(arr[mid]>n) {
				j=mid-1;
			}
			else {
				i=mid+1;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		
		int[] arr= {2,5,7,9,1,90,55,44,23,11};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element you want to search:");
		int n=sc.nextInt();
		Arrays.sort(arr);
		int index=binaryS(arr,n);
		if(index>0)
			System.out.println("item is found at index: "+index);
		else
			System.out.println("item is not found at index:");

		

	}

	

}
