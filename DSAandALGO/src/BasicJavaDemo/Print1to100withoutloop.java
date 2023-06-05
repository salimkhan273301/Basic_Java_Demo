package BasicJavaDemo;

import java.util.Scanner;

public class Print1to100withoutloop {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter the range till you want to print number:");
		int n=sc.nextInt();
		int number=1;
		PrintNumber(number,n);
		
		
		

	}

	private static void PrintNumber(int number,int n) {
		if(number<=n) {
			System.out.print(number+"\t");
			PrintNumber(number+1, n);
		}
		
	}

}
