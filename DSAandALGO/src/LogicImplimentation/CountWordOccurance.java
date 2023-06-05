package LogicImplimentation;

import java.util.Scanner;

public class CountWordOccurance {
	
	private static int countword(String s, String w) {
		int count=0;
		int index=0;
		int length=w.length();
		while(index!=-1) {
            index = s.indexOf(w, index);
            System.out.println(index);
			
			if(index != -1) {
				count++;
				index = index + length;
			}
			
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter String:");
		String s=sc.nextLine().toLowerCase();
		System.out.println("Please Enter Word:");
		String w=sc.nextLine().toLowerCase();
		System.out.println(s);
		int n=countword(s,w);
		System.out.println(n);

	}

	

}
