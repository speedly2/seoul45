package chapter01.data;

public class C007_Constant {

	public static void main(String[] args) {
		// 상수
		// final 지정자가 붙으며 초기식을 반드시 주어야 함.
		// 값 변경 X
		final double RATE = 3.28;
		System.out.println("이자율 : " + RATE + "%");
		int deposit = 10000;
		System.out.println("1년 후 이자 : " + deposit * RATE / 100 + "원");

		// 리터럴
		// 변수에 대입되거나 수식에 직접 사용되는 숫자값
		// 수치값으로 표기되며 이름이 없다
		// 의미상 진짜 상수값이나 final로 선언된 상수와 구분하기 위해 별도의 언어를 사용
		final double PI = 3.14;		//PI = 상수, 3.14 = 리터럴
		int number = 10000;			//number = 변수, 10000 = 리터럴
	}

}
