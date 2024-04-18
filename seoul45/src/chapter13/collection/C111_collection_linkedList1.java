package chapter13.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class C111_collection_linkedList1 {

	public static void main(String[] args) {
		LinkedList<String> arName = new LinkedList<String>();
		arName.add("전두환");
		arName.add("김영삼");
		arName.add("김대중");
		arName.add(1,"노태우");
		arName.remove("노태우");

		for (String s : arName) {
			System.out.println(s);
		}
		
		// Iterator 반복자
		System.out.println("========");
		Iterator<String> it = arName.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// Iterator 반복자 -역순
		System.out.println("========");
		ListIterator<String> it2 = arName.listIterator(arName.size());
		while (it2.hasPrevious()) {
			System.out.println(it2.previous());
		}
	}

}
