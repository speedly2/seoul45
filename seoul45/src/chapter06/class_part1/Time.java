package chapter06.class_part1;

public class Time {
	boolean am;
	int hour;
	int minute;
	int second;

	// 초기화 블록
	{
		java.time.LocalTime now = java.time.LocalTime.now();
		hour = now.getHour();
		if (hour >= 12) {
			hour -= 12;
			am = false;
		} else {
			am = true;
		}
		minute = now.getMinute();
		second = now.getSecond();
	}
	
/*
	this
	- 클래스 내부에서는 해당 인스턴스를 부를 이름이 없음.
	- 인스턴스 이름이 각자 달라지기 때문에 this를 사용해서
	지금 다루는 데이터가 그 자신을 가리키도록 this를 사용함.	
 */
	Time() { }
	
	Time(boolean am, int hour, int minute, int second) {
		this.am = am;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	Time(boolean am, int hour, int minute) {
		this.am = am;
		this.hour = hour;
		this.minute = minute;
		this.second = 0;
	}
	
	Time(int hour24, int minute) {
		this.am = hour24 < 12;
		this.hour = hour24 % 12;
		this.minute = minute;
		this.second = 0;
	}
	
	void whatTime() {
		System.out.print(am ? "오전 ":"오후 ");
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
	}
}
