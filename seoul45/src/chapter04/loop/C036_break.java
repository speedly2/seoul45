package chapter04.loop;

public class C036_break {

	public static void main(String[] args) {
		// break
		for(int i = 1; i <= 10; i++) {
			if(i == 7) 
				break;
			System.out.println("반복회차: " + i);
		}
		
		System.out.println();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i == 3 && j == 3)
					break;
				System.out.print("0 ");
			}
			System.out.println();
		}
		
		System.out.println();
		// exit label
		// 자바에서 특정 반복문이나 블록에 이름을 붙이는 방식
		loop:	//레이블(label)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i == 3 && j == 3)
					break loop;
				System.out.print("0 ");
			}
			System.out.println();
		}
		
		
	}

}
