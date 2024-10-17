package chapter04.loop;

public class C030_for3 {

	public static void main(String[] args) {
		
/*
		* 지역변수 & 전역변수 (유효 범위(scope))
		지역 변수(Local Variable)
			- 각 테이블의 주문 (주문을 받아 서빙완료가 되면 사라짐)
			메서드, 생성자 또는 블록 내에서 선언되고, 그 범위(scope)는 해당 블록이 끝날 때까지
			메서드가 종료되면 메모리에서 사라짐
			명시적인 초기화가 필요
		
		전역 변수(멤버 변수 또는 인스턴스 변수, Global Variable)
			- 모든 테이블이 공유하는 메뉴판 (가게가 문을 닫기 전까지는 유효)
			클래스 내부에 선언되고, 클래스의 모든 메소드에서 접근
			객체가 존재하는 동안 계속 유지
			명시적으로 초기화하지 않으면 기본값으로 자동 초기화
 */		
		
		// 제어변수 활용
		for (int i = 0, j = 1; i < 5; i++, j = j + 2) {
			System.out.println("i = " + i + ", j = " + j);
		}
		
//		System.out.println(i);	//지역변수 err
		
		
		// 전역변수
		int globalVariable = 10;
		
		if (true) {
			System.out.println("IF문내 전역변수 출력: " + globalVariable);
			
			int localVariable = 100;
			System.out.println("IF문내 지역변수 출력: " + localVariable);
		}
		System.out.println("IF문밖 전역변수 출력: " + globalVariable);
//		System.out.println("IF문밖 지역변수 출력: " + localVariable);		//err
		

		
		
		// 지역변수 & 전역변수
		int a = 10;
		System.out.println("main에서 a 출력: " + a);
//		System.out.println(b);
		if (true) {
			int b = 10;
			System.out.println("if문에서 a 출력: " + a);
			System.out.println("if문에서 b 출력: " + b);
//			System.out.println(c);
			for (int c = 0; c < 1; c++) {
				System.out.println("for문에서 a 출력: " + a);
				System.out.println("for문에서 b 출력: " + b);
				System.out.println("for문에서 c 출력: " + c);
			}
		}
//		System.out.println(i);
	}

}
