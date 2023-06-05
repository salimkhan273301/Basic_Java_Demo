package WhileLoop;

import java.util.Scanner;

public class PalindromNumber1to1000 {


	private static int palindDemo(int i) {
		int temp=i;
		int sum=0;
		int r=0;
		while(temp!=0) {
			r=temp%10;
			sum=(sum*10)+r;
			temp/=10;
			
			
		}
		if(sum==i)
			return i;
		return -1;
	}


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			
			int x=palindDemo(i);
			if(x>0)
				System.out.print(x+",");
		}
		
		
	}
}
