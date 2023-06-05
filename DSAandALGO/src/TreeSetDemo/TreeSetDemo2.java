package TreeSetDemo;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeSet<String> ts=new TreeSet<>();
		System.out.println("Please enter no of element you want to insert:");
		int n=sc.nextInt();
		for(int i=n; i>=0; i--) {
			ts.add(sc.next());
		}
		for(String x:ts) {
			System.out.print(x+"\t");
		}

	}

}
