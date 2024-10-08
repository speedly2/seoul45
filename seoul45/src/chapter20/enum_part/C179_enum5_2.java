package chapter20.enum_part;

import java.util.function.DoubleBinaryOperator;

public class C179_enum5_2 {

	public static void main(String[] args) {
		// enum을 사용하여 사칙연산을 정의하고, 람다식과 함수형 인터페이스를 활용해 각 연산을 구현하는 방식
		double a = 10;
        double b = 5;

        System.out.println("10 + 5 = " + Operation.PLUS  .apply(a, b));
        System.out.println("10 - 5 = " + Operation.MINUS .apply(a, b));
        System.out.println("10 * 5 = " + Operation.MULTI .apply(a, b));
        System.out.println("10 / 5 = " + Operation.DIVIDE.apply(a, b));
	}
}

enum Oper {
    PLUS  ("+", (x, y) -> x + y),
    MINUS ("-", (x, y) -> x - y),
    MULTI ("*", (x, y) -> x * y),
    DIVIDE("/", (x, y) -> x / y);

    private final String symbol;
    // DoubleBinaryOperator이라는 함수형 인터페이스를 사용하여 각 연산을 람다식으로 처리
    private final DoubleBinaryOperator op;

    Oper(String symbol, DoubleBinaryOperator op) {
        this.symbol = symbol;
        this.op = op;
    }

    @Override
    public String toString() {
        return symbol;
    }

    // apply 메서드가 BiFunction의 apply를 호출
    public double apply(double x, double y) {
        return op.applyAsDouble(x, y);
    }
}
