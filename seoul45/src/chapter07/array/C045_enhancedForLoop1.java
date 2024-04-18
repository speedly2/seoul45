package chapter07.array;

public class C045_enhancedForLoop1 {

	public static void main(String[] args) {
		// foreach
		int[] score = { 88, 94, 72, 75, 23 };
		int sum = 0;
		for (int s : score) {
			sum += s;
		}
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + (float)sum/score.length);

		// foreach는 읽기 전용 반복문
		// 요소 s는 배열 요소의 사본일 뿐 원본에 영향을 주지 않는다
		int[] score2 = { 88, 94, 72, 75, 23 };
		for (int s : score2) {
			s++;
		}
		System.out.println("score[0] = " + score2[0]);
		
	}

}
