package WhileLoop;

import java.util.Scanner;

public class ReverceNumber {
	private static void reverseDemo(int i) {
       int rev = 0,reminder;
		int temp=i;
		while(i!=0) {
			reminder=i%10;
			rev= rev*10+reminder;
			i=i/10;
		}
		if(temp==rev)
			System.out.print(temp+" ");
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		sc.close();
		for(int i=1; i<=n; i++)
		{
			reverseDemo(i);
		}
		
		

	}

	

}
