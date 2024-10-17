package chapter03.condition;

import java.time.Year;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class If_Example05 {

	public static void main(String[] args) {
/*
		연수가 4로 나누어 떨어지면서 
		연수가 100으로는 나누어 떨어지지 않거나 
		연수가 400으로 나누어 떨어지는 해 = 윤년
 */
/*
		윤년 구하기
		연도를 입력받고 입력받은 연도가 평년인지 윤년인지를 출력한다.
		1. 연수가 4로 나누어 떨어지는 해는 윤년
		2. 연수가 100으로 나누어 떨어지는 해는 평년
		3. 연수가 400으로 나누어 떨어지는 해는 윤년
		 * 4년마다 오고 100년마다는 아니지만 400년마다는 윤년이 된다

		출력 결과 :
			연도: 2024
			윤년
 */
		Scanner scan = new Scanner(System.in);
		System.out.print("연도: ");
		int year = scan.nextInt();
		String result = "평년";
		
//		if( year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) )
//			result = "윤년";
		
		// 논리 연산자 우선순위가  &&가 ||보다 높음
		// year % 4 == 0 && year % 100 != 0 || year % 400 == 0
		// 그래서 이 식과 어차피 결과는 같음
		
		if( year % 4 == 0 && year % 100 != 0 || year % 400 == 0 )
			result = "윤년";
//		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
		
		System.out.println(result);
		
		// Year 클래스의 isLeap() 메소드를 사용하여 윤년 여부 확인
		// & 3 => 비트연산자를 사용하여 연도를 2진수로 변환한 후, 
		// 하위 2비트를 확인하는 방식으로 4로 나누어떨어지는지 확인하는 방법
		// 연도가 4의 배수인지를 확인하는 비트 연산
        boolean isLeap = Year.isLeap(year);
        if (isLeap) {
            System.out.println(year + "년은 윤년입니다.");
        } else {
            System.out.println(year + "년은 평년입니다.");
        }
		
		
		// 1586년인가 이후 부터의 연도에 대해서 계산결과 동일(그레고리력)
		GregorianCalendar gc = new GregorianCalendar();
		String result2 = gc.isLeapYear(year) ? "윤년" : "평년";
		System.out.println(result2);
	}

}
