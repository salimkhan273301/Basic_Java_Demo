package compratordemo1;

public class Teacher {
	private int id;
	private String name;
	private String dpt;
	private Double salary;
	
	
	
	
	public Teacher() {
		
	}




	public Teacher(int id, String name, String dpt, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dpt = dpt;
		this.salary = salary;
	}




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




	public String getDpt() {
		return dpt;
	}




	public void setDpt(String dpt) {
		this.dpt = dpt;
	}




	public Double getSalary() {
		return salary;
	}




	public void setSalary(Double salary) {
		this.salary = salary;
	}




	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", dpt=" + dpt + ", salary=" + salary + "]";
	}
	
	
	

}
