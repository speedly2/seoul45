package chapter04.loop;

public class C030_for3 {

	public static void main(String[] args) {
		// over 100
		int sum = 0;
		int i;
		for (i = 1; i < 100; i++) {
			sum = sum + i;
			if (sum > 100) break;
		}
		
		System.out.println("합계가 100이 넘는 시점은 " + i + "입니다.");

	}

}
