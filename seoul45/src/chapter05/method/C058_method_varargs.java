package chapter05.method;

public class C058_method_varargs {

	public static void main(String[] args) {
		System.out.println(getSum(1, 2));
		System.out.println(getSum(1, 2, 3, 4));
		System.out.println(getSum(8, 9, 6, 2, 9));
	}

/* 
	가변인자(variable arguments)
	JDK1.5부터 동적지정
	타입... 변수명 으로 선언
	public PrintStream printf(String format, Object... args) { ... }
	printf가 대표적이며 가변인자는 가장 마지막에 선언해야 한다.(컴파일 에러)
	
	가변인자는 내부적으로 배열을 이용
	가변인자가 선언된 메서드를 호출할 때마다 배열이 새로 생성된다
	가변인자를 사용할 경우 오버로딩된 메서드들 간의 구분이 되지 잘 되지 않아 
	가급적 가변인자를 사용한 메서드는 오버로딩 하지 않는 것이 좋다.
	ex. (String x, String... args) 일 경우 x가 가변인자 배열에 포함하여 인식할 수 있음
 */
	static int getSum(int... a) {
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		return sum;
	}
}
