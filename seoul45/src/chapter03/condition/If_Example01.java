package chapter03.condition;

import java.util.Scanner;

public class If_Example01 {

	public static void main(String[] args) {
/*
		사각형의 넓이 구하기
		가로, 세로의 길이를 입력받아 넓이를 구하시오.
		단, 가로와 세로의 길이를 비교하여 정사각형 or 직사각형을 출력한다.  
		출력 결과:
			가로 입력: 5
			세로 입력: 4
			직사각형의 넓이는 20입니다.
 */
		Scanner scan = new Scanner(System.in);
		System.out.print("가로 입력: ");
		int width = scan.nextInt();
		System.out.print("세로 입력: ");
		int height = scan.nextInt();
		
		int area = width * height;
		
		if (width <= 0 || height <= 0) {
			System.out.println("종료");
		} else if (width == height) {
			System.out.println("'정사각형'의 넓이는 " + area + "입니다.");
		} else {
			System.out.println("'직사각형'의 넓이는 " + area + "입니다.");
		}
	}

}
