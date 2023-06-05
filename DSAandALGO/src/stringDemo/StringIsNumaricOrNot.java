package stringDemo;

public class StringIsNumaricOrNot {

	public static void main(String[] args) {
		String s="123456.09";
		boolean number=true;
		
		try {
			Double dbl=Double.parseDouble(s);
		}
		catch(Exception e) {
			number=false;
		}

		if(number)
			System.out.println("Numeric String:");
		else
			System.out.println("Not Numeric String:");
	}

}
