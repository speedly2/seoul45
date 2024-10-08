package chapter14.exception;

public class C122_throw2 {

	public static void main(String[] args) {
		/*
			Unchecked Exception: 컴파일러가 예외 처리를 강제하지 않는 예외입니다. 
			이 예외는 RuntimeException을 상속하는 예외로, 
			NullPointerException, ArrayIndexOutOfBoundsException 등이 있습니다. 
			이러한 예외는 컴파일 시점이 아니라 프로그램 실행 중에 발생할 수 있으며, 
			throws 키워드를 사용하지 않아도 컴파일 에러가 발생하지 않습니다.
		 */
		String name = null;
		try {
			System.out.println(1);
			printScore(name);
			System.out.println(2);
		}
		catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void printScore(String name) {
		if (name == null) {
			throw new NullPointerException("이름이 무효합니다.");
		}
		System.out.println(name.length());
	}
}
