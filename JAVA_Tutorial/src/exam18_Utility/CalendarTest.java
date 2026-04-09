package exam18_Utility;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		System.out.println("년도 : " + c.get(Calendar.YEAR));
		System.out.println("월 : " + (c.get(Calendar.MONTH) + 1));
		// 월은 0~11로 나온다.
		System.out.println("일 : " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("시 : " + c.get(Calendar.HOUR_OF_DAY));
		System.out.println("분 : " + c.get(Calendar.MINUTE));
		System.out.println("초 : " + c.get(Calendar.SECOND));
	
		Calendar c2 = Calendar.getInstance();
		
		c2.set(2036, 0, 12);
		
		System.out.println("년도 : " + c2.get(Calendar.YEAR));
		System.out.println("월 : " + (c2.get(Calendar.MONTH) + 1));
		// 월은 0~11로 나온다.
		System.out.println("일 : " + c2.get(Calendar.DAY_OF_MONTH));
		System.out.println("시 : " + c2.get(Calendar.HOUR_OF_DAY));
		System.out.println("분 : " + c2.get(Calendar.MINUTE));
		System.out.println("초 : " + c2.get(Calendar.SECOND));
	
	}

}
