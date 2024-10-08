package chapter20.enum_part;

import java.util.function.DoubleBinaryOperator;

public class C178_enum5 {

	public static void main(String[] args) {
		double x = 2.5;
	    double y = 5.0;

	    // Operation 상수집합의 PLUS 상수를 정의
	    Operation plus = Operation.PLUS;
	    System.out.println("==========");

	    // enum 매핑값 출력
	    String name = plus.toString();
	    System.out.println(name); // +

	    // enum 확장 메소드 실행
	    double result = plus.apply(x, y); // 덧셈을 수행하는 메소드 (Operation.PLUS.apply(x, y) 로 해도됨)
	    System.out.println(result); // 7.5

	    // ------------------------------------------------------------------- //

	    // Operation 상수집합의 MULTI 상수를 정의
	    Operation multi = Operation.MULTI;

	    String name2 = multi.toString();
	    System.out.println(name2); // *

	    // enum 확장 메소드 실행
	    double result2 = multi.apply(x, y); // 곱셈을 수행하는 메소드
	    System.out.println(result2); // 12.5
	}
}

// enum 확장
// 추상 메소드를 정의해서 각 상수마다 익명 클래스 "익명 클래스" 처럼 메소드 재정의를 하게 해서 
// 각 상수마다 다른 역할을 하는 메소드를 갖게 되는 원리
enum Operation {
	//추상메서드 apply를 구체화
    PLUS("+") {
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        public double apply(double x, double y) {
            return x - y;
        }
    },
    MULTI("*") {
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        public double apply(double x, double y) {
            return x / y;
        }
    };

    // 클래스 생성자(private)와 멤버
    private final String symbol;
    Operation(String symbol) {
        this.symbol = symbol;
        System.out.println(this.symbol);
    }

    // Object를 상속 받기 때문에 Object 정의 메서드의 Override 가능  
    // toString을 재정의하여 열거 객체의 매핑된 문자열을 반환하도록
    @Override
    public String toString() {
        return symbol;
    }

    // 열거 객체의 메소드에 사용될 추상 메소드 정의
    // 자바의 enum은 단순한 상수 집합 이상으로 클래스처럼 동작할 수 있는 특수한 클래스. 
    // 따라서 enum에 추상 메서드를 선언할 수 있으며, 각 상수는 그 추상 메서드를 구체적으로 구현해야 함.
    public abstract double apply(double x, double y);
}



abstract class Abstract {
	public abstract double apply(double x, double y);
}
class Operation2 extends Abstract {
    public static final Operation2 Test = new Operation2(".") {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    };
    
    private final String symbol;
    Operation2(String symbol) {
        this.symbol = symbol;
        System.out.println(this.symbol);
    }
    
    @Override
    public double apply(double x, double y) {
        return x * y;
    }
}