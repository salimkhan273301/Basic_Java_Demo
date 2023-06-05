package ARRAY;

import java.util.Arrays;

public class MaxElementinArray {
	
	private static int findMax(int[] arr) {
		int max=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}

	public static void main(String[] args) {
		int arr[]= {22,33,55,66,111,666,88,768,2000,4000};
		System.out.println(Arrays.toString(arr));
		int maxElement=findMax(arr);
		System.out.println("Biggest Element is =  "+maxElement);

	}

	

}
