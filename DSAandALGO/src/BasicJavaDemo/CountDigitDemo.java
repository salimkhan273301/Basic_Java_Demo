package BasicJavaDemo;

import java.util.Scanner;

public class CountDigitDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of Digit:");
		
		int n=sc.nextInt();
	int	temp=0, count=0,r=0;
		while(n!=0) {
			r=n%10;
			n=n/10;
			count++;
			if(r>temp) {
				temp=r;
			}
		}
		System.out.println("No Of Digit "+count);
		System.out.println("Bigger digit in number "+ temp);
		
	}

}
