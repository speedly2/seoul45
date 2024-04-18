package chapter03.condition;

public class C025_Switch3 {

	public static void main(String[] args) {
		// String 조건
		String country = "China";
		
		switch (country) {
			case "Korea":
				System.out.println("Seoul");
				break;
			case "China":
				System.out.println("Beijing");
				break;
			case "Japan":
				System.out.println("Tokyo");
				break;
		}
		
		// String 비교( ==, equals() )
		String a = "안녕";
		String b = "안녕";
		System.out.println(a == b);	// 상수인 리터럴이므로 true
		
		String c = new String("안녕");
		System.out.println(a == c);	// new 연산자로 새로운 객체 false
		
		System.out.println(a.equals(c)); // 내용물 비교 true

	}

}
