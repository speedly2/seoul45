package chapter07.array;

import java.util.Scanner;

public class Array_Example03 {

	public static void main(String[] args) {
/*
		문제
			서로 다른 무작위의 숫자(0~9) 10개가 들어있는 int형 배열을 만든 뒤, 
			사용자에게 10이하의 자연수 2개를 입력받고,
			해당하는 인덱스에 있는 배열의 원소를 교환하고 출력하시오.
		출력결과
			변경 전 : 2 5 5 1 3 4 3 6 2 2 
			변경하고 싶은 위치 : 1
			변경할 위치 : 2
			변경 후 : 5 2 5 1 3 4 3 6 2 2 
*/

		Scanner scan = new Scanner(System.in);
		int arr[] = new int[10];
		
		System.out.print("변경 전 : ");
		for (int i = 0; i < 10; i++) {
			int random = (int)(Math.random()*10);
			arr[i] = random;
			System.out.print(arr[i] + " ");
		}
		
		System.out.print("\n변경하고 싶은 위치 : ");
		int spot = scan.nextInt();
		System.out.print("변경할 위치 : ");
		int target = scan.nextInt();
		int temp;
		
		temp = arr[spot-1]; 
		arr[spot-1] = arr[target-1];
		arr[target-1] = temp;
		
		System.out.print("\n변경 후 : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
