package ComparableandCompratorDemo;


import java.util.ArrayList;
import java.util.Collections;

class StudentData implements Comparable<StudentData>{
	
	 int id;
	 String name;
	 int age;
	
	public StudentData() {};
	public StudentData(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "StudentDemo [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(StudentData o) {
		
		return this.age-o.age;
	}
	

} 

public class StudentDemo{

	public static void main(String[] args) {
	ArrayList<StudentData> list=new ArrayList<StudentData>();
	
	list.add(new StudentData(1,"Salim",28));
	list.add(new StudentData(2,"Hasan",29));
	list.add(new StudentData(3,"Nadeem",22));
	list.add(new StudentData(4,"Salma",20));
	list.add(new StudentData(5,"kalimullah",40));
	
	Collections.sort(list);
	for(StudentData x:list) {
		System.out.println(x);
	}
	
	}
	
}
