package chapter04.loop;

import java.util.Scanner;

public class C032_nestloop2 {

	public static void main(String[] args) {
		// 숫자 맞추기
		Scanner scanner = new Scanner(System.in);
		int num = (int)(Math.random() * 10) + 1;
		for (;;) {
			System.out.print("숫자를 맛춰 보세요(1~10) : ");
			int input = scanner.nextInt();
			if (input == num) {
				System.out.println("정답입니다.");
				break;
			} else if (input > num) {
				System.out.println(input + "보다 더 작은 숫자입니다.");
			} else {
				System.out.println(input + "보다 더 큰 숫자입니다.");
			}
		}
		scanner.close();
	}

}
