package Workshop05_pack03;

public class TestAccount {

	public static void main(String[] args) {
		Account a = new Account("441-0290-1203", 500000, 7.3);
		
		System.out.printf("Account : %s, Balance : %d, interestRate : %f\n", a.getAccount(), a.getBalance(), a.getInterestRate());
		
		a.withdraw(600000);
		a.deposit(20000);
		
		System.out.printf("Account : %s, Balance : %d, interestRate : %f\n", a.getAccount(), a.getBalance(), a.getInterestRate());
		
		System.out.println("이자 : " + a.calculate());
	}

}
