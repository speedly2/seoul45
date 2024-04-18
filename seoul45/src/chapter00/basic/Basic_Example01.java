package chapter00.basic;

import java.util.Scanner;

public class Basic_Example01 {

	public static void main(String[] args) {
		//스캐너 클래스 생성
		Scanner sc = new Scanner(System.in);
		
		//정수 입력 받을 변수 초기화	
		int num = 0;
		System.out.print("정수를 입력해 주세요 : ");
		//키보드로 입력받기
		num = sc.nextInt();
		System.out.println("입력한 정수: " + num);
		
		//소수 입력 받을 변수 초기화
		double dNum = 0.0;
		System.out.print("소수를 입력해 주세요 : ");
		dNum = sc.nextDouble();
		System.out.println("입력한 소수 : " + dNum);
		
		//문자열을 입력 받을 변수 초기화
		String text = "";
		System.out.print("문자열을 입력해 주세요 : ");
		sc.nextLine();
		text = sc.nextLine();
		System.out.print("입력한 문자열 : " + text);
		sc.close();

	}

}
