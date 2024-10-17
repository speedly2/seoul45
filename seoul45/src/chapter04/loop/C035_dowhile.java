package chapter04.loop;

import java.util.Scanner;

public class C035_dowhile {

	public static void main(String[] args) {
		// do-while
		// 반복조건이 num != 0 인데 비교를 하려면 일단 입력을 받아야됨
		// while문으로 한다면 입력받지 않은 상태에서 값을 평가해야함
		Scanner scaner = new Scanner(System.in);
		int num;
		int sum = 0;
		
//		System.out.print("숫자를 입력하세요(끝낼 때 0) : ");
//		num = scaner.nextInt();
//		while (num != 0) {
//			
//		}
		
		do {
			System.out.print("숫자를 입력하세요(끝낼 때 0) : ");
			num = scaner.nextInt();
			sum = sum + num;
		} while (num != 0);
		System.out.println("총 합계 = " + sum);
		scaner.close();
	}

}
