package chapter03.condition;

public class C022_If3 {

	public static void main(String[] args) {
		// If 중첩
		int age = 25;
		boolean man = true;
		
		if (age >= 19) {
			if (man) {
				System.out.println("성인 남성 : 25000원");
			} else {
				System.out.println("성인 여성 : 21000원");
			}
		} else { 
			System.out.println("청소년 : 15000원");
		}
		
	}

}
