package Workshop06_pack04;

public class Triangle extends Shape implements Resize{

	

	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	public Triangle(int width, int height, String colors) {
		super(width, height, colors);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		return (getWidth() * getHeight()) / (double)2;
	}
	
	@Override
	public void setResize(int size) {
		setHeight(getHeight() + size);
		
	}
	
	@Override
	public String toString()
	{
		return "Triangle " + super.toString();
	}
}
