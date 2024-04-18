package chapter13.collection;

import java.util.ArrayList;
import java.util.List;

public class C108_collection_arrayList1 {

	public static void main(String[] args) {
		// List <- ArrayList
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2, 5);	// Index 2에 5의 값을 추가
		for (Integer i : list) {
			System.out.print(i + " ");
		}
		list.remove(0);	// Index 0 값 제거
		System.out.println();
		for (Integer i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("get(index): " + list.get(1));	// Index 1 값 리턴
		System.out.println("size(): " + list.size());	// list의 사이즈 리턴
		
	}

}
