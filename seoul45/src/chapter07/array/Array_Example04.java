package chapter07.array;

import java.util.Arrays;
import java.util.Collections;

public class Array_Example04 {

	public static void main(String[] args) {
/*
		임의의 배열 array를 역순으로 출력하시오.
		출력 결과:
			원래 배열 -> 브레드 윌크 초코 소세지 치즈
			역순 배열 -> 치즈 소세지 초코 윌크 브레드
*/
		
		String array[] = {"브레드", "윌크", "초코", "소세지", "치즈"};
		
		System.out.println(array.length);
		System.out.print("원래 배열 : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		// arr[0] arr[1] arr[2] arr[3] arr[4]
		
		System.out.print("\n역순 배열 : ");
		for (int j = array.length - 1; j >= 0; j--) {
			System.out.print(array[j] + " ");
		}
		// arr[4] arr[3] arr[2] arr[1] arr[0]
		
		
		
		
		
		
		
		System.out.println();
		int[] arr = new int[] {1, 2, 3, 4, 5};
//		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		// 1. int 배열을 Integer 배열로 변환
        Integer[] integerArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        
        // 2. 배열을 역순으로 정렬
        Arrays.sort(integerArray, Collections.reverseOrder());
        
        System.out.println();
        // 3. 배열을 출력
        for (int num : integerArray) {
            System.out.print(num + " ");
        }
	}

}
