package exam18_Utility;

import java.util.Arrays;

public class EnumTest {
	
	public enum Day {SUNDAY,MONDAY,FRIDAY,SATURDAY}
	
	public static void main(String[] args) {
		Day day = Day.SUNDAY;
		
		switch(day) {
		case SUNDAY : System.out.println("일요일"); break;
		case MONDAY : System.out.println("월요일"); break;
		case FRIDAY : System.out.println("금요일"); break;
		case SATURDAY : System.out.println("목요일"); break;
		}
		
		System.out.println(day.name());
		
		System.out.println(day.ordinal());
		
		Day[] days = day.values();
		
		System.out.println(Arrays.toString(days));
	}

}
