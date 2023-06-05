package ARRAY;

import java.util.Scanner;

public class SumOfArrayElement {

	public static void main(String[] args) {
		int Size, i, total = 0;
	Scanner	sc = new Scanner(System.in);
	 
		System.out.print(" Please Enter Number of elements : ");
		Size = sc.nextInt();	
		
		int [] a = new int[Size];
		
		System.out.print(" Please Enter " + Size + " elements  : ");
		for (i = 0; i < Size; i++)
		{
			a[i] = sc.nextInt();
		}   

		total = SmOfArr(a, Size);
		System.out.println("\n The Sum of All Elements in this Array = " + total);
	}
	public static int SmOfArr(int[] a, int Size)
	{
		int i, Sm = 0;
		
		for(i = 0; i < Size; i++)
		{
			Sm = Sm + a[i]; 
		}	
		return Sm;
	}

	

}
