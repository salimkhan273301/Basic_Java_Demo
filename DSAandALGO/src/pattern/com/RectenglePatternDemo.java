package pattern.com;

import java.util.Scanner;

public class RectenglePatternDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row:");
		int row=sc.nextInt();
		System.out.println("Enter the Colomn:");
		int column=sc.nextInt();
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=column; j++) {
				
				if(i==1 || i==row || j==1 || j==column)
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println();
		}

	}

}
