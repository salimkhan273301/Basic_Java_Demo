package precticedemo;

public class StringIsPalindromOrNotDemo {
	
	private static boolean isPalindrom(String s) {
		StringBuilder sb=new StringBuilder(s);
		if(s==null)
		return false;
		else
		{
			
			sb.reverse();
		}
		
		return sb.toString().equals(s);
	}

	public static void main(String[] args) {
		
		String s="aa101aa";
		
		boolean b=isPalindrom(s);
		if(b)
		System.out.println(" String is Palindrom");
		else
			System.out.println("String is Not Palindrom:");

	}

	

}
