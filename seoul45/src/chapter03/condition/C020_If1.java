package chapter03.condition;

public class C020_If1 {

	public static void main(String[] args) {
		// if
		int age = 15;
		
		if (age >= 19)
			System.out.println("성인입니다.");

		// if - else
		if (age >= 19) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("어린애입니다.");
		}
		
		// if - else if - else
		if (age >= 19) {
			System.out.println("성인입니다.");
		} else if (age > 12) {	// age < 19 && age > 12
			System.out.println("청소년입니다.");
		} else {				// age <= 12
			System.out.println("어린애입니다.");
		}
		
		// if - else if
		if (age >= 19) {
			System.out.println("성인입니다.");
		} else if (age > 12) {
			System.out.println("청소년입니다.");
		} else if (age > 5) {
			System.out.println("유아입니다.");
		}
	}

}
