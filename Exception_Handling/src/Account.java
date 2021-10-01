
public class Account {
	
	String accountType;
	int accountNumber;
	double minimumBalance;
	double currentBalance ;
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getMinimumBalance() {
		return minimumBalance;
	}
	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	public double getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
	public Account(String accountType, int accountNumber, double minimumBalance, double currentBalance) {
		super();
		this.accountType = accountType;
		this.accountNumber = accountNumber;
		this.minimumBalance = minimumBalance;
		this.currentBalance = currentBalance;
	}
	public Account() {
		this("",0,0,0);
	}
	@Override
	public String toString() {
		return "Account [accountType=" + accountType + ", accountNumber=" + accountNumber + ", minimumBalance="
				+ minimumBalance + ", currentBalance=" + currentBalance + "]";
	}
	


}
