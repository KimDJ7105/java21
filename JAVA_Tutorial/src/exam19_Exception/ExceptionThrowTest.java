package exam19_Exception;

class Account {
	int balance = 100;
	
	public void withdraw(int amt) throws InSufficentBalanceException {
		if(balance >= amt) {
			balance -= amt;
			System.out.println("출금액 : " + amt + " 남은 금액 : " + balance);
		} else {
			//잔액 부족인 경우
			//시스템은 예외라고 인식하지 않는다.
			//개발자는 예외라고 가정할 수 있다.
			//이 경우 명시적 예외 발생이 필요하다.
			
			throw new InSufficentBalanceException("Error : 잔액 부족으로 예외 발생");
			//생성자로 넘겨준 문자열이 예외 메시지 역할을 한다.
		}
	}
	
	public void pay() throws RuntimeException {
		
	}
}

class AccountVer2 extends Account {
	
	@Override
	public void withdraw(int amt) throws /*Exception*/ InSufficentBalanceException {
		//Exception은 부모 Account의 withdraw에서 throws 한 클래스보다 계층적으로 높기 때문에
		//throws 할 수 없다.
		System.out.println("더 빠르게!");
		
		if(balance >= amt) {
			balance -= amt;
			System.out.println("출금액 : " + amt + " 남은 금액 : " + balance);
		} else {
			//잔액 부족인 경우
			//시스템은 예외라고 인식하지 않는다.
			//개발자는 예외라고 가정할 수 있다.
			//이 경우 명시적 예외 발생이 필요하다.
			
			throw new InSufficentBalanceException("Error : 잔액 부족으로 예외 발생");
			//생성자로 넘겨준 문자열이 예외 메시지 역할을 한다.
		}
	}
	
	@Override
	public void pay() throws /*IOException*/ArithmeticException, NullPointerException {
		//부모의 pay가 RuntimeException를 throws 했음으로
		//자식의 pay는 ArithmeticException와 NullPointerException를
		//throws 할 수 있다.
		
		//부모가 RuntimeException를 throws 했음으로
		//관련 계열이 아닌 IOExcption은 throws 불가능하다.
	}
}


public class ExceptionThrowTest {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Account a = new Account();
		
		try {
		a.withdraw(50);
		a.withdraw(500);
		}catch(InSufficentBalanceException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
}
