package chapter07.array;

import java.util.Arrays;

public class C048_arrayCopy2 {

	public static void main(String[] args) {
		int[] sunny1 = new int[]{1, 2, 3, 4, 5};
		int newLength = 10;

		// System 클래스의 arraycopy() 메소드
		// System.arraycopy(복사할 배열, 복사할 첫 위치, 대상 배열, 붙여 넣을 첫 위치, 복사할 요소 개수)	
		int[] sunny2 = new int[newLength];
		System.arraycopy(sunny1, 0, sunny2, 0, sunny1.length);
		// 1 2 3 4 5 0 0 0 0 0 
		for (int i = 0; i < sunny2.length; i++) {
			System.out.print(sunny2[i]+" ");			
		}
		System.out.println();
		
		sunny1 = new int[]{5, 4, 3, 2, 1};
		// Array 클래스의 copyOf() 메소드
		// Arrays.copyOf(원본배열, 원본 배열에서 복사해올 길이)
		int[] sunny3 = Arrays.copyOf(sunny1, newLength);
		// 1 2 3 4 5 0 0 0 0 0 
		for (int i = 0; i < sunny3.length; i++) {
			System.out.print(sunny3[i]+" ");			
		}
		System.out.println();

		// Object 클래스의 clone 메소드
		int[] sunny4 = (int[])sunny1.clone();
		// 1 2 3 4 5
		for (int i = 0; i < sunny4.length; i++) {
			System.out.print(sunny4[i]+" ");			
		}
		System.out.println();

		// for문과 인덱스를 이용한 복사
		int[] sunny5 = new int[newLength];
		for(int i = 0; i < sunny1.length; i++) {
		    sunny5[i] = sunny1[i];
		}
		for (int j = 0; j < sunny5.length; j++) {
			System.out.print(sunny5[j]+" ");			
		}
		// 1 2 3 4 5 0 0 0 0 0 
	}

}
