package chapter04.loop;

public class Loop_Example06 {

	public static void main(String[] args) {
/*
		1번			2번
		*			*****
		**			****
		***			***
		****		**
		*****		*
 */
		
		//1번
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=======");

		//2번
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
