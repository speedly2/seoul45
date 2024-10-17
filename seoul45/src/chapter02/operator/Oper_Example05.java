package chapter02.operator;

import java.util.Scanner;

public class Oper_Example05 {

	public static void main(String[] args) {
/*
		정수 3개를 입력받아 각 변수(a, b, c)에 값을 넣고,
		입력받은 값 중 최대값(max)을 출력하세요.
		(입력값의 순서에 상관없이 최대값이 출력되어야 함)
		hint. 삼항연산자(중복사용)
		출력결과 :
			첫번째 정수: 2
			두번째 정수: 4
			세번째 정수: 1
			최대값: 4
 */

		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수: ");
		int a = scan.nextInt();
		System.out.print("두번째 정수: ");
		int b = scan.nextInt();
		System.out.print("세번째 정수: ");
		int c = scan.nextInt();
		
		int max = a > b && a > c
				?
				  	a
				:
					b > c ? b : c;
		
		System.out.println("최대값: " + max);
		
		// if문
		// 배열 max
		// Math.max()
	}

}
