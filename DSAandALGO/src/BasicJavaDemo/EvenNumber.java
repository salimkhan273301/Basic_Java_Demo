package BasicJavaDemo;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the last point:");
		
		int n=sc.nextInt();
		
//		for(int i=1; i<=n; i++)
//		{
//			System.out.println(i*2);
//		}
		
	//-----------------------------------------------------------------------------------------------------------	
//		for(int i=1; i<=n; i++)
//		{
//			if(i%2==0)
//				System.out.print(i+"\t");
//		}
//		
//		System.out.println("\n-----------------------------------");
//		
		//------------------------------------------------------------------------------------------------------------
		
		int i=1;
		while(i<=n) {
			//System.out.println(i*2);
			
			//System.out.println("------------------------------");
		if(i%2==0)
		System.out.println(i);
			
			i++;
		}

	}

}
