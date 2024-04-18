package chapter05.method;

import java.time.LocalDate;

public class C056_method4 {

	public static void main(String[] args) {
		System.out.println("오늘은 " + getDate() + "일입니다.");

	}
	
	static int getDate() {
		LocalDate today = LocalDate.now();
		int day = today.getDayOfMonth();
		return day;
	}
}
