package chapter20.enum_part;

enum Direction { 
	EAST, WEST, SOUTH, NORTH 
};
enum Yoil { 
	SUN, MON, TUE, WED, THR, FRI, SAT 
};

public class C174_enum1 {

	public static void main(String[] args) {
/*
	Enumeration("열거, 목록, 일람표")
	JAVA의 enum은 인터페이스와 같이 독립된 특수한 클래스로 구분한다. 
	즉, 일종의 객체이기 때문에 힙(heap) 메모리에 저장되며 
	각 enum 상수들은 별개의 메모리 주소값을 가짐으로써 완벽히 독립된 상수를 구성할 수 있는 것이다.
	
	장점
		코드가 단순해지며 가독성이 좋아진다
		허용 가능한 값들을 제한하여 유형 안전(type safe)을 제공한다.
		키워드 enum을 사용하기 때문에 구현의 의도가 열거임을 분명하게 나타낼 수 있다.
		자체 클래스 상수와 달리 switch문에서도 사용할 수 있다
		단순 상수와 비교해 IDE의 적극적인 지원을 받을 수 있다 (자동완성, 오타검증, 텍스트 리팩토링 등등)
		리팩토링시 변경 범위가 최소화 된다 (enum에서 한번에 관리하기 때문에 내용의 추가가 필요하더라도, Enum 코드외에 수정할 필요가 없다)
		enum은 본질적으로 Thread safe인 싱글톤 객체 이므로 싱글톤 클래스를 생성하는데에도 사용된다
 */
		Direction origin = Direction.EAST;		// 동쪽으로 초기화
		origin = Direction.SOUTH;				// 남쪽으로 대입
		if (origin == Direction.WEST)  { } 		// 서쪽이면
		if (origin != Direction.NORTH) { }		// 북쪽이 아니면
		
		System.out.println(origin);
//		origin = 9;							// 에러
//		if (origin == Yoil.SUN) { }			// 에러
		
		//비교
		System.out.println(origin);
		System.out.println(Direction.SOUTH);
		System.out.println(origin == Direction.SOUTH);
	}

}
