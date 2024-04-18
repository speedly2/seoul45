package chapter11.object;

public class C094_stringBuffer {

	public static void main(String[] args) {
/*
		String
		불변성을 갖는다. → Immutable 하다.
		StringBuilder, StringBuffer
		가변성을 갖는다. → mutable 하다.
		속도 : StringBuilder > StringBuffer > String
		StringBuilder : 동기화지원O, 단일 스레드 환경 과 문자열의 추가, 수정, 삭제 등이 빈번히 발생하는 경우
		StringBuffer  : 동기화지원X, 멀티 스레드 환경 과 문자열의 추가, 수정, 삭제 등이 빈번히 발생하는 경우
 */
		
		long start = System.currentTimeMillis();
		String str = "";
		for (int i = 0; i < 1000; i++) {
			for (char ch = 'A'; ch <= 'z'; ch ++) {
				str += ch;
			}
			str += '\n';
		}
		//System.out.println(str);
		System.out.println((System.currentTimeMillis()-start)/1000.0 + "초");
		
		System.out.println("=========");
		
		long start2 = System.currentTimeMillis();
		StringBuffer str2 = new StringBuffer();
		for (int i = 0; i < 1000; i++) {
			for (char ch = 'A'; ch <= 'z'; ch ++) {
				str2.append(ch);
			}
			str2.append('\n');
		}
		//System.out.println(str2);
		System.out.println((System.currentTimeMillis()-start2)/1000.0 + "초");
	}

}
