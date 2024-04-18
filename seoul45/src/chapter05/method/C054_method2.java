package chapter05.method;

public class C054_method2 {

	public static void main(String[] args) {
/*
		메서드 호출부분
		메서드 생성부분에서 정의 되어진대로 메서드를 호출하자
		호출하는 메서드가 파라미터가 있으면 데이터타입과, 개수, 순서에 맞춰서 보내주고
		호출하는 메서드가 메서드의 실행결과(명령어)를 반환하는 메서드라면 해당 데이터타입의 값이 된다
		데이터타입을 맞춰 변수에 담아도 담지 않고 값으로써 사용해도 상관 없다
*/
		
		method01();
		String result = method02();				// String result = "반환값";
		System.out.println(result);
		method03(3);
		System.out.println(method04(1, 2));		// System.out.println(3);
	}

/*
		메서드 생성부분(정의부분)
		형식에서  [ ]이 뜻하는 것은 =>있어도 되고 없어도 된다는 뜻.
		접근지정자  () 리턴타입  메서드명 (   [ 타입  매개변수1, 타입  매개변수2….]   )
		{
				메서드가 해야 할 문장들…
				return [  값  ] ;
		}
		
		Ex) 호출부
		int sum = add(3, 7);			// int sum = 10;
		System.out.println(sum);
		==결과
		10
		
		Ex) 생성부
		public int add(int abc, int b){
				int sum = 0;
				sum = abc + b;
				return sum;
		}
*/
	
	
	//1. 데이터를 받아오지도 데이터를 반환하지도 않는 메서드
	//파라미터 X, 반환값 X
	//void 없다  => 반환할게 없으면 반환하지 않겠다라는 의미로 void라고 리턴타입에 명시를 해줘야 합니다.
	public static void method01() {
		System.out.println("아무거나");
		System.out.println("단순 명령어 실행, 아무 값도 받아오지 않았고 println만 실행했을뿐 어떤 값도 반환하지 않았다.");
	}
	
	//2. 데이터를 받아오지는 않지만 데이터를 반환하는 메서드
	//파라미터 X, 반환값 O
	public static String method02() {
		System.out.println("====================================");
		System.out.println("2번째 메서드 출력");
		String result = "";
		result = "반환값";
		return result;
		//return : 사전적 의미 = 반환한다. or 원래 있던 곳으로 되돌아간다.
		//자바 = 어떤 값을 반환한다. 어떤 값을 가지고 돌아가겠다.
		//조건문이나 반복문에서 사용하게 되면 "종료"의 의미를 가진다.
		//조건문이나 반복문의 종료가 아닌 프로그램 실행 자체의 종료.
	}
	
	//3. 데이터를 받아오지만 데이터를 반환하지는 않는 메서드
	//파라미터 O, 반환값 X
	public static void method03(int a) {
		System.out.println("받아온 파라미터 값은 : " + a + "이지만 받아만 왔을 뿐 반환하지 않았다.");
	}
	
	//4. 데이터를 받아오기도 데이터를 반환하기도 하는 메서드
	//파라미터 O, 반환값 O
	public static int method04(int a, int b) {
		int sum = a + b;
		return sum;
	}

}
