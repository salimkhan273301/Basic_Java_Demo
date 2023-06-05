package ARRAY;

import java.util.Arrays;

public class DeleteDublicateFromArray {
	private static int removeDublicate(int[] arr, int length) {
		int temp[]=new int[length];
		
		int j=0;
		
		Arrays.sort(arr);
		for(int i=0; i<length; i++) {
			
			if(arr[i]!=arr[i+1])
				arr[j++]=arr[i];
		}
		arr[j++]=arr[length];
		
		return j;
	}


	public static void main(String[] args) {
		int[] arr= {10,20,20,10,30,40,50,40};
		int length=removeDublicate(arr,arr.length-1);
		for(int i=0; i<length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

//	private static int removeDublicate(int[] arr, int length) {
//		int temp[]=new int[length];
//		
//		int j=0;
//		
//		Arrays.sort(arr);
//		for(int i=0; i<length; i++) {
//			
//			if(arr[i]!=arr[i+1])
//				temp[j++]=arr[i];
//		}
//		temp[j++]=arr[length];
//		for(int i=0; i<j; i++) {
//			arr[i]=temp[i];
//		}
//		return j;
//	}

}
