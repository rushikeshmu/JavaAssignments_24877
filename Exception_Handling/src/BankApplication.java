import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Scanner;

public class BankApplication {
    
	 List<Customer> customers;
	
	
	
	
	


	public BankApplication() {
		this.customers = new ArrayList<Customer>();
		
		
	}
	public void updateCustomer(String name,String address,int acn,double balance) {
		
		this.getCustomers().forEach((c)->{
			
			if(c.getName().equals(name)) {
				
				c.setAddress(address);
				c.setCurrentBalance(balance);
				c.setAccountNumber(acn);
			}
		});
		
		System.out.println("Account is updated");
		
		
		
		
		
		
	}
public void deleteCustomer(int accountNumber) {
	
	this.getCustomers().removeIf(c -> c.getAccountNumber() == accountNumber);
	
	System.out.println("Account is removed");

	
	
	

	
	
	
}
	public void getCustomerInfo(String nm) {
		List<Customer> ctmrs = this.getCustomers();
		
		ctmrs.forEach((c)->{
			System.out.println(c.getName());
			if(c.getName().equals(nm)) {
				System.out.println("Customer Details are ");
				System.out.println(c.toString());
			}
			
		});
		
	}
public  void addCustomer() {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the customer details");
	System.out.println("Enter the Name");
	Customer c = new Customer();
	c.setName(sc.next());
	System.out.println("Enter the Address");
	c.setAddress(sc.next());
	System.out.println("Enter the account number");
	c.setAccountNumber(sc.nextInt());
	System.out.println("Enter the current balance");
	c.setCurrentBalance(sc.nextDouble());
	this.getCustomers().add(c);
	
	System.out.println("Customer is added successfully");
	
	
	
	
	
}




	public List<Customer> getCustomers() {
		return customers;
	}





	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}





	public static void main(String[] args) {
		
		BankApplication app = new BankApplication();
		int ch;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter the choice");
			ch = sc.nextInt();
			switch(ch) {
			case 0:
				System.out.println("Exit");
				
				break;
			
			case 1 :
				app.addCustomer();
				app.getCustomers().forEach(System.out::println);
				break;
			case 2:
				System.out.println("Enter the user name");
				app.getCustomerInfo(sc.next());
				break;
			case 3:
				System.out.println("Enter the account number");
				app.deleteCustomer(sc.nextInt());
				
				break;
			case 4:
				System.out.println("Enter Name Address AccountNo currentBalance");
				app.updateCustomer(sc.next(), sc.next(), sc.nextInt(),sc.nextDouble());
				

				
				
				break;
			case 5:
				app.getCustomers().forEach(System.out::println);
				
				break;
			
			}
			
		}
		while(ch != 0);
		

	}

}
