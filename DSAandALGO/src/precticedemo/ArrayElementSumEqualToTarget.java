package precticedemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayElementSumEqualToTarget {

	// 2nd Approach.....

//	private static void sumEqual(int[] arr, int target) {
//		Arrays.sort(arr);
//		int i = 0, j = arr.length - 1;
//
//		while (i < j) {
//			if (arr[i] + arr[j] == target)
//				System.out.printf("\nPair found (%d, %d)", arr[i], arr[j]);
//			if (arr[i] + arr[j] > target)
//				j--;
//			else
//				i++;
//
//		}
//	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 6, 8, 9, 2, 4, 7 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Element:");
		int target = sc.nextInt();
		sumEqual(arr, target);

	}

	// 3rd Approach.....
	
	private static void sumEqual(int[] arr, int target) {

		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(target-arr[i])) {
				System.out.printf("\nPair found (%d, %d)",
						arr[map.get(target - arr[i])], arr[i]);
				}
			else
				map.put(arr[i], i);
		}
	}

	// 1st Approach....

//	private static void sumEqual(int[] arr, int target) {
//		
//		for(int i=0; i<arr.length-1; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i]+arr[j]==target)
//					System.out.format("\nElements are (%d,%d)",arr[i],arr[j]);
//			}
//		}
//}		

}
