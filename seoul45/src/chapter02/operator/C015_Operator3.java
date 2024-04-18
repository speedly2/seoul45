package chapter02.operator;

public class C015_Operator3 {

	public static void main(String[] args) {
		// 논리 연산자
		int num1 = 10;
		int num2 = 20;
		
		// and
		boolean flag = (num1 > 0) && (num2 > 0);
		System.out.println(flag);
		
		// and
		flag = (num1 < 0) && (num2 > 0);
		System.out.println(flag);
		
		// or
		flag = (num1 < 0) || (num2 > 0);
		System.out.println(flag);
		
		// not(부정)
		System.out.println( !flag );
		System.out.println("=======================");
		
		// 논리 연산자의 함정
		int num = 10;
		int i = 2;
		
		boolean value = ((num = num + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num);
		System.out.println(i);			// i값이 변하지 않음
		
		num = 10;
		i = 2;
		
		value = ((num = num + 10) > 10) || ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num);
		System.out.println(i);
		
		System.out.println("=======================");
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		
		// a == 1 or 상관없음 > 바로 true
		if (a == 1 || b == 2 && c == 10 || d == 10) {
			System.out.println("진실");
		} else {
			System.out.println("거짓");
		}
		
	}

}
