package ARRAY;

public class DemoOfCharecter {

	public static void main(String[] args) {
		for(int i=97; i<=122; i++) {
		char c=(char)i;
			System.out.print(c+" ");
		}
		System.out.println("\n+++++++++++++++++++++++++++++++++++++++");
		
		char j='A';
		while(j<='Z') {
			
			System.out.print((int)j+" ");
			j++;
		}
		
		System.out.println("\n+++++++++++++++++++++++++++++++++++++++");
		
		int a='A';
		do {
			System.out.print((char)a+" ");
			a++;
		}while(a<='Z');

	}

}
