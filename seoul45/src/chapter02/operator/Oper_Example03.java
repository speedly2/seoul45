package chapter02.operator;

import java.util.Scanner;

public class Oper_Example03 {

	public static void main(String[] args) {
/*
		각 자리수의 합 구하기
		출력결과: 
			0~999 사이의 정수를 입력하세요
			315
			각 자리수의 합: 9
 */
		Scanner scan = new Scanner(System.in);
		System.out.println("0~999 사이의 정수를 입력하세요");
		int num = scan.nextInt();
		
		int num100 = num / 100;
		int num10  = num % 100 / 10;
		int num1   = num % 100 % 10;
		
		int sum = num100 + num10 + num1;
		
		System.out.println("각 자리수의 합: " + sum);
		
		
		
		// 반복문 사용
		int sum2 = 0;
		while (num > 0) {
            sum2 += num % 10;  // 마지막 자리를 더함
            num /= 10;         // 마지막 자리를 제거
        }
		System.out.println(sum2);
	}

}
