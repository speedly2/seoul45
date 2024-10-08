package chapter13.collection;

import java.util.ArrayList;
import java.util.Collections;

public class C112_collection_linkedList2 {

	public static void main(String[] args) {
		ArrayList<String> arName = new ArrayList<String>(); 
		arName.add("장보고");
		arName.add("김유신"); 
		arName.add("강감찬"); 
		arName.add("을지문덕"); 
		
		for(String name : arName) {
			System.out.print(name + " ");
		}
		
		System.out.println();
		// 정렬
//		Collections.sort(arName);
		// 역순정렬
//		Collections.reverse(arName);
		// 무작위
		Collections.shuffle(arName);
		
		for(String name : arName) {
			System.out.print(name + " ");
		}
	}

}
