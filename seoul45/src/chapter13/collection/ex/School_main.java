package chapter13.collection.ex;

import java.util.Scanner;

public class School_main {
	
	/*
		학생관리 프로그램
			- 클래스생성
				School_main, School_method, Student(학번, 이름, 전공)
			- 컬렉션 사용할 것.
		메뉴 1. 이름, 전공을 입력받아 학생 등록한다.
		메뉴 2. 이름을 입력받아 일치하는 학생정보를 출력한다.
		메뉴 3. 등록된 학생정보를 전부 출력한다. (단, 학번순으로 정렬하여 출력할 것)
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		School_method sm = new School_method();
		int num = 0;
		
		while (true) {
			sm.printMenu();
			num = scan.nextInt();
			switch (num) {
				case 1 -> sm.enterStudent();
				case 2 -> sm.selectStudent();
				case 3 -> sm.selectAll();
				case 0 -> System.exit(0);
			}
		}
	}
}
