package BasicJavaDemo;

import java.util.Arrays;

public class ReverseArrayDemo {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int arr1[]=new int[arr.length];
		System.out.println("Before Rotation:");
		System.out.println(Arrays.toString(arr));
		int j=0;
		for(int i=arr.length-1; i>=0; i--)
		{
			arr1[j++]=arr[i];
		}
		System.out.println("After rotation");
		System.out.println(Arrays.toString(arr1));
		
		
	}

}
