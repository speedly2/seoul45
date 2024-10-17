package chapter01.data;

public class C010_CharType {

	public static void main(String[] args) {
		// 문자형(char)
		char ch = '한';
		char ch2 = '\uD55C';	//유니코드 \\u로 시작되는 이스케이프시퀀스로 16진수 표현식
		System.out.println(ch);
		System.out.println(ch2);
		int i = ch;
		System.out.println(i);

		// 탈출 문자(escape sequence)
/*
		\n : 개행
		\t : 수평 tab
		\\ : \ 출력
		\' : ' 출력
		\" : " 출력
 */
		// 문자열 안에서 특수한 기능을 수행하는 명령어
		System.out.println(" 안 녕 하 \n 세 요 ");
		System.out.println(" 안 녕 하 \t 세 요 ");
		System.out.println(" 안 녕 하 \' 세 요 ");
		System.out.println(" 안 녕 하 \" 세 요 ");
		System.out.println(" 안 녕 하 \\ 세 요 ");
		
		// 문자열(String) = 문자의 배열(참조형)
		String str = "대한민국";
		System.out.println(str);
		
		// 탈출문자를 사용한 문자열
		String str2 = "아름다운 이땅에 금수강산에 " +
				"단군 할아버지가 \"터\" 잡으시고\n" + 
				"\'弘益人間\' 뜻으로 나라 세우니 " + 
				"대대손손 훌륭한 인물도 많아.";
		System.out.println(str2);
		
		System.out.println("==================");
		// 텍스트 블록(text block)
		// java15 도입, 
		// 여는 따옴표 다음에는 공백 및 주석 외의 다른 문자열 사용 불가
		// 개행한 후, 닫는 따옴표 사이의 모든 개행 및 특수문자를 탈출문자 없이 사용 가능
		String str3 = """	
				아름다운 이땅에 금수강산에
				단군 할아버지가 "터" 잡으시고 
				'弘益人間' 뜻으로 나라 세우니
				대대손손 훌륭한 인물도 많아.
				""";
		System.out.println(str3);
	}

}
