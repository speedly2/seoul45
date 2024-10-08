package chapter14.exception;

public class C118_exception1 {

	public static void main(String[] args) {
/*
		※ 예외처리(Exception handling)이란
			프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것
			프로그램의 비정상 종료를 막고, 정상적인 실행상태를 유지하는 것

		※ 프로그램 오류
			ⓐ 컴파일 에러(compile-time error) : 컴파일 할 때 발생하는 에러
			ⓑ 런타임 에러(runtime error) : 실행 할 때 발생하는 에러
		 	( 문법에는 맞아 컴파일은 됐지만 실제로 JVM이 코드를 실행할 때 문제가 발생 하는 경우 )
			ⓒ 논리적 에러(logical error) : 작성 의도와 다르게 동작
*/
		int a, b, c;
		a = 2;
		b = 0;
//		c = a / b;							//1
//		System.out.println("c = " + c);		//1
		
//		if (b != 0) {						//2
//			c = a / b;
//			System.out.println("c = " + c);
//		}
		
//		try {
//			c = a / b;
//			System.out.println("c = " + c);
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("0으로 나눌 수 없습니다.");
//		}
		System.out.println("프로그램 실행 완료");
	}

}
