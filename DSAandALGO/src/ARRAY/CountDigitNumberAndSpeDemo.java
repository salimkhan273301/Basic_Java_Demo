package ARRAY;

import java.util.Scanner;

public class CountDigitNumberAndSpeDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		int charecter=0, digit=0, special=0;
		for(int i=0; i<s.length(); i++) {
			
			if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z' ) {
				charecter++;
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				digit++;
			}
			
			else {
				special++;
			}
		}
		
		System.out.println("Charecter "+charecter);
		System.out.println("Digit "+digit);
		System.out.println("Special Charecter "+special);
	}

}
