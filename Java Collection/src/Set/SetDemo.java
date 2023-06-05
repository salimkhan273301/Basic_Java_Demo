package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetDemo {
	
	//it can contain only one null value.
	//it can not hold dublicate value.
	// it does not follow insertion Order...
	 // we can add homogenious and nonhomogenious data in Collection if it is not generic(ArrayList<String> li=new ArrayList<String>())

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		Set l=new HashSet();  
	System.out.println("how many element you want to enter:");
		int a=sc.nextInt();
		for(int i=0; i<=a; i++) {
			l.add(sc.next());
		}
		System.out.println(l);
		sc.close();
		
		
		
		

	}

}
