package chapter11.object;

public class C098_record {
/*
	record
	불변(immutable) 객체를 쉽게 생성할 수 있도록 하는 유형의 클래스
	  * 필수	
		- 모든 필드에 final 선언
		- 필드 값을 모두 포함한 생성자
		- 접근자 메서드(getter)
		- 클래스의 상속을 제한하려면 클래스 레벨에도 final 선언
		
	  * 자동생성
		- 필드 캡슐화
		- 생성자 메서드
		- getters 메서드
		- equals 메서드
		- hashcode 메서드
		- toString 메서드
	
	Q. 레코드(record)를 JPA의 Entity 클래스로 사용할 수 없을까요?
		레코드는 바이트코드로 본 것처럼 final 클래스(상속불가)이고, 
		abstract로 선언할 수 없습니다.
		따라서 레코드를 Entity 클래스에 사용할 수 없는데요, 
		그 이유는 JPA의 지연로딩에 있습니다.
		지연 로딩 방식을 사용할 때, 
		JPA는 엔티티 객체의 프록시 객체를 생성합니다. 
		프록시 객체는 원본 객체를 상속하여 생성된 확장 클래스입니다. 
		하지만 레코드는 상속이 불가능하므로 엔티티로 사용할 수 없습니다.
*/
	public static void main(String[] args) {
		Member member = new Member("홍길동", 1234);
		System.out.println(member);
		System.out.println(member.name());
		System.out.println(member.memberCode());
	}

}

record Member(String name, int memberCode) {
/*
	레코드 클래스를 사용하면 훨씬 간결한 방식으로 동일한 불변 데이터 객체 정의할 수 있음
 	컴파일러는 헤더를 통해 내부 필드를 추론
 	생성자를 작성하지 않아도 되고 toString, equals, hashCode 메소드에 대한 구현을 자동으로 제공
 	
 	ㆍ레코드의 제한
     - 레코드는 암묵적으로 final 클래스(상속불가)이고, abstract 선언 불가
     - 다른 클래스를 상속(extends) 받을 수 없음, 인터페이스 구현(implements)은 가능
 */
}
