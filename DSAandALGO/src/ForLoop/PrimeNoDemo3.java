package ForLoop;

import java.util.Scanner;

public class PrimeNoDemo3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		// 1st Approach....
		
//		for(int j=2; j<=n; j++) 
//		int count=0;
//		for(int i=2; i<=j/2; i++) {
//			if(j%i==0) {
//				count++;
//				break;
//			}

//		}
		
//		if(count==0)		
		
		
		// 2nd approach 
		
		for(int i=1; i<=n; i++) {
		int count=0;
		for(int j=1; j<=i; j++) {
			if(i%j==0)
				count++;
		}
		if(count==2)
			System.out.print(i+" ");
		}
		
	}
}