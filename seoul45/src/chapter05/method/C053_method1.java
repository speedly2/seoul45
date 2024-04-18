package chapter05.method;

public class C053_method1 {

	public static void main(String[] args) {
/*
	method 개념 - thread 관점
	main메서드에서 순차적으로 처리되는 중에 호출이 된 method는 
	별도의 memory와 thread를 생성하여 작업을 진행하고, 그 결과를 호출한 곳으로 리턴한다.
	ex. A -> 돈 -> B -> 빵과 우유
	A는 B에게 돈을 줄 뿐 엘리베이터를 타고 내려가 편의점에서 사오든 인터넷으로 주문하든 빵과 우유를 받기만 하면 된다.
	즉, 메서드는 A, B 사람이 구분된 것 처럼 별도의 작업공간으로 main이라는 메서드의 큰 흐름에서 
	호출되어지는 메서드는 작은 작업단위를 생성하여 작업을 진행한다.
 */
		System.out.println("1 ~ 10 = " + calcSum(1, 10));
		System.out.println("15 ~ 100 = " + calcSum(15, 100));
	}
	
	public static int calcSum(int from, int to) {
		int sum = 0;
		for (int i = from; i <= to; i++) {
			sum += i;
		}
		return sum;
	}
}
