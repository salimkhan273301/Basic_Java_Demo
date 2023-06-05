package ARRAY;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumberArrayListDemo {
	private static int sum(int x) {
		int sum=0;
		while(x!=0) {
			sum=sum+x%10;
			x/=10;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		
		List<Integer> list1=new ArrayList<Integer>();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the last point:");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			int count=0;
			for(int j=1; j<=i; j++) {
				if(i%j==0)
					count++;
			}
			if(count==2)
				list.add(i);
		}

		System.out.println(list.toString());
		
		for(int x:list) {
			if(sum(x)==7)
				list1.add(x);
		}
		System.out.println("List of prime no Whose sum=7");
		System.out.println(list1.toString());
	}



}
