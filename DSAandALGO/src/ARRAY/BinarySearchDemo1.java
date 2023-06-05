package ARRAY;

import java.util.Scanner;

public class BinarySearchDemo1 {
	public static int searchItem(int arr[], int item) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(item==arr[mid])
				return 1;
			else if(arr[mid]<item)
				low=mid+1;
			else
				high=mid-1;
			mid=(low+high)/2;
	
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {2,6,77,55,44,2,3,8,89,5,4,89};
		
		System.out.println("Enter the element you want to search:");
		int item=sc.nextInt();
		int n=searchItem(arr,item);
		sc.close();
		if(n==1)
			System.out.println("item is found");
		else 
			System.out.println("item is not found");
	}

}
