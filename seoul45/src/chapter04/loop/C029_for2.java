package chapter04.loop;

public class C029_for2 {

	public static void main(String[] args) {
		// 제어변수 활용
		for (int i = 0, j = 1; i < 5; i++, j = j + 2){
			System.out.println("i = " + i + ", j = " + j);
		}
	}

}
