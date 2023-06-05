package BasicJavaDemo;

import java.util.Scanner;

public class LCMorHCFDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		int n1=sc.nextInt();
		System.out.println("Enter 2nd Number:");
		int n2=sc.nextInt();
		int lcm=0,hcf=0,l=0;
		
		/*
		 * if(n1>n2) l=n2;
		 * 
		 * 
		 * else l=n1;
		 */
		
		l=n1>n2?n2:n1; //it is equal to obove code...
		
		for(int i=1; i<=l; i++)
		{
			if(n1%i==0 && n2%i==0)
				hcf=i;
		}
		lcm=(n1*n2)/hcf;
		System.out.format("HCF of %d and %d is = %d",n1,n2,hcf);
		System.out.println("\n==================================");
		System.out.format("LCM of %d and %d is = %d",n1,n2,lcm );
	}

}
