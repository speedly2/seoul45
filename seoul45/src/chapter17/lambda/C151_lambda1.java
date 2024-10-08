package chapter17.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class C151_lambda1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("bbb");
		list.add("aaa");
		list.add("ccc");
		
		Collections.sort(list);
		for (String s : list) {
			System.out.print(s + " ");
		}
		
		System.out.println("\n=====");
		//익명객체
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
		for (String s : list) {
			System.out.print(s + " ");
		}
		
		System.out.println("\n=====");
		//람다식 (역순)
		Collections.sort(list, (s1, s2) -> s1.compareTo(s2) * -1);
		
		for (String s : list) {
			System.out.print(s + " ");
		}
	}

}
