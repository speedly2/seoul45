package chapter04.loop;

import java.util.Scanner;

public class Loop_Example03 {

	public static void main(String[] args) {
/*
		합 구하기
		2개의 정수를 입력받아 입력받은 정수를 포함한 사이값들의 총합을 구하시오
		단, 입력 순서에 상관없이 합을 구할 것.
		출력 결과:
			숫자 입력: 5			숫자 입력: 10
			숫자 입력: 10			숫자 입력: 5
			45					45
 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		int start = scan.nextInt();
		System.out.print("숫자 입력: ");
		int end = scan.nextInt();

		int sum = 0;
		int temp = 0;
		if (start > end) {
			temp = start;
			start = end;
			end = temp;
		}
		
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
		//2
//		int sum = 0;
//		if (start > end) {
//			for (int i = end; i <= start; i++) {
//				sum += i;
//			}
//		} else {
//			for (int i = start; i <= end; i++) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);
	}

}
