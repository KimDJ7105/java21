package Workshop06_pack03;

public class L3 extends Car implements Temp{

	public L3() {
		// TODO Auto-generated constructor stub
	}

	public L3(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getTempGage() {
		return getDistance() / 10;
	}

	@Override
	public void go(int distance) {
		setDistance(getDistance() + distance);
		setOilSize(super.getOilSize() - (distance/10));
		
	}

	@Override
	public void setOil(int oilSize) {
		setOilSize(super.getOilSize() + oilSize);
		
	}
	
	@Override
	public String toString() {
		return super.toString() + " temperature : " + getTempGage();
	}
}
