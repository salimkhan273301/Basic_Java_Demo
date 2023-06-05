package precticedemo;

public class RemoveAllWhiteSpaceUsingCondition {

	public static void main(String[] args) {
		
		String s="  salim    ullah     khan    ";
		
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==' ' || s.charAt(i)=='\t')
				continue;
			else
				sb.append(s.charAt(i));
		}

		System.out.println(sb);
		
		
		System.out.println("=============================");
		
		// 2nd Approach.....
		String s1=s.replaceAll(" ", "");
		System.out.println(s1);
		
		
		
		
		
		// 3rd Approach ......
		System.out.println("=============================");
		//String s2=s.replaceAll("[^A-Za-z]", "");
		String s3=s.replaceAll("\\s","");
		System.out.println(s3);
		
		

		// 4th Approach ......
		System.out.println("4th Approach=============================");
		String s7="";
		char[] arr=s.toCharArray();
		for(char c:arr) {
			if(Character.isWhitespace(c))
				continue;
			else
				s7+=c;
		}
		
		System.out.println(s7);
		
		// find out vowel in string..
		
			if(s.matches(".*[aeiou].*"))
				System.out.println("vowel is Persent");
		
			else
				System.out.println("Vowel is  not Persent");
		
		
		
		
		
	}

}
