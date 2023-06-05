package Sorting;

import java.util.Scanner;

public class BubbleSortDemo {
	private static int[] bubbleSort(int[] arr) {
		int temp;
		
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<arr.length-i-1; j++)
			{
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
		}
		
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array:");
		int s=sc.nextInt();
		int[] arr=new int[s];
		System.out.format("Enter %d element in Array",s);
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		// here printing unsorted elements...
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		
		
		bubbleSort(arr);
		
		// here printing the arry sorted element...
		System.out.println("\n------------------------------");
		//System.out.println(arr);
		for(int x:arr)
		{
			System.out.print(x+" ");
		}

	}

	

}
