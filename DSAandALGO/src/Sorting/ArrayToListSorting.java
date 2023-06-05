package Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToListSorting {

	public static void main(String[] args) {
		Integer[] arr= {2,5,8,4,1,7,11};
		List<Integer> list=Arrays.asList(arr);
		Collections.sort(list);
		System.out.println(list.toString());

}
}