package chapter07.array;

import java.util.Random;

public class Array_Example_Random {

	public static void main(String[] args) {
		//난수를 발생하는 두가지 방법
		
		//Math클래스의 random메소드를 호출 1 ~ 10
		double num = Math.random();
		int num2 = (int)(Math.random()*10+1);
		System.out.println(num);
		System.out.println(num2);
		
		//Random클래스의 객체를 생성하여 난수발생 0 ~ 9
		Random r = new Random();
		int j = r.nextInt(100);
		int k = r.nextInt();
		System.out.println(j);
	}

}
