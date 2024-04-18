package chapter03.condition;

import java.util.Scanner;

public class Switch_Example01 {

	public static void main(String[] args) {
/*
		출생연도를 입력받아 띠를 출력한다.
		띠는 12개이며, 연도를 12로 나누었을때의 나머지값에 따라 아래와 같이 구분된다.
			원숭이	0
			닭		1
			개		2
			돼지		3
			쥐		4
			소		5
			호랑이	6
			토끼		7
			용		8
			뱀		9
			말	    10
			양		11 
		출력 결과 :
			연도를 입력하세요: 2001
			2001년생은 뱀띠입니다.
 */
		Scanner scan = new Scanner(System.in);
		System.out.print("연도를 입력하세요: ");
		int year = scan.nextInt();
		String result = switch (year % 12) {		
			case 0	->	result = "원숭이";
			case 1  ->	result = "닭";
			case 2  ->	result = "개";
			case 3  ->	result = "돼지";
			case 4  ->	result = "쥐";
			case 5  ->	result = "소";
			case 6  ->	result = "호랑이";
			case 7  ->	result = "토끼";
			case 8  ->	result = "용";
			case 9  ->	result = "뱀";
			case 10 ->	result = "말";
			case 11 ->	result = "양";
			default -> "aa";
		};
		
		System.out.println(year + "년생은 " + result +"띠입니다.");

	}

}
