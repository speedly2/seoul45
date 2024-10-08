package chapter04.loop;

public class C037_continue {

	public static void main(String[] args) {
		// continue
		for(int i = 1; i <= 10; i++) {
			if(i == 7) 
				continue;
			System.out.println("반복회차: " + i);
		}
		
		int sum = 0;
		for (int i = 1; i <= 100; i += 2) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		int sum2 = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) 
				continue;
			sum2 += i;
		}
		System.out.println(sum2);
		
		int num3 = 1;
		int sum3 = 0;
		while (num3 <= 100) {
			sum3 = sum3 + num3;
			num3 += 2;
		}
		System.out.println(sum3);
		
		int num4 = 1;
		int sum4 = 0;
		do {
			sum4 = sum4 + num4;
			num4 += 2;
		} while(num4 <= 100);
		System.out.println(sum4);
	}

}
