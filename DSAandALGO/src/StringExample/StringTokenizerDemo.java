package StringExample;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the String");
		String s=sc.nextLine();
		if(s.isEmpty() || s==null)
			System.out.println("Enter the String:");
		else {
			StringTokenizer st=new StringTokenizer(s);
			
			System.out.println("Total Worlds in the String:"+st.countTokens());
		
		}
	}

}
