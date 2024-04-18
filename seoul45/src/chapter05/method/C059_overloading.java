package chapter05.method;

public class C059_overloading {

	public static void main(String[] args) {
/*
		오버로딩(Overloading) - ex. print메서드
		하나의 이름으로 여러 처리를 한다. (다형성)
		1. 메서드의 이름이 같아야 한다.
		2. 파라미터 개수가 달라야 한다.
		3. 파라미터 타입이 달라야 한다.
		4. 파라미터 순서가 달라야 한다.
*/
		getMax(5);
		getMax(5, 3.14);
		getMax(3.14, 5);		
		System.out.println("[3, 5] = " + getMax(3, 5));
		System.out.println("[3.4, 5.6] = " + getMax(3.4, 5.6));
	}

	static void getMax(int a) {
		System.out.println(a);
	}
	
	static void getMax(int a, double b) {
		System.out.println(a + b);
	}
	
	static void getMax(double b, int a) {
		System.out.println(a * b);
	}

	static int getMax(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	static double getMax(double a, double b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
}
