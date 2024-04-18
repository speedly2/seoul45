package chapter07.array;

import java.util.Scanner;

public class Array_Example05_A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);						//입력받기 위한 Scanner 객체 생성
		System.out.print("받고 싶은 행운번호의 개수를 입력해주세요: ");
		int num = scan.nextInt();									//입력받은 숫자를 저장
		int cnt = 1;												//코드 실행의 카운트값
		System.out.println("================================");
		
		while(cnt <= num) {											//1부터 받고 싶은 행운번호의 개수만큼을 반복
			int lotto[] = new int[6];								//로또므로 번호 6개짜리 배열 생성
			
			//난수 6개 배열에 저장
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = (int)(Math.random()*45 + 1);				//Math.random()을 통해 1~45 사이의 난수 생성
				
				//중복제거
				for (int j = 0; j < i; j++) {
					if(lotto[i] == lotto[j]) {
						i--;					//이전과 중복된 값이 있다면 해당 배열의 방에 다시 새로운 숫자를 생성하여 저장
						break;
					}
				}
			}
			
			//정렬
			for (int i = 0; i < lotto.length; i++) {
				for (int j = i+1; j < lotto.length; j++) {
					if(lotto[i] > lotto[j]) {	//옆 방에 값과 비교해서 큰수를 오른쪽으로 이동
						int temp = lotto[j];
						lotto[j] = lotto[i];
						lotto[i] = temp;
					}
				}
			}
			
//			Arrays.sort(lotto);
			
			//배열의 각 요소를 출력
			System.out.print(" *오늘의 행운번호["+cnt+"]: ");
			for (int k = 0; k < lotto.length; k++) {
				System.out.print(lotto[k]+" ");			
			}
			System.out.println();
			cnt++;			//카운트값을 증가
		}
	}

}
