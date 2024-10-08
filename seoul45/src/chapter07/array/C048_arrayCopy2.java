package chapter07.array;

import java.util.Arrays;

public class C048_arrayCopy2 {

	public static void main(String[] args) {
		int[] array1 = new int[]{1, 2, 3, 4, 5};
		int newLength = 10;

/*
 		System 클래스는 Java의 java.lang 패키지에 속하며, 표준 입력, 출력, 오류 출력 스트림을 조작하고, 
 		시스템의 환경 속성 및 외부 리소스에 대한 접근을 제공하는 여러 가지 유틸리티 메서드를 포함하고 있습니다.
 		
 		표준 입력, 출력, 오류 스트림:
			System.in: 표준 입력 스트림(InputStream)입니다. 주로 키보드 입력을 받는 데 사용됩니다.
			System.out: 표준 출력 스트림(PrintStream)입니다. 주로 콘솔에 데이터를 출력하는 데 사용됩니다.
			System.err: 표준 오류 출력 스트림(PrintStream)입니다. 오류 메시지를 콘솔에 출력하는 데 사용됩니다.
		
		Java에서 native 코드는 Java가 아닌 다른 프로그래밍 언어로 작성된 코드를 의미합니다. 
		주로 C나 C++로 작성된 라이브러리를 Java에서 호출할 때 사용
		
		System.out 객체는 기본적으로 PrintStream 인스턴스입니다. 
		JVM이 시작될 때 PrintStream 객체가 생성되고, 표준 출력 스트림에 연결
 */
		
		// System 클래스의 arraycopy() 메소드 (얕은 복사)
		// System.arraycopy(복사할 배열, 복사할 첫 위치, 대상 배열, 붙여 넣을 첫 위치, 복사할 요소 개수)	
		System.out.println("System 클래스의 arraycopy() 메서드");
		int[] array2 = new int[newLength];
		System.arraycopy(array1, 0, array2, 0, array1.length);
		// 1 2 3 4 5 0 0 0 0 0 
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i]+" ");			
		}
		System.out.println();
		
//		System.out.println("Arrays 클래스의 copyOf() 메서드");
//		sunny1 = new int[]{5, 4, 3, 2, 1};
//		// Array 클래스의 copyOf() 메소드
//		// Arrays.copyOf(원본배열, 원본 배열에서 복사해올 길이)
//		int[] sunny3 = Arrays.copyOf(sunny1, newLength);
//		// 1 2 3 4 5 0 0 0 0 0 
//		for (int i = 0; i < sunny3.length; i++) {
//			System.out.print(sunny3[i]+" ");			
//		}
//		System.out.println();
//
//		System.out.println("Object 클래스의 clone 메서드");
//		// Object 클래스의 clone 메소드
//		int[] sunny4 = (int[])sunny1.clone();
//		// 1 2 3 4 5
//		for (int i = 0; i < sunny4.length; i++) {
//			System.out.print(sunny4[i]+" ");			
//		}
//		System.out.println();

		System.out.println("for문을 이용한 복사");
		// for문과 인덱스를 이용한 복사
		int[] array3 = new int[newLength];
		for(int i = 0; i < array1.length; i++) {
			array3[i] = array1[i];
		    System.out.print(array3[i]+" ");			
		}
		// 1 2 3 4 5 0 0 0 0 0 
	}

}
