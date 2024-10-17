package chapter04.loop;

public class C037_continue {

	public static void main(String[] args) {
		// continue
		for(int i = 1; i <= 10; i++) {
			if(i == 7) 
				continue;
			System.out.println("반복회차: " + i);
		}
		
		// 짝수의 합 구하기
		int sum = 0;
		for (int i = 0; i <= 100; i += 2) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		int sum2 = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 != 0) 
				continue;
			sum2 += i;
		}
		System.out.println(sum2);
		
		int num = 0;
		int sum3 = 0;
		while (num <= 100) {
			if (num % 2 == 0) {
                sum3 += num;
            }
            num++;
		}
		System.out.println(sum3);
		
		int num2 = 0;
		int sum4 = 0;
		do {
            sum4 += num2;
            num2 += 2;
        } while (num2 <= 100);
		System.out.println(sum4);
	}

}
