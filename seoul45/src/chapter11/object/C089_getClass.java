package chapter11.object;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class C089_getClass {
	
	public static void main(String[] args) {
		
/*
		p411
		리플렉션(Reflection)은 Java에서 런타임에 클래스의 메타데이터를 조회하거나 수정할 수 있는 강력한 기능
		리플렉션은 구체적인 클래스 타입을 알지 못하더라도 그 클래스의 메서드, 타입, 변수들에 접근할 수 있도록 해주는 자바 API
		컴파일 시간이 아닌 실행 시간에 동적으로 특정 클래스의 정보를 추출할 수 있는 프로그래밍 기법
		출처: https://jeongkyun-it.tistory.com/225 [나의 과거일지:티스토리]
		
		그럼 이 리플렉션은 언제 사용할까?
			동적으로 클래스를 사용해야할 때 사용한다.
			다시 말해, 작성 시점에는 어떠한 클래스를 사용해야할지 모르지만 런타임 시점에서 가져와 실행해야하는 경우 필요하다.
			프레임워크나 IDE에서 이런 동적 바인딩을 이용한 기능을 제공한다.
		리플렉션 사용 예시
			IntelliJ의 자동완성 기능
			스프링 어노테이션
		
		리플렉션은 힙 영역에 로드 된 Class 타입의 객체를 통해, 접근 제어자 상관없이 원하는 클래스의 정보에 접근해서 조작할 수 있도록 지원하는 API
		리플렉션(Reflection)은 자바에서 런타임에 클래스, 메서드, 필드 등을 동적으로 조사하고 조작할 수 있는 기능
		모든 클래스와 인터페이스는 컴파일되면 메모리에 로드되고, 자바 런타임 환경에서 해당 클래스 또는 인터페이스의 
		메타데이터를 나타내는 Class 객체가 생성
		private 멤버일지라도 읽어올 수 있음
 */
		
		Human kim = new Human(29, "김상형");

		// Object.toString() : getClass().getName()
		Class cls = kim.getClass();
		System.out.println(cls);
		
		// 그런데 만약, 클래스의 이름을 몰랐다고 했을 때는 어떻게 클래스 명을 가져올까?
		Class cls2;
		try {
			// 주의할점은 패키지 네임이 포함된 클래스 명을 써줘야한다.
			cls2 = Class.forName("chapter11.object.Human");
			System.out.println("클래스 이름 = " + cls2.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

//		Class<Human> cls2 = Human.class;	// 클래스의 타입을 지정해서 Class 객체를 얻을 수 있음
//		System.out.println(cls2);
		
		// 클래스의 이름을 반환
		System.out.println(kim.getClass().getName());
		System.out.println("클래스 이름 = " + cls.getName());
		// 슈퍼클래스의 Class 객체를 반환
//		Object obj = cls.getSuperclass();
//		System.out.println(obj instanceof Object);
//		System.out.println(obj instanceof Human);
		System.out.println("슈퍼 클래스 = " + cls.getSuperclass().getName());

		System.out.print("필드 : ");
		// Human 클래스에 선언된 모든 멤버변수 목록 가져오기
		Field[] fields = cls.getDeclaredFields();
		for (Field F : fields) {
			System.out.print(F.getName() + " ");
		}
		
		System.out.println();
		System.out.print("메서드 : ");
		// Human 클래스에 선언된 모든 멤버메서드 목록 가져오기
		Method methods[] = cls.getDeclaredMethods();
		for (Method M : methods) {
			System.out.print(M.getName() + " ");
		}
		
		
		C089_getClass s = new C089_getClass();
		s.h = new Human(30, "김상형");
		System.out.println(s.h.toString());
		
	}

	// 직접 만든 @Inject 어노테이션을 붙인 필드는 인스턴스 객체를 자동으로 주입받도록 만들어보자.
	@Inject
	Human h;
}

// 어노테이션 정의
@Retention(RetentionPolicy.RUNTIME)
@interface Inject {
}