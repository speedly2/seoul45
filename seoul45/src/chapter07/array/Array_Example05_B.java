package chapter07.array;

import java.util.Scanner;
import java.util.TreeSet;

public class Array_Example05_B {

	public static void main(String[] args) {
/*
		Collection 사용
 */
		Scanner scan = new Scanner(System.in);						//입력받기 위한 Scanner 객체 생성
		System.out.print("받고 싶은 행운번호의 개수를 입력해주세요: ");
		int num = scan.nextInt();									//입력받은 숫자를 저장
		int cnt = 1;												//코드 실행의 카운트값
		System.out.println("================================");
		
		while(cnt <= num) {											//1부터 받고 싶은 행운번호의 개수만큼을 반복
			TreeSet<Integer> ts = new TreeSet<>();					//TreeSet객체 생성
			
			for (int i = 0; ts.size() < 6; i++) {
				ts.add((int)(Math.random()*45 + 1));				//Math.random()을 통해 1~45 사이의 난수 생성
			}	
			
			//배열의 각 요소를 출력
			System.out.print(" *오늘의 행운번호["+cnt+"]: ");
			for (Integer number : ts) {
				System.out.print(number + " ");
			}
			System.out.println();
			cnt++;
		}
	}

}
