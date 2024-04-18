package chapter00.basic;

import java.util.Scanner;

public class C004_InputTest {

	public static void main(String[] args) {
		// 입력
		Scanner scan = new Scanner(System.in);
		
		System.out.print("byte: ");
		byte a = scan.nextByte();
		System.out.print("short: ");
		short b = scan.nextShort();
		System.out.print("int: ");
		int c = scan.nextInt();
		System.out.print("long: ");
		long d = scan.nextLong();
		System.out.print("float: ");
		float e = scan.nextFloat();
		System.out.print("double: ");
		double f = scan.nextDouble();
		
		System.out.print("String: ");
		String g = scan.next();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
		//NextInt가 숫자는 입력받고, 사용가가 입력한 개행문자(엔터)를 제거하지 않은 채 그대로 남겨둔다.
		//NextLine은 개행문자를 포함하여 입력을 받기 때문에 남겨진 개행문자를 입력받은 것으로 메소드를 종료.
		int h = scan.nextInt();
		String i = scan.nextLine();
		System.out.println(h);
		System.out.println(i);
	}
}
