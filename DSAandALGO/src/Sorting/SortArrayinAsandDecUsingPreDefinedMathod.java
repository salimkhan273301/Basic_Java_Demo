package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayinAsandDecUsingPreDefinedMathod {

	public static void main(String[] args) {
		Integer[] arr= {22,55,44,33,77,88,99,0,555,64,32,54};// i have used here Integer in place of int,becase Collections.reverseOrder() does  not work on primitive data type;
		// Array  befor sorting
		System.out.println(Arrays.toString(arr));
		
		
		
		// in Accending Order
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
		// in Deccending Order
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));

	}

}
