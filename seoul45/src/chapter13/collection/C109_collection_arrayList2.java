package chapter13.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class C109_collection_arrayList2 {

	public static void main(String[] args) {
		// 초기값을 리스트 컬렉션으로 생성 후 리턴
		ArrayList<Integer> arNum =  new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		ArrayList<Integer> arNum2 =  new ArrayList<Integer>(Arrays.asList(4, 5, 2));
		
		// addAll - 합집합
		System.out.print("합집합 => ");
		ArrayList<Integer> arNumAdd = new ArrayList<Integer>(arNum); 
		arNumAdd.addAll(arNum2);
		for (Integer i : arNumAdd) {
			System.out.print(i + " ");
		}

		System.out.println();		
		// removeAll - 차집합
		System.out.print("차집합 => ");
		ArrayList<Integer> arNumRemove = new ArrayList<Integer>(arNum); 
		arNumRemove.removeAll(arNum2);
		for (Integer i : arNumRemove) {
			System.out.print(i + " ");
		}
		
		// retainAll - 교집합
		System.out.print("\n교집합 => ");	// 중복허용
		ArrayList<Integer> arNumRetain = new ArrayList<Integer>(arNum); 
		arNumRetain.retainAll(arNum2);
		for (Integer i : arNumRetain) {
			System.out.print(i + " ");
		}
		
		// containsAll - 부분집합
		System.out.print("\n부분집합 => ");
		ArrayList<Integer> arNumContain = new ArrayList<Integer>(arNum); 
		if (arNumContain.containsAll(arNum2)) {
			System.out.print("부분집합임");
		} else {
			System.out.print("부분집합이 아님");
		}
	}

}
