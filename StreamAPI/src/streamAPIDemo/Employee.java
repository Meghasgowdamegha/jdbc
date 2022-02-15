package streamAPIDemo;

public class Employee {

int eid;
	String name;
	String des;
	float salary;
	
	public Employee(int eid, String name, String des, float salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.des = des;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", des=" + des + ", salary=" + salary + "]";
	}
	
}
	
	
