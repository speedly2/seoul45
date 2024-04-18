package chapter14.exception;

public class C123_throw3 {

	public static void main(String[] args) throws Exception {
		String name = null;
		printScore(name);	//1

//		try {	//2
//			printScore(name);
//			
//		} catch (Exception e) {
//			System.out.println("err");
//			e.printStackTrace();
//		}
	}

	static void printScore(String name) throws Exception {
		if (name == null) {
			throw new Exception("이름이 무효합니다.");
		}
		System.out.println(name.length());
	}

}
