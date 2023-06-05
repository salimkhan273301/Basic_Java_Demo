package StringExample;

import java.util.Scanner;

public class TotalWordsInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Pleasse Enter the String:");
		String s=sc.nextLine();
		int totalwords=1,i;      			//because after 1st word i start to check so totalwords=1, i have taken
		
		for(i=0; i<s.length(); i++)
		{
			if((s.charAt(i)==' ') || ( s.charAt(i)=='\t'))
			{
				totalwords++;
			}
		}

		System.out.println("Total Words in string are="+totalwords);
	}

}
