package BasicJavaDemo;

import java.util.Scanner;

public class PrimeNumberDemo {
	public static int primeNo(int j) {
		int count=0;
		if(j>1) {
		for(int k=1; k<=j; k++) {
			if(j%k==0)
				count++;
		 }
		if(count==2)
			return j;
		}
		
		return 0;
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the last point");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			int x=primeNo(i);
			if(x>0)
			System.out.print(x+" ");
		}
		
	}

}
