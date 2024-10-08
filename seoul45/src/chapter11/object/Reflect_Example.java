package chapter11.object;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

public class Reflect_Example {
	
	// 직접 만든 @InjectCode 어노테이션을 붙인 필드는 인스턴스 객체를 자동으로 주입받도록 만들어보자.
	@InjectCode
	Human h;

	public static void main(String[] args) {
		Reflect_Example s = new Reflect_Example();
		
		// 필드 초기화
//		Human kim = new Human(29, "김상형");
//		s.h = kim; // 초기화

		// 어노테이션 리플렉션 처리
		injectDependencies(s); // 필드 주입 처리

		// h 필드 사용
		System.out.println(s.h.toString());
	}

	// 의존성 주입 메서드
	private static void injectDependencies(Reflect_Example obj) {
		Field[] fields = obj.getClass().getDeclaredFields();
		for (Field field : fields) {
			// 어노테이션을 정의할 때 interface를 사용하지만, 사용 시에는 일반 클래스처럼 참조할 수 있습니다.
			if (field.isAnnotationPresent(InjectCode.class)) {
				// 필드에 @InjectCode가 붙어 있을 경우
				try {
					field.setAccessible(true); // 접근 제어자 무시
					field.set(obj, new Human(30, "홍길동")); // Human 객체로 주입
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

//어노테이션 정의
//@Retention(RetentionPolicy.RUNTIME)는 애노테이션을 런타임에 사용할 수 있도록 설정
//이 설정을 통해 리플렉션을 사용하여 런타임에서 애노테이션을 읽을 수 있음
@Retention(RetentionPolicy.RUNTIME)
@interface InjectCode {
}
