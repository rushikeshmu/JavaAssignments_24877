import java.util.Hashtable;

public class Customer {
	
	private String custName =null;
	private int accountNumber =0;
	private Hashtable<String, Double> accountInfo = new Hashtable<>();//account type and balance
	public void depositAmount(String accountType,double amount) {
		
		
		
		
	}

	public Hashtable<String, Double> getAccountInfo() {
		return accountInfo;
	}
	public void setAccountInfo(Hashtable<String, Double> accountInfo) {
		this.accountInfo = accountInfo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Customer(String custName, int accountNumber) {
		super();
		this.custName = custName;
		this.accountNumber = accountNumber;
	}
	
	public Customer() {
		System.out.println("Inside default ctr");
	}
	
	
	
	

}
