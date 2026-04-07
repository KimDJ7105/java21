package Workshop06_pack01;

public class Car extends Vehicle{
	private double restOil;
	private int curWeight;
	
	public Car() {}
	
	public Car(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}
	
	public void addOil(int oil) {
		restOil += oil;
		
		if (restOil > super.getOilTankSize()) {
			restOil = super.getOilTankSize();
		}
	}
	
	public void moving(int distance) {
		restOil -= (distance * super.getEfficiency());
		
		if (restOil < 0) restOil = 0;
	}
	
	public void addWeight(int weight) {
		curWeight += weight;
		if(curWeight > super.getMaxWeight()) {
			curWeight = super.getMaxWeight();
		}
	}
	
	@Override
	public String toString() {
		return "최대 적제량 : " + super.getMaxWeight() + " 오일탱크 : " + super.getOilTankSize() +
				"\n" + "잔여 오일 : " + restOil + " 현재 중량 : " + curWeight;
	}

	public double getRestOil() {
		return restOil;
	}

	public void setRestOil(double restOil) {
		this.restOil = restOil;
	}

	public int getCurWeight() {
		return curWeight;
	}

	public void setCurWeight(int curWeight) {
		this.curWeight = curWeight;
	}
	
	
}
