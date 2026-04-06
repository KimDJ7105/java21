package Workshop05_pack02;

public class BookTest {

	public static void main(String[] args) {
		Book [] b = new Book[] {new Book("SQL Plus", 50000, 5.0),
				new Book("Java 2.0", 40000, 3.0),
				new Book("JSP Servlet", 60000, 6.0)};
		System.out.println("책이름\t\t가격\t할인율\t할인후금액");
		System.out.println("----------------------------------");
		for(int i = 0 ; i < b.length ; ++i) {
			int price = b[i].getBookPrice();
			double rate = b[i].getBookDiscountRate();
			double real_price = price - (price * (rate / 100));
			
			System.out.println(b[i].getBookName() + "     " + price
					+ "\t" + rate + "\t" + real_price);
		}
	}

}
