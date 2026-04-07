package Workshop06_pack04;

public class Rectangle extends Shape implements Resize{

	

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int width, int height, String colors) {
		super(width, height, colors);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		return (double)(getWidth() * getHeight());
	}
	
	@Override
	public void setResize(int size) {
		setWidth(getWidth() + size);
		
	}
	
	@Override
	public String toString()
	{
		return "Rectangle " + super.toString();
	}
}
