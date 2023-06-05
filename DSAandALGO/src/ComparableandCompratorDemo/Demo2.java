package ComparableandCompratorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Student implements Comparable<Student>{

	private int id;
	private String name;
	private double salary;




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public double getSalary() {
		return salary;
	}




	public void setSalary(double salary) {
		this.salary = salary;
	}




	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}




	public Student(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}




	public Student() {

	}




	@Override
	public int compareTo(Student o) {

		return this.id-o.id;
	}

}

public class Demo2 {


	public static void main(String[] args) {

		ArrayList<Student> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);

		for(int i=0; i<3; i++) {
			Student s=new Student();
			System.out.println("Enter id");
			int id=sc.nextInt();
			s.setId(id);
			System.out.println("Enter name");
			String s1=sc.nextLine();sc.next();
			s.setName(s1);
			System.out.println("Eneter Salary");
			double salary=sc.nextDouble();
			s.setSalary(salary);
			list.add(s);
		}

		Collections.sort(list);
		System.out.println(list.toString());
	


	}


}
