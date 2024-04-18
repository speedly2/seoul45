package chapter03.condition;

import java.util.Scanner;

public class If_Example04 {

	public static void main(String[] args) {
/*
		등급 나누기
		점수(0~100 사이의 정수)를 입력받아 등급을 출력한다.
		등급은 수, 우, 미, 양, 가 로 구분한다.
		단, 0~100 이외의 숫자를 입력시 "잘못 입력했습니다" 문구를 출력하고,
		프로그램을 종료한다.
		출력 결과 :
			점수 입력: 87
			우
 */
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력: ");
		int score = scan.nextInt();
		char grade = '수';
		
		//1번
		if		  (90 <= score && score <= 100) {
			grade = '수';
		} else if (80 <= score && score < 90) {
			grade = '우';
		} else if (70 <= score && score < 80) {
			grade = '미';
		} else if (60 <= score && score < 70) {
			grade = '양';
		} else if (0  <= score && score < 60) {
			grade = '가';
		} else {
			System.out.println("잘못 입력했습니다.");
		}
		
		//2번
		if		  (score < 0 || score > 100) {
			System.out.println("잘못 입력했습니다.");
			System.exit(0);		// 프로그램 실행 종료
		} else if (90 <= score) {  // 0 ~ 100
			grade = '수';
		} else if (80 <= score) {  // 0 ~ 89
			grade = '우';
		} else if (70 <= score) {
			grade = '미';
		} else if (60 <= score) {
			grade = '양';
		} else {
			grade = '가';
		}
		
		System.out.println(grade);

	}

}
