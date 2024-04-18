package chapter13.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class C114_collection_treeSet {

	public static void main(String[] args) {
		// 저장될때부터 이진트리를 이용하여 검색속도 극대화 + 정렬
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(3);
		ts.add(2);
		ts.add(5);
		ts.add(1);
		ts.add(4);
		ts.add(2);
		
		Iterator<Integer> it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// TreeSet을 이용한 로또
		TreeSet<Integer> lotto = new TreeSet<>();
		for (int i = 0; lotto.size() < 6; i++) {
			lotto.add((int) (Math.random()*45 + 1));			
		}
		for (Integer n : lotto) {
			System.out.print(n + " ");
		}
	}

}
