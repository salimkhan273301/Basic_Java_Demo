package ObjectDemo;

public class RefrenceDemo {
	
	public static void main(String[] args) {
		String a="salim";
		String b="salim";
		// both are pointing at the same location in heap(in string pool)  and having same value also...
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		System.out.println("---------------------------------------------");
		String obj=new String("salim");
		String obj1=new String("salim");
		// content or value is same of both object...
		System.out.println(obj.equals(obj1));
		// but they are pointing different position in heap memorey...
		System.out.println(obj==obj1);
		System.out.println(a.equals(obj1));
		System.out.println(a==obj);
		
		
		
		

	}

}
