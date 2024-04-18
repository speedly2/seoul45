package chapter11.object;

import java.util.Random;

public class C096_random {

	public static void main(String[] args) {
		//Math의 random()
		for (int i = 0; i < 5; i++) {
			System.out.println(Math.random());
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println((int)(Math.random() * 12) + 1);
		}
		
		//Random
		Random R = new Random();
		for (int i = 0; i < 5; i++) {
			System.out.println(R.nextInt(10));
		}
		for (int i = 0; i < 5; i++) {
			System.out.print(getRandom(5, 10));
		}
		
	}

	static int getRandom(int a, int b) {
		return (int)(Math.random() * (b - a)) + a;
	}
}
