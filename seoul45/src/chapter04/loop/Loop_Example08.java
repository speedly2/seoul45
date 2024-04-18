package chapter04.loop;

public class Loop_Example08 {

	public static void main(String[] args) {
/*
		1번
		    *
		   ***
		  *****
		 *******
		*********
		
		2번
		*********
		 *******
		  *****
		   ***
		    *
 */
		//1번
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 5-i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==========");
		
		//2번
		for (int i = 5; i >= 1; i--) {
			for (int j = 5-i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 2*i-1; k > 0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
