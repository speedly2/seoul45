package chapter01.data;

public class C011_TextBlock {

	public static void main(String[] args) {
		// escape sequence
/*
		\n : 개행
		\t : 수평 tab
		\\ : \ 출력
		\' : ' 출력
		\" : " 출력
 */
		String s = "안녕\t"
				 + "하세요.\n"
				 + "\'java\' 수업 중";
		System.out.println(s);
		
		
		// 텍스트 블록
		// \s 단일공백문자 삽입
		String human = """
				이름 : 김상형    \s        
				나이 : 39               
				직업 : 프로그래머\s
				""";
		System.out.println(human);
		
		System.out.println("================");
		
		String str = "HTML example\n" + """
				<body>
				    <p>문단</p>
				</body>
				""";
		System.out.println(str);
	}

}
