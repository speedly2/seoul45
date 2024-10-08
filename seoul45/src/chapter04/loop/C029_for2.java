package chapter04.loop;

public class C029_for2 {

	public static void main(String[] args) {
		// 제어변수 활용
		for (int i = 0, j = 1; i < 5; i++, j = j + 2){
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
	}

}
