package Workshop06_pack04;

public class ShapeTest {

	public static void main(String[] args) {
		Shape shape[] = new Shape[6];
		
		shape[0] = new Triangle(7,5,"Blue");
		shape[1] = new Rectangle(4,6,"Blue");
		shape[2] = new Triangle(6,7,"Red");
		shape[3] = new Rectangle(8,3,"Red");
		shape[4] = new Triangle(9,8,"White");
		shape[5] = new Rectangle(5,7,"White");
		
		
		for(Shape s : shape) {
			System.out.println(s);
		}
		
		for(Shape s : shape) {
			if(s instanceof Triangle) {
				((Triangle) s).setResize(5);
			}
			else if(s instanceof Rectangle) {
				((Rectangle) s).setResize(5);
			}
			
			System.out.println(s);
		}
	}

}
