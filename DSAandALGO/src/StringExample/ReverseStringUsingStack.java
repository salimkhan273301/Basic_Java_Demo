package StringExample;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStringUsingStack {
	private static String reverseString(String s1)
	{
		String str="";
		Stack<Character> st=new Stack<>();
		for(int i=0; i<s1.length(); i++) {
			st.push(s1.charAt(i));
			
		}
		
		for(int j=0; j<s1.length(); j++)
		{
			str+=st.pop();
		}
		
		return str;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the String:");
		String s=sc.nextLine();
		
		String s1=reverseString(s);
		System.out.println("Reverse String is = "+s1);
	}

}
