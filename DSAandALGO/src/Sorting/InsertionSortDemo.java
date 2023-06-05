package Sorting;

import java.util.Arrays;

public class InsertionSortDemo {
	private static int[] insertionSort(int[] arr) {
		int temp,j;
		for(int i=1; i<arr.length; i++)
		{
			j=i-1;
			temp=arr[i];
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
			
		}
		
		
		return arr;
	}

	public static void main(String[] args) {
		int[] arr= {15,34,22,54,32,11,44,33,65,88};
		// Before Sorting
		System.out.println(Arrays.toString(arr));
		
		// After sorting 
		
		
		Arrays.sort(arr);  // this is Array Mathod to sort the Array
		
		System.out.println(Arrays.toString(arr));
		
		// using insertion Sort i sort the array
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		
		
		

	}

	

}
