package Workshop7_app2;

public class Account {
	private String account;
	private double balance;
	private double interestRate;
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(String account, double balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public double calculateInterest() {
		return balance * (interestRate / (double)100);
	}
	
	public void deposit(double money) throws AccountException{
		if(money <= 0) throw new AccountException("입금액이 0 입니다.");
		
		balance += money;
	}
	
	public void withdraw(double money) throws AccountException{
		if(balance < money) throw new AccountException("출금액이 현재 계좌의 보유 금액보다 큽니다.");
	
		balance -= money;
	}
}
