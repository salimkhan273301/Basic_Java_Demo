package LogicImplimentation;

import java.util.Arrays;
import java.util.Scanner;

public class TripleUp {
	
	
private static  boolean tripleUp(int[] arr) {
	for(int j=0; j<arr.length-2; j++)
	{
		if(arr[j+1]==arr[j]+1 && arr[j+2]==arr[j]+2) 
			return true;
		
	}
	
	return false;	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please  enter the size of array:");
		int s=sc.nextInt();
		int[] arr=new int[s];
		System.out.format("please enter %d elememt in array",s);
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		boolean b=tripleUp(arr);
		if(b==true)
			System.out.println("three adjcent number exist in array");
		else
			System.out.println("three adjcent number not exist in array");

	}

	

}
