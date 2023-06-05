package LogicImplimentation;

import java.util.Scanner;

public class ExchangeFirstWithLast {
	private static String exchangeChar(String s) {
		
		return s.substring(s.length()-1)+s.substring(1,s.length()-1)+s.charAt(0);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter String:");
		String s=sc.nextLine().toLowerCase();
		System.out.println(s);
		String s1=exchangeChar(s);
		System.out.println(s1);

	}

	

}
