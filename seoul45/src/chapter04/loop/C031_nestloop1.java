package chapter04.loop;

public class C031_nestloop1 {

	public static void main(String[] args) {
		// 구구단
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println("");
		}
		
		// 가로 ver.
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + i * j + "\t");
			}
			System.out.println("");
		}
	}

}
