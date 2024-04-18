package chapter07.array;

import java.util.Scanner;

public class Array_Example02 {

	public static void main(String[] args) {
/*
		문제
			원소 개수를 입력받아 배열을 생성하고 각 원소의 값을 입력받아 저장한 후, 
			전체 원소의 합계를 구하여 출력한다.
		조건
			배열 원소 개수는 2 이상의 정수로 입력받는다.
			2 미만의 값이 입력되면 오류 메시지를 출력하고 다시 입력받는다.
		출력결과
			배열의 크기 : 5
			arr[0] = 1
			arr[1] = 2
			arr[2] = 3
			arr[3] = 4
			arr[4] = 5
			1 + 2 + 3 + 4 + 5 = 15
*/
		
		Scanner scan = new Scanner(System.in);
		int size;
		
		while(true) {
			System.out.print("배열의 크기 : ");			
			size = scan.nextInt();
			if(size >= 2)
				break;
			else
				System.out.println("2 이상의 값을 입력하세요.");
		}
		
		int arr[] = new int[size];
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr["+i+"] = ");
			arr[i] = scan.nextInt();
			sum += arr[i];
		}
		
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]);
			if(j < arr.length - 1)
				System.out.print(" + ");
		}
		
		System.out.println(" = " + sum);
	
	}

}
