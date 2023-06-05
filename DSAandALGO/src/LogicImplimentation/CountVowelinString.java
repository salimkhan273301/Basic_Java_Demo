package LogicImplimentation;

import java.util.Scanner;

public class CountVowelinString {
	
	private static int countVowel(char[] ch) {
		int count=0;
		for(int i=0; i<ch.length; i++) {
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
				count++;
			else
				continue;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter String:");
		String s=sc.nextLine().toLowerCase();
		char[] ch=s.toCharArray();
		int n=countVowel(ch);
		int space=spaceCount(s);
		System.out.println("Length of String = "+s.length());
		if(n>0) {
			System.out.format("%d Vowel are in String \n",n);}
		else {
			System.out.println("No Vowel in String");}
		int c=s.length()-n-space;
		System.out.format(" %d Cansonent in String",c);
		
		
	}

	private static int spaceCount(String s) {
		int spc=0;
		for(int k=0; k<s.length(); k++) {
			if(s.charAt(k)==' ' || s.charAt(k)=='\t')
				spc++;
		}
		return spc;
	}

	

}
