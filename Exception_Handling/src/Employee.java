
public class Employee {
	
	String name;
	int id;
	double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee() {
		this("",0,0);
	}
	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	public static void main(String [] args) {
		Employee [] employees = {
				new Employee("Aniruddha",1,13879),
				new Employee("Aditi",2,13879)
		};
		for(Employee e : employees) {
			
			System.out.println(e.toString());
		}
		
	}

}
