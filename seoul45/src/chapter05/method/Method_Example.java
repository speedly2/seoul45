package chapter05.method;

import java.util.Scanner;

public class Method_Example {

	public static void main(String[] args) {
		// 메서드 만들어보기
		// 전체 구구단 출력
		methodEx();
		System.out.println("=============");
		// 특정 단 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("단: ");
		int num = scan.nextInt();
		methodEx(num);
	}

	public static void methodEx() {
        for (int i = 2; i <= 9; i++) {
            System.out.println("* [" + i + "] 단");
            methodEx(i);
            System.out.println();
        }
    }
	
	public static void methodEx(int number) {
        for (int i = 1; i <= 9; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

}
