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
		for(int i = 1; i <= 100; i++) {
			if(i % 2 != 0) 
				continue;
			sum += i;
		}
		System.out.println(sum);
	}

}
