package SetDemo;

import java.util.LinkedHashSet;
import java.util.Scanner;

//  it follows the insertion order when we print the element...
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedHashSet<Integer> s=new LinkedHashSet<>();
		
		System.out.println("Enter no of element you want to Enter:");
		int n=sc.nextInt();
		for(int i=0; i<=n; i++) {
			s.add(sc.nextInt());
		}
	System.out.println(s.toString());

	}

}
