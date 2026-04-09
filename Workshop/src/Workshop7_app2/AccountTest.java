package Workshop7_app2;

public class AccountTest {
	
	public static void main (String[] args) {
	
		Account a = new Account("441-0290-1203", 500000, 7.3);
	
		try {
			a.deposit(-10);
			a.withdraw(600000);
		
			System.out.println(a.calculateInterest());
		
		} catch (AccountException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}

