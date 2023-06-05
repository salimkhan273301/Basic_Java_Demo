package SetDemo;

import java.util.HashSet;
import java.util.Scanner;
// it does not sort the element in accending order by default.....
public class HashSetStringDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashSet<String> hs=new HashSet<>();
		System.out.println("Enter no of element you want to Enter:");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0; i<=n; i++) {
			
			hs.add(sc.nextLine());
		}
	System.out.println(hs.toString());

	}

}
