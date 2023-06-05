package ARRAY;

import java.util.ArrayList;
import java.util.Scanner;

public class NoOfWordsDemo {

	/**
	 * 
	 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s = sc.nextLine();
		int count=0;
		String[] arr = s.split(" ");
		for(String x:arr) {
			count++;
			System.out.print(x+",");
		}

		System.out.println("\n total worlds in string= "+count);
	}

}
