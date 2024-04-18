package chapter02.operator;

import java.util.Scanner;

public class Oper_Example04 {

	public static void main(String[] args) {
/*
		정수 3개를 입력받아 각 변수(kor, eng, math)에 값을 넣고,
		총합(sum)과 평균(avg)을 출력하세요.
		평균값은 소수점을 포함한 점수로 출력하세요.
		hint. 평균에 소수점 구하기 -> 연산 중에 자동 형변환 참고.
		출력결과 :
			kor점수: 80
			eng점수: 75
			math점수: 35
			총합: 190 평균: 63.333333333333336		
 */

		//입력을 받기 위해 이클립스에 만들어진 java.util.Scanner로부터 객체를 import(소환)
		Scanner scan = new Scanner(System.in);
		//명령어는 위에서 아래로, 오른쪽에서 왼쪽으로 실행되므로 입력 받기 전 먼저 출력되어
		//안내말처럼 사용하기 위해 "kor점수: " 라는 문자열을 출력
		System.out.print("kor점수: ");
		int kor = scan.nextInt();
		System.out.print("eng점수: ");
		int eng = scan.nextInt();
		System.out.print("math점수: ");
		int math = scan.nextInt();
		//총합과 평균의 연산값을 담기 위한 변수 선언(평균은 나눗셈이 포함되어 있으므로 실수형 데이터타입으로 선언함)
		int sum;
		double avg;
		sum = kor + eng + math;
		//정수형 데이터타입 int와 실수형 데이터타입 double의 연산을 하면 더 정밀한 쪽(double 실수형)으로 자동형변환 
		avg = sum / 3.0;
		System.out.println("총합: " + sum + " 평균: " + avg);
	}

}
