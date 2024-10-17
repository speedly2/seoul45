package chapter02.operator;

import java.util.Scanner;

public class Oper_Example01 {

	public static void main(String[] args) {
/*
		상품가격과 받은 금액을 입력받아서 거스름돈을 출력
		출력결과 :
			받은 금액 : 10000
			상품가격 : 1500
			거스름돈 : 8500
*/
		Scanner sc = new Scanner(System.in);
		
		//받은금액
		int cash = 0;
		//상품가격
		int price = 0;
		//거스름돈
		int change = 0;
		
		System.out.print("받은 금액 : ");
		cash = sc.nextInt();
		System.out.print("상품가격 : ");
		price = sc.nextInt();
		change = cash - price;
		System.out.print("거스름돈 : " + change);
		sc.close();

	}

}
