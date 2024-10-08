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
		
		* 내부적으로 동적 배열을 사용하여 문자열을 저장
 */
		String str = "strA";
		// String 클래스에 재정의된 equals, hashcode는 문자열의 내용이 같으면 동일하다로 판단하기에 같은 해시코드를 갖음
		String str2 = new String("strA");
		StringBuilder sbd = new StringBuilder();
		sbd.append("sbdA");
		StringBuffer sbf = new StringBuffer();
		sbf.append("sbfA");
		
		System.out.println("=== 출력1 ===");
		System.out.println(str);
		System.out.println(str2);
		System.out.println(sbd);
		System.out.println(sbf);

		System.out.println("String 객체의 hashcode : "+str.hashCode());
		System.out.println("String2 객체의 hashcode : "+str2.hashCode());
		System.out.println("String, String2 객체의 주소 비교 : "+(str == str2));
		System.out.println("StringBuilder 객체의 주소 : "+sbd.hashCode());
		System.out.println("StringBuffer 객체의 주소 : "+sbf.hashCode());

		// 데이터 수정 후 주소 비교
		str += "strB";
		sbd.append("sbdB");
		sbf.append("sbfB");
		System.out.println("==== 수정 후 ====");
		System.out.println("=== 출력2 ===");
		System.out.println(str);
		System.out.println(str2);
		System.out.println(sbd);
		System.out.println(sbf);

		System.out.println("String 객체의 주소 : "+str.hashCode());
		System.out.println("StringBuilder 객체의 주소 : "+sbd.hashCode());
		System.out.println("StringBuffer 객체의 주소 : "+sbf.hashCode());
		
		
		long start = System.currentTimeMillis();
		String result1 = "";
		for (int i = 0; i < 1000; i++) {
			for (char ch = 'A'; ch <= 'z'; ch ++) {
				result1 += ch;
			}
			result1 += '\n';
		}
		//System.out.println(result1);
		System.out.println((System.currentTimeMillis()-start)/1000.0 + "초");
		
		System.out.println("=========");
		
		long start2 = System.currentTimeMillis();
		StringBuffer result2 = new StringBuffer();
		for (int i = 0; i < 1000; i++) {
			for (char ch = 'A'; ch <= 'z'; ch ++) {
				result2.append(ch);
			}
			result2.append('\n');
		}
		//System.out.println(str2);
		System.out.println((System.currentTimeMillis()-start2)/1000.0 + "초");
	}

}
