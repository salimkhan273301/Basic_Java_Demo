package SetDemo;

import java.util.HashSet;
import java.util.Scanner;
// Set and all emplimented class of Set does not have doublicate element...
//hashset , Hash map does not return the value according to insertion order..
// hash set return the inserted value in Accending order..
//it does not sort the element in accending order by default.....

public class HashSetDemo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	HashSet<Integer> hs=new HashSet<>();
	System.out.println("Enter no of element you want to Enter:");
	int n=sc.nextInt();
	for(int i=0; i<=n; i++) {
		hs.add(sc.nextInt());
	}
System.out.println(hs.toString());
	}

}
