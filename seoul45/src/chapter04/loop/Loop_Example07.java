package chapter04.loop;

public class Loop_Example07 {

	public static void main(String[] args) {
/*
		3번			4번
		    *		*****
		   **		 ****
		  ***		  ***
		 ****		   **
		*****			*
*/
		//3번
		//3-1 첫번째 방법
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//3-2 두번째 방법
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j < 5; j++) {
				if (j < i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=======");
		
		//4번
		//4-1 첫번째 방법
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= 5-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//4-2 두번째 방법
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j < i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
