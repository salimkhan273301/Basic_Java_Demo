package classrelatedexpri;

class Student{
	
	

	public static void readF() {
		System.out.println("I am Reading");
	}
	
	public static void readF(String s) {
		System.out.println(s);
	}
	
}

public class MainDemo extends Student {

	public static void main(String[] args) {
		
//Student s=new Student();


		readF();
		readF("Hi salim");
		
	}

}
