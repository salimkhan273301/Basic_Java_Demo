package stringDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxConsicutiveNumberinString {

	public static void main(String[] args) {
		ArrayList<Boolean> list=new ArrayList<Boolean>();
		List<Integer> max=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s=sc.nextLine();
		char[] arr=s.toCharArray();
		for(char x:arr) {
		boolean b=	Character.isDigit(x);
			list.add(b);
		}
		int count=0;
		for(boolean b:list) {
			if(b==true)
				count++;
			else{
				max.add(count);
				count=0;
			}
			
			
		}
		max.add(count);
		System.out.println(max.toString());

	}

}
