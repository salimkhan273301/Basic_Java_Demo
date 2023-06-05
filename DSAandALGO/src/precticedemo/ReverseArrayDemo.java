package precticedemo;

import java.util.Arrays;

public class ReverseArrayDemo {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int i=0,j=arr.length-1;
		
		System.out.println("Before Rotation the Array");
		System.out.println(Arrays.toString(arr));
		while(i<=j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
		System.out.println("After Rotation the Array");
		System.out.println(Arrays.toString(arr));
		

	}

}
