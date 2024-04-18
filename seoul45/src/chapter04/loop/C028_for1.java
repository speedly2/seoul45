package chapter04.loop;

public class C028_for1 {

	public static void main(String[] args) {
		// for
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "번 학생 성적 처리");
		}
		
		// 1~100 합
		int sum = 0;
		for (int i = 1; i <= 100; i++){
			sum = sum + i;
		}
		System.out.println("합계1 = " + sum);
		
		// 짝수 합
		int sum2 = 0;
		for (int i = 1; i <= 100; i = i + 2){
			sum2 = sum2 + i;
		}
		System.out.println("합계2 = " + sum2);
	}

}
