package precticedemo;

public class StringIsPalindromOrNot {

	public static void main(String[] args) {
		String s="caabaac";
		int i=0;
		int j=s.length()-1;
		boolean status=false;
		while(i<=j) {
			if(s.charAt(i)==s.charAt(j))
				status=true;
			else {
				status=false;
				break;
			}
			i++;
			j--;
		}
		if(status)
			System.out.println("it isPalindrom");
		else
			System.out.println("not Palindrom");

	}

}
