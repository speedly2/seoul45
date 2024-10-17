package chapter01.data;

public class C006_DataType {

	public static void main(String[] args) {
		/*
			[ 데이터 타입 ]
			
			1. 기본형 데이터타입
				- 정수형
					byte(1), short(2), int(4), long(8)
					char(2)		// 정수형 & 문자형
				- 실수형
					float(4), double(8)
				- 논리형
					boolean(1)
				
			2. 참조형 데이터타입
				- 기본형 데이터타입이 아닌 모든 "객체"
					class, enum, array, interface...
		 */
		
		//기본형 데이터타입
		byte a = 127;	// 128 err
		short b = 12345;
		int c = 1234567890;
		long d = 12345678900l;
		char e = 'A';
		float f = 3.14f;
		double g = 3.14;
		boolean h = true;
		
		var v1 = 'B';
		var v2 = 123;
		String s = "안녕하세요";
		String n = null;

		System.out.println("byte   : " + a);
		System.out.println("short  : " + b);
		System.out.println("int    : " + c);
		System.out.println("long   : " + d);
		System.out.println("char   : " + e);
		System.out.println("float  : " + f);
		System.out.println("double : " + g);
		System.out.println("boolean: " + h);
		System.out.println("var1   : " + v1);
		System.out.println("var2   : " + v2);
		System.out.println("string : " + s);
		System.out.println("null   : " + n);
		System.out.println("=================");
		
		// 문자형 타입의 정수화
		char alpha = 'A';
		System.out.println(alpha);
		
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		// 정수형 타입의 문자화
		char ch2 = 66;
		System.out.println(ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		/*
		 	컴퓨터는 0, 1로 구분하며 해당 수치로 문자를 표현하길 희망
			ASCII = 128개 
			알파벳과 통화를 포함한 미국을 중심으로 한 영어권에서 사용
			컴퓨터 대중화로 서유럽 언어의 알파벳을 추가
			ISO-8859-1 = 256개	(초창기 HTML 표준 언어 코드)		-유럽
			컴퓨터 산업의 확대로 그 외의 다른 언어를 사용하는 지역이 문제
			독자적 코드를 생산
			한국 KSC5601-1987
			각기 다른 코드가 불편해 전세계의 언어 코드를 하나의 코드로 통일
			UNICODE = 1114112개
			위의 유니코드를 컴퓨터에 어떻게 저장하느냐의 방식에 따라
			UTF-8, UTF-16 등이 존재하며 이를 인코딩(Encoding) 또는 캐릭터셋(Charset)이라 함
			Java는 기본적으로 유니코드를 완벽히 지원하는 언어
			UTF-8 = 65536개(표준)
		 */
	}

}
