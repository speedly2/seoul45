package chapter02.operator;

import java.util.Scanner;

public class C016_Operator4 {

	public static void main(String[] args) {
		// 삼항 연산자 & 조건 연산자
		// 조건식 ? 결과1 : 결과2 
		// 1
		int fatherAge = 45;
		int motherAge = 47;
		
		String ch = ((fatherAge > motherAge) ? "아빠가 연상" : "엄마가 연상");
		
		System.out.println(ch);
		
		// 2
		Scanner scan = new Scanner(System.in);
		System.out.print("father's age: ");
		int fathersAge = scan.nextInt();
		System.out.print("mother's age: ");
		int mothersAge = scan.nextInt();
		
		String result = ((fathersAge > mothersAge) ? "아빠가 연상" : "엄마가 연상");
		System.out.println(result);

	}

}
