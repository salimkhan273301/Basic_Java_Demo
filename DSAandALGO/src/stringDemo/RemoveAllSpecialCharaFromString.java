package stringDemo;

public class RemoveAllSpecialCharaFromString {

	public static void main(String[] args) {
		
		// using Replace All method i am doing this.....
		
		String s="Ja&*()#va^@Star-=+!387~.,?[}";
		String s1=s.replaceAll("[^a-zA-Z0-9]", ""); // if i want to include number then i will write0-9 else i will remove it..
		System.out.println(s);
		System.out.println("After Replace");
		System.out.println(s1);

	}

}
