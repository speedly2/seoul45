package chapter17.lambda;

interface Add {
	int add(int x, int y);
}
public class C152_lambda2 {

	public static void main(String[] args) {
/*
		람다 특징 (익명 함수, 익명 메서드)
		  -	함수형 인터페이스(Function interface)를 구현할 때 사용한다.
		  -	하나의 메소드이다. 메소드와 동일한 스택(Stack)을 갖는다.
		  -	일급 객체(First Class Object)로서 파라미터나 반환값 등으로 사용할 수 있다.
		람다 사용 (메서드 타입, 메서드 이름, 매개변수 타입, 중괄호, return 문을 생략하고, 화살표 기호를 넣음)
		  - 반환 값이 있는 메서드의 경우, return문을 생략하고 식으로 대신합니다.
		  - 람다식에 선언된 매개변수의 타입 또한 생략이 가능합니다.
		  - 만약 매개변수가 하나뿐인 경우에는 괄호( )를 생략할 수 있습니다.
		  - 단, 매개변수의 타입이 있으면 괄호()를 생략할 수 없습니다.
		  - 또한 중괄호{} 안의 문장이 하나일 때는 중괄호를 생략가능 한데, 
		    문장의 끝에 세미콜론' ; '을 붙이지 않는 것에 주의해야합니다.
		  - 하지만 중괄호{} 안의 문장이 return문일 경우 중괄호를 생략할 수 없고 
		    문장의 끝에 세미콜론도 생략하지 않습니다.
		    ** 타입을 생략을 해도 컴파일러가 에러를 띄우지않는 이유는, 컴파일러 나름대로 생략된 타입 위치를 추론하여 동작하게 해주기 때문이다.
		    ** 오로지 인터페이스로 선언한 익명 구현 객체만이 람다식으로 표현이 가능
*/
		// 익명객체
		Add a = new Add() {
			@Override
			public int add(int x, int y) {
				return x + y;
			}
		};
		System.out.println(a.add(3, 5));
		
		// 람다식 변수 할당
		Add lambda = (x, y) -> x + y; // 함수를 변수에 할당
		Add lambda2 = (x, y) -> { return x + y; };
		System.out.println(lambda);
        System.out.println(lambda.add(1, 2)); // 함수 사용
        System.out.println(lambda2.add(1, 2)); // 함수 사용
		
		// 람다식 매개변수 할당
		int n = result( (x, y) -> x + y ); // 메소드의 매개변수에 람다식을 전달
		System.out.println(n);
		
		// 람다식 반환값 할당
		Add func = makeFunction(); // 메소드의 반환값이 람다 함수
        int result = func.add(2, 4);
        System.out.println(result);
	}

	public static int result(Add lambda) {
    	return lambda.add(7, 8);
    }
	
	public static Add makeFunction() {
        return (x, y) -> x + y;
    }
}
