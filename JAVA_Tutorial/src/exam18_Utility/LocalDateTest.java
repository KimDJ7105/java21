package exam18_Utility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateTest {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		
		System.out.println(today); //오늘 날짜 출력
		
		LocalDate past = today.minusDays(2);
		
		System.out.println(past); // 2일 전
		past = today.minusMonths(3); // 3달 전
		System.out.println(past);
		past = today.minusYears(10); // 10년 전
		System.out.println(past);
		
		past = today.plusDays(3);
		System.out.println(past); // 3일 후
		past = today.plusMonths(3); // 3달 후
		System.out.println(past);
		past = today.plusYears(10); // 10년 후
		System.out.println(past);
		
		LocalDate my = LocalDate.of(1025, 11, 3);
		
		System.out.println(my);
		
		//str --> LocalDate
		String str = "2026-12-25";
		LocalDate todate = LocalDate.parse(str);
		
		String str2 = "2035년06월08일";
		LocalDate todate2 = LocalDate.parse(str2, DateTimeFormatter.ofPattern("yyyy년MM월dd일"));
		
		System.out.println(todate);
		System.out.println(todate2);
	}

}
