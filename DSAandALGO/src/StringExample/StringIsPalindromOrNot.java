package StringExample;

import java.util.Scanner;

public class StringIsPalindromOrNot {

	private static Scanner sc;
	public static void main(String[] args) {
		int i;
		sc=new Scanner(System.in);
		System.out.println("Please Enter String:");
		String s1=sc.next();
		
		int len=s1.length()-1;
		for( i=0; i<=len; i++) {
			if(s1.charAt(i)!=s1.charAt(len))
			{
				break;
			}
			len--;
		}
		if(i>=len)
		{
			System.out.println("palindrom");
			
		}
		else {
			System.out.println("not Palindrom");
		}

	}

}
