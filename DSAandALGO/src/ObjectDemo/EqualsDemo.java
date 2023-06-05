package ObjectDemo;

public class EqualsDemo {
	String a;
	String b;

	public EqualsDemo(String a, String b) {
		super();
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) 
	{
		EqualsDemo obj=new EqualsDemo("XXX","XXX");
		System.out.println(obj.a.equals(obj.b));
		System.out.println(obj.a==obj.b);
		
		
		}

}
