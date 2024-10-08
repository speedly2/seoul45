package chapter17.lambda;

@FunctionalInterface
interface MyNumber {
	int getMax(int a, int b);
}

public class C150_functionalInterface {

	public static void main(String[] args) {
/*
	함수형 인터페이스는 추상 메소드가 하나만 존재는 인터페이스를 의미한다. 
	그리고 람다식은 그 추상 메소드를 구현하는 역할을 한다. 
	반대로 함수형 인터페이스가 아닌 다른 변수에는 람다식을 사용할 수 없다.
 */
		
		//1
		MyNumber max = (x, y) -> (x >= y) ? x : y;
		System.out.println(max.getMax(10, 20));

		//2
		MyNumber max2 = (x, y) -> {
			if (x >= y) return x;
			else		return y;
		};
		System.out.println(max2.getMax(10, 20));
		
		//3
		MyNumber max3 = new MyNumber() {
			@Override
			public int getMax(int a, int b) {
				return a > b ? a : b;
			}
		};
		System.out.println(max3.getMax(10, 20));
		
		//4
		int max4 = new MyNumber() {
			@Override
			public int getMax(int a, int b) {
				return a > b ? a : b;
			}
		}.getMax(10, 20);
		System.out.println(max4);
	}

}
