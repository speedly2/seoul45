package chapter14.exception;

public class C125_finally {

	public static void main(String[] args) {
		System.out.println("접속");
		try {
			System.out.println("전송");
			throw new Exception();
		}
		catch(Exception e) {
			System.out.println("예외 처리");
		}
		finally {
			System.out.println("해제");
		}
	}

}
