package Workshop05_pack04;

public class Company {
	private double salary;
	private double income;
	private double afterTaxIncome;
	private double bonus;
	private double afterTaxBonus;
	public Company() {
		// TODO Auto-generated constructor stub
	}
	
	public Company(double salary) {
		this.salary = salary;
		
		setIncome(salary * 12);
		setBonus(4*(salary * (20/(float)100)));
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
		
		setAfterTaxIncome(income - (income * (10 / (float)100)));
	}

	public double getAfterTaxIncome() {
		return afterTaxIncome;
	}

	public void setAfterTaxIncome(double afterTaxIncome) {
		this.afterTaxIncome = afterTaxIncome;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
		
		setAfterTaxBonus(bonus - (bonus * (5.5 / (float)100)));
	}

	public double getAfterTaxBonus() {
		return afterTaxBonus;
	}

	public void setAfterTaxBonus(double afterTaxBonus) {
		this.afterTaxBonus = afterTaxBonus;
	}
	
	
}
