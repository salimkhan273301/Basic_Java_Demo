package StringExample;

public class StringEqualityCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Salim";
		String s2="Salim";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3=new String("Salim");
		String s4=new String("Salim");
		
		System.out.println("====================================");
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		
		System.out.println("====================================");
		
		
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		String s5=new String("Hasan");
		System.out.println("====================================");
	
		System.out.println(s1==s5);
		System.out.println(s1.equals(s5));

	}

}
