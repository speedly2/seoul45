package chapter11.object;

public class C092_string1 {

	public static void main(String[] args) {
		String str = new String("아름다운");
		System.out.println(str);

		String str2 = "우리나라";
		System.out.println(str2);
		
		char[] ar = { 'k', 'o', 'r', 'e', 'a' };
		String str3 = new String(ar);
		System.out.println(str3);
		
		System.out.println("대한민국".length());
/*	
		출력함수
		print() / println() / printf() / String.format()
		1. escape sequence (탈출 문자)
			\n : 개행
			\t : tab키 만큼 공백
			\" : 큰따옴표 출력
			\' : 작은따옴표 출력
		
		2. printf 출력서식 (자바 1.5이상)
			%b : boolean 형식으로 출력 
			%d : 정수 형식으로 출력
			%f : 소수점 형식으로 출력
			%c : 문자형식으로 출력 
			%s : 문자열 형식으로 출력
			%o : 8진수 정수의 형식으로 출력
			%x : 16진수 정수의 형식으로 출력
*/		
		System.out.println("\"안녕\"하세요.");
		
		int i = 123;
		double d = 3.14;
		String str4 = "문자열";
		System.out.printf("i = %d, d = %f, str = %s\n", i, d, str4);
		
		// 인덱스 지정자 : 포맷 지정자 앞에 위치하여 출력할 값의 순서를 지정하는 데 사용
		System.out.printf("i = %3$d, d = %2$f, str = %1$s\n", str4, d, i);
		System.out.printf("정수 = %1$d, i = %1$d", i);
		
		d = 3.14159265;
		System.out.printf("__%d__\n", i);
		System.out.printf("__%5d__\n", i);
		System.out.printf("__%-5d__\n", i);
		System.out.printf("__%05d__\n", i);
		System.out.printf("__%6.2f__\n", d);
		System.out.printf("__%8.4f__\n", d);
		
		System.out.println();
		String str5 = String.format("안녕%s", "하세요");
		System.out.println(str5);
	}

}
