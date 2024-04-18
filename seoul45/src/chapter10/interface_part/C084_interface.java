package chapter10.interface_part;

public class C084_interface {

/*
	인터페이스 구성
	상수, 추상메서드
	클래스의 일종(특수한 형태의 클래스)
	설계 중심
	모든 메서드가 추상메서드로 이루어져 있으므로 굳이 abstract예약어를 사용하지 않아도 자동으로 변환
	모든 변수가 상수로 이루어져 있으므로 굳이 final예약어를 사용하지 않아도 자동으로 변환
	하나라도 추상메서드를 Override하지 않으면 에러가 발생 (추상클래스로 선언하거나 Override해야 함)
	인터페이스는 다중 구현이 가능
	   - ex. public A implement I1, I2 ...{}
	상속과 구현을 동시에 가능
	   - ex. public class A extends B implements I {}
	객체(인스턴스)를 생성하지 못함
	인터페이스로 다형적 표현이 가능
	   - ex. B b = new A();
	   - ex. I i = new A();
*/
	
/*
	인터페이스 목적/이유
	   - 자바의 다형성을 극대화하여 개발코드 수정을 줄이고 프로그램 유지보수성을 높이기 위해
	   - 공통점끼리만 하나로 묶어야 할 경우
	     상속관계가 아닌 것들도 다형적변수에 의해 같은 타입으로 만들 수 있다
	   - 같은타입으로 묶으므로써 매개변수의 다형성을 가질 수 있다
	JAVA8버젼부터 default메서드 / static메서드 추가
*/
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		calc.showInfo();
	
		calc.description();
		
		int arr[] = {1, 2, 3, 4, 5};
		System.out.println(Calc.total(arr));	//static 메서드
	}
}

interface Calc {
	//인터페이스에서 선언한 변수는 final이 생략된 상수
	double PI = 3.14;
	int ERROR = -999999999;
	
	//인터페이스에서 선언한 메서드는 자동으로 추상메서드로 변환
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	//default 메서드
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
	}
	
	//static 메서드
	static int total(int[] arr) {
		int total = 0;
		for (int i : arr) {
			total += i;
		}
		return total;
	}
}

abstract class Calculator implements Calc{
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
	
//	@Override
//	public abstract int times(int num1, int num2);
}

class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0)
			return num1 / num2;
		else
			return Calc.ERROR;
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}	
	
//	@Override
//	public void description() {
////		super.description();
//		System.out.println("Override - 정수 계산기를 구현합니다.");
//	}

}