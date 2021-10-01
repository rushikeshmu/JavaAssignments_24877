
public class AccountTest {

	public static void main(String[] args) {
		
		Customer c = new Customer("Shubham","Nashik",123,10000);
		Account account = new Account("Savings",123,11000,10000);
		if(c.getAccountNumber() == account.getAccountNumber()) {
			
			System.out.println(c.getName() + " Has following bank details");
			c.setCurrentBalance(account.getCurrentBalance());
			System.out.println(account.toString());
		}
		
		try {
		if(account.getCurrentBalance() < account.getMinimumBalance()) {
			
			throw new InsufficientBalanceException();
		}
		else {
			System.out.println(account.getCurrentBalance());
		}
		}
		catch(InsufficientBalanceException ex) {
			System.out.println("Insufficient balance");
			
		}

	}

}
