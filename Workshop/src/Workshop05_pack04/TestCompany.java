package Workshop05_pack04;

public class TestCompany {

	public static void main(String[] args) {
		Company c = new Company(100);
		
		System.out.println("연 기본급 합 : " + c.getIncome() + " 세후 : " + c.getAfterTaxIncome());
		System.out.println("연 보너스 합 : " + c.getBonus() + " 세후 : " + c.getAfterTaxBonus());
		System.out.println("연 지급액 합 : " + (c.getAfterTaxBonus() + c.getAfterTaxIncome()));
	}

}
