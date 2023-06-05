package DoWhileLoop;

import java.util.Scanner;

public class DoWhileLoopDemo {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("Please enter the last rang:");
int n=sc.nextInt();

int i=1;

			do {
			System.out.print(i+"\t");
			i++;
			}while(i<=n);
			
			sc.close();
	}

}
