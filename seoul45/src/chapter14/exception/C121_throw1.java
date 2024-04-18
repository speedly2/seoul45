package chapter14.exception;

public class C121_throw1 {

	public static void main(String[] args) {
//		String name = "빌게이츠";	//1
		String name = null;		//2
		printScore(name);
	}
	
	static void printScore(String name) {
//		System.out.println(name.length());	//1
		
		try {	//2
			System.out.println(name.length());
		}
		catch (NullPointerException e) {
			System.out.println("이름이 무효합니다.");
		}
	}
}
