package Workshop06_pack01;

public class Vehicle {
	private int maxWeight;
	private double oilTankSize;
	private double efficiency;
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(int maxWeight, double oilTankSize, double efficiency) {
		this.maxWeight = maxWeight;
		this.oilTankSize = oilTankSize;
		this.efficiency = efficiency;
	}
	
	@Override
	public String toString() {
		return "최대 적제량 : " + maxWeight + " 오일탱크 : " + oilTankSize;
	}

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	public double getOilTankSize() {
		return oilTankSize;
	}

	public void setOilTankSize(double oilTankSize) {
		this.oilTankSize = oilTankSize;
	}

	public double getEfficiency() {
		return efficiency;
	}

	public void setEfficiency(double efficiency) {
		this.efficiency = efficiency;
	}
	
	
}
