package Sorting;

import java.util.Arrays;

public class SortStringArrayDemo {

	public static void main(String[] args) {
		
		String[] arr= {"Salim","Nadeem","Ajadi","rehan","Zahid Zafer"};
		System.out.println(Arrays.toString(arr));
		System.out.println("Array After Sorting:");
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i].compareToIgnoreCase(arr[j])>0) {//here to change < and > we can sort it in accending and decsenndng order;
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
			System.out.println(Arrays.toString(arr));
	}

}
