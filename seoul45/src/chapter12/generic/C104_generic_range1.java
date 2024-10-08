package chapter12.generic;

/*
	타입 한정 키워드 extends
	<T extends [제한타입]>
	Number의 하위 클래스만 올 수 있음
 */
class Calculator<T extends Number> {
	void add(T a, T b) { }
	void min(T a, T b) { }
	void mul(T a, T b) { }
	void div(T a, T b) { }
}

public class C104_generic_range1 {

	public static void main(String[] args) {
		// Number <- Integer, Double
		Calculator<Number>  cal1 = new Calculator<>();
		Calculator<Integer> cal2 = new Calculator<>();
		Calculator<Double>  cal3 = new Calculator<>();
		
		// 상한선이 Number까지라 컴파일 에러
//		Calculator<Object>  cal4 = new Calculator<>();
//		Calculator<String>  cal5 = new Calculator<>();
		
		
	}

}
