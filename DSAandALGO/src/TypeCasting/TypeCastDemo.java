package TypeCasting;

public class TypeCastDemo {

	public static void main(String[] args) {
		
		// Case 2- Variable of larger capacity is be assigned to another variable of smaller capacity

		  byte x;
		  int a = 270;
		  double b = 128.128;
		  System.out.println("int converted to byte");
		  x = (byte) a;
		  System.out.println("a and x " + a + " " + x);
		  System.out.println("double converted to int");
		  a = (int) b;
		  System.out.println("b and a " + b + " " + a);
		  System.out.println("\ndouble converted to byte");
		  x = (byte)b;
		  System.out.println("b and x " + b + " " + x);
		 
		
		long l=10;
		double d=50;
		l=(long)d;
		System.out.println(l);

		int a1=10;
		System.out.println(a1);
		double b1=20;
		
		a=(int)b;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("-----------------------------------");
		// Case 1- Variable of smaller capacity is be assigned to another variable of bigger capacity.
		int x1=10;
		double y=30;
		y=x1;
		System.out.println(y);
		
		

	}

}
