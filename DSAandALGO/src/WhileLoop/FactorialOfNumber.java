package WhileLoop;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Ener the number:");
		int n=sc.nextInt();
		int fact=1;
		int i=1;
		while(i<=n) {
			fact*=i;
			i++;
		}
		
		System.out.print("Factorial of "+n+" = "+fact);

	}

}
