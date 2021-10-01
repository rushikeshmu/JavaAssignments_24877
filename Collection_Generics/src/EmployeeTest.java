import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeTest {
	
	List<Employee> employees;
	

	
	public EmployeeTest() {
		
		
		employees = new ArrayList<Employee>();
	
		employees.add(new Employee(3,"Shubham",10000));
		employees.add(new Employee(1,"Sameer",10000));
		employees.add(new Employee(2,"Sourabh",10000));
	}


	public List<Employee> getEmployees() {
		return employees;
	}


	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public void sortEmployeebyId() {
		this.getEmployees().sort(Comparator.comparing(Employee::getId));
		this.getEmployees().forEach(System.out::println);
		
		
	}
	public void sortByName() {
		this.getEmployees().sort(Comparator.comparing(Employee::getName));
		this.getEmployees().forEach(System.out::println);
	
	}
	public void checkEmployeeExists(String nm) {
		
		List<String> names = new ArrayList<String>();
		this.getEmployees().forEach((e)->{
			
			names.add(e.getName());
			
			
		});
		try {
		if(names.contains(nm)) {
			
			System.out.println("Employee Exits");
			
		}
		else {
			throw new EmployeeNotFoundException();
		}
		
		}
		catch(EmployeeNotFoundException e) {
			System.out.println("Employee not found exception handled");
			
		}
		
	
		
		
		
	}


	public static void main(String[] args) {
		
		EmployeeTest test = new EmployeeTest();
		test.sortEmployeebyId();
		test.sortByName();
		test.checkEmployeeExists("Shubham");
		test.checkEmployeeExists("Komal");
	

	}

}
