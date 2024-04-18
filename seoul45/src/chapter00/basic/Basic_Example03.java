package chapter00.basic;

public class Basic_Example03 {

	public static void main(String[] args) {
/*		
		변수의 교환
		출력 결과 :
			x = 200;
			y = 100;
*/		
		int x = 100;
		int y = 200;
		
		System.out.println("교환 전");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		// 어떤 처리
		// = 변수를 통해서 값 교환
		int z;
		z = x;
		x = y;
		y = z;
		
		System.out.println("교환 후");
		System.out.println("x = " + x);
		System.out.println("y = " + y);

	}

}
