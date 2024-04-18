package chapter11.object;

public class C091_wrapper {

	public static void main(String[] args) {

/*
		기본형		Wrapper클래스
		boolean		Boolean
		byte		Byte
		char		Character
		short		Short
		int			Integer
		long		Long
		float		Float
		double		Double

		그리고 Wrapper 클래스들 (Integer, Boolean, Float 등등) 은
		생성자들이 Deprecated 되었습니다. (자바9 이후) 저 클래스들 생성자 호출 권장하지 않아요.
 */
		
		//boxing 기본형 -> 참조형
		int i = 1234;
		Integer wrapint = new Integer(i);
		String str = wrapint.toString();
		System.out.println(str);
		
		String a = "56", b = "78";
		System.out.println(a + b);
		System.out.println(Integer.parseInt(a) + Integer.parseInt(b));
		
		//unboxing 참조형 -> 기본형
		Integer wrapint2 = new Integer(629);
		int j = wrapint2.intValue();
		System.out.println(j);

		Double wrapdouble = new Double("3.14");
		int di = wrapdouble.intValue();
		System.out.println(di);
		
		//autoboxing 컴파일러가 필요하다면 박싱, 언박싱을 자동으로
		Integer c = new Integer(3);
		Integer d = new Integer(4);
		int e = c + d;
		System.out.println(e);
		
		Integer f = new Integer(12);
		d++;
		System.out.println(f);
		
		System.out.printf("int 타입의 크기 = %d, 최소값 = %d, 최대값 = %d\n", 
				Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.printf("short 타입의 크기 = %d, 최소값 = %d, 최대값 = %d\n", 
				Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
		System.out.printf("long 타입의 크기 = %d, 최소값 = %d, 최대값 = %d\n", 
				Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
	}
}
