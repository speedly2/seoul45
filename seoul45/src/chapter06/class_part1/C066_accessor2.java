package chapter06.class_part1;

class Time2 {
	private boolean am;
	private int hour;
	private int minute;
	private int second;
	
	Time2(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public int getHour() {	return hour; }
	public void setHour(int hour) {
		if (hour >= 0 && hour <= 23) {
			this.am = hour < 12;
			this.hour = hour % 12;
			if (this.hour == 0) this.hour = 12;
		}
	}
	
	public int getMinute() {	return minute; }
	public void setMinute(int minute) {
		if (minute >= 0 && minute <= 59) {
			this.minute = minute;
		}
	}
	
	public int getSecond() {	return second; }
	public void setSecond(int second) {
		if (second >= 0 && second <= 59) {
			this.second = second;
		}
	}
	
	void whatTime2() {
		System.out.print(am ? "오전 ":"오후 ");
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
	}
}

public class C066_accessor2 {

	public static void main(String[] args) {
		// 접근 지정자
		Time2 now = new Time2(12, 34, 56);
//		System.out.println(now.hour);	// 에러
//		System.out.println(now.minute); // 에러
		now.whatTime2();
		// now.hour = 34;			// 에러
		now.setHour(34);			// 거부
		now.setSecond(-25);			// 거부
		now.whatTime2();
		now.setHour(10);			// 가능
		now.setMinute(45);			// 가능
		now.whatTime2();
		System.out.println(now.getHour());
		System.out.println(now.getMinute());
		System.out.println(now.getSecond());
	}

}
