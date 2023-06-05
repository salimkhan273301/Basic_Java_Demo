package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchDemo {
	private static void BinarySearch(int[] arr,int a) {
		
		int low=0;
		int high=arr.length-1;
		int middle=(low+high)/2;
		while(low<=high) {
			if(arr[middle]==a) {
				System.out.format("Element is found at %d Position",middle);
			break;
			}
			else if(arr[middle]<a) {
				low=middle+1;
			}
			else {
				high=middle-1;
			}
			middle=(low+high)/2;
			
		}
		if(low>high)
		{
			System.out.println("Element is not found:");
		}

		
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of Array:");
	int s=sc.nextInt();
	int[] arr=new int[s];
	System.out.format("Please enter %d elements",s);
	for(int i=0; i<arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	//sc.close();
	System.out.println("Enter Element you want to search:");
	int a=sc.nextInt();
	Arrays.sort(arr);//in binary search array should be sorted;
	BinarySearch(arr,a);

	}

	

}
