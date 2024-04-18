package chapter13.collection;

import java.util.HashMap;

public class C115_collection_hashMap1 {

	public static void main(String[] args) {
		HashMap<String,Integer> Snack = new HashMap<String,Integer>();
		Snack.put("오징어 땅콩", 2500);
		Snack.put("죠리퐁", 1900);
		Snack.put("핫브레이크", 450);
		Snack.put("빼빼로", 900);
		
		String MySnack = "죠리퐁";
		System.out.println(MySnack + "의 가격은 " + Snack.get(MySnack));
	}

}
