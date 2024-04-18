package chapter03.condition;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("연도: ");
		int year = scan.nextInt();
		String result = "평년";
		
		if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			result = "윤년";
		}
		System.out.println(result);
		
		if(year % 400 == 0) System.out.println("400 통과");
		if(year % 4 == 0) System.out.println("4 통과");
		if(year % 100 != 0) System.out.println("100 통과");
		if(year % 4 == 0 && year % 100 != 0) System.out.println("4, 100 통과");
		
	}
	

}
