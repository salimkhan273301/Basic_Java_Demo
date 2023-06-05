package StringExample;

import java.util.Scanner;

public class StringDemo {
	// reverse a string using loop

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the String:");
		String str=sc.nextLine();
		
		String str1="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			str1+=str.charAt(i);
		}
		System.out.println(str1);
		sc.close();
	}

}
