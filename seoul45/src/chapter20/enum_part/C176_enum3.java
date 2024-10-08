package chapter20.enum_part;

public class C176_enum3 {

	public static void main(String[] args) {
/*
	https://inpa.tistory.com/entry/JAVA-%E2%98%95-%EC%97%B4%EA%B1%B0%ED%98%95Enum-%ED%83%80%EC%9E%85-%EB%AC%B8%EB%B2%95-%ED%99%9C%EC%9A%A9-%EC%A0%95%EB%A6%AC
	enum mapping
	상수의 고유의 값(value)에 문자열을 출력하게 만들고 싶을때
 */
		Direction origin = Direction.EAST;
		System.out.println(origin.getHanDir() + "쪽으로 갑니다.");
		
		JavaType type;
		type = JavaType.INT;
		
		System.out.println("타입 : " + type + ", 이름 : " + 
			type.getName() + ", 길이 : " + type.getLength());
	}

	enum Direction { 
		EAST("동"), WEST("서"), SOUTH("남"), NORTH("북");
		final private String hanDir;	//문자열을 저장할 필드
		Direction(String han) {
			hanDir = han;
		}
		String getHanDir() {
			return hanDir;
		}
	};
	
	enum JavaType {
		SHORT("짧은 정수형",2), INT("정수형",4),DOUBLE("실수형",8);
		final private String typeName;	//문자열을 저장할 필드
		final private int length;
		JavaType(String name, int bytenum) {
			typeName = name;
			length = bytenum;
		}
		String getName() { return typeName; }
		int getLength()  { return length;   }
	};
}
