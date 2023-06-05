package ObjectDemo;

public class Obj1 {
	 int sid;
	 String name;
	 String age;
	 


public Obj1(int sid, String name, String age) {
		super();
		this.sid = sid;
		this.name = name;
		this.age = age;
	}
public void displayMethod() {
	System.out.println(sid);
	System.out.println(name);
	System.out.println(age);
}



public static void main(String[] args) {
	
		Obj1 obj=new Obj1(1,"xxx","10");
	
		 obj.displayMethod();
		

	}

}
