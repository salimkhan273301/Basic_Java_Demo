package BasicJavaDemo;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	for(int i=10; i<=n; i++)
	{
		if(Armstrong(i)==true)
		System.out.print(i+"\t");
	}

	}

	private static boolean Armstrong(int i) {
		int digit=0,sum=0,reminder=0;
		
		int temp=i;
		while(temp!=0)
		{
			digit++;
			temp=temp/10;
		}
		
		temp=i;
		while(temp>0) {
			reminder=temp%10;
			sum=(int) (sum+Math.pow(reminder, digit));
			temp=temp/10;
		}
	if(i==sum)
		
      return true;
	return false;
	
	}

}
