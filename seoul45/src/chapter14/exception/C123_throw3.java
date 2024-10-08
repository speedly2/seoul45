package chapter14.exception;

public class C123_throw3 {

	public static void main(String[] args) 
			throws Exception	//1 
	{	
		/*
			Checked Exception: 컴파일러가 예외 처리를 강제하는 예외입니다. 
			예외가 발생할 수 있는 메서드를 호출할 때, 해당 예외를 try-catch 블록으로 처리하거나, 
			메서드에 throws 키워드를 사용해 명시적으로 예외를 던져야 합니다. 
			예를 들어, IOException이나 SQLException이 여기에 해당합니다.
		 */
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

	static void printScore(String name) 
			throws Exception	//1 
	{
		if (name == null) {
			throw new Exception("이름이 무효합니다.");
		}
		System.out.println(name.length());
	}

}
