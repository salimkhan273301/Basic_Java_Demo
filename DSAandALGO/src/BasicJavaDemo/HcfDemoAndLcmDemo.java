package BasicJavaDemo;

import java.util.Scanner;

public class HcfDemoAndLcmDemo {
	//this is  HCF or G.C.D method....
	private static int Hcf(int n1, int n2) {
		if(n2!=0)
			return Hcf(n2,n1%n2);
		return n1;
	}
	private static int Lcm(int n1, int n2, int result) {
		
		
		return n1*n2/result;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first No:");
		int n1=sc.nextInt();
		System.out.println("Enter the 2nd No:");
		int n2=sc.nextInt();
		 int result=Hcf(n1,n2);
		System.out.println("HCF of n1 and n2 "+result);
		
		int result1=Lcm(n1,n2,result);
		System.out.println("LCM of n1 and n2 "+result1);
	}

	

	

}
