
public class Customer {
	String name;
	String address;
	int accountNumber;
	double currentBalance;
	public Customer() {
		
		this("","",0,0);
	}
	

	public Customer(String name, String address, int accountNumber, double currentBalance) {
		super();
		this.name = name;
		this.address = address;
		this.accountNumber = accountNumber;
		this.currentBalance = currentBalance;
	}



	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", accountNumber=" + accountNumber
				+ ", currentBalance=" + currentBalance + "]";
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public int getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}



	public double getCurrentBalance() {
		
		return currentBalance;
	}



	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}



	
}
