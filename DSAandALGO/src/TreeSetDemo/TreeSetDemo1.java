package TreeSetDemo;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;
// Treeset sort the list is accending order..
public class TreeSetDemo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeSet<Integer> ts=new TreeSet<>();
		System.out.println("Please enter no of element you want to insert:");
		int n=sc.nextInt();
		for(int i=n; i>=0; i--) {
			ts.add(sc.nextInt());
		}
		for(int x:ts) {
			System.out.print(x+"\t");
		}

	}

}
