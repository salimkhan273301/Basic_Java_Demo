package Sorting;

import java.util.Arrays;

public class SelectionSortDemo {
	
	private static int[] selectionSort(int[] arr) {
		int min,temp=0;
		for(int i=0; i<arr.length; i++) {
			min=i;
			for(int j=i+1; j<arr.length; j++)
			{
				System.out.println(arr[j]<arr[min]);
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
			System.out.println(Arrays.toString(arr));
		}
		
		return arr;
		
	}

	public static void main(String[] args) {
		

//int[] arr= {55,44,88,77,5,3,1};

int[] arr= {5,4,3,2,1};
		
		System.out.println("Unsorted Array"+Arrays.toString(arr));
		selectionSort(arr);
		System.out.println("Sorted Array.................");
		System.out.println(Arrays.toString(arr));

	}

	

}
