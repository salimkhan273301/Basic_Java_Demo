package WhileLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseNumberDemo {

	private static boolean reverseDemo(int i) {
	       int rev = 0,reminder;
			int temp=i;
			while(i!=0) {
				reminder=i%10;
				rev= rev*10+reminder;
				i=i/10;
			}
			if(temp==rev)
				return true;
			return false;
			
		}
	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		sc.close();
		for(int i=1; i<=n; i++)
		{
			
		if(reverseDemo(i)==true)
			l.add(i);
			//System.out.print(i+"\t");
			
		}
		System.out.println(l);
		System.out.println("Total Such Elements are: "+l.size());
		
	}

}
