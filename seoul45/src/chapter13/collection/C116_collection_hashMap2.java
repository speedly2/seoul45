package chapter13.collection;

import java.util.HashMap;

class Human {
	int age;
	String name;
	
	Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return name.length() + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Human) {
			Human other = (Human) obj;
			return (age == other.age && name.equals(other.name));
		} else {
			return false;
		}
	}
}
public class C116_collection_hashMap2 {

	public static void main(String[] args) {
		HashMap<Human, Integer> donate = new HashMap<Human, Integer>();
		donate.put(new Human(42, "김기남"), 10000);
		donate.put(new Human(24, "박수빈"), 20000);
		donate.put(new Human(20, "박수현"), 5000);
		donate.put(new Human(11, "최상미"), 8000);

		Human park = new Human(20, "박수현");
		System.out.println(park.name + "씨의 기부금 = " + donate.get(park));
		
		// null 이유 => 해쉬맵에 저장된 Human(20, 박수현) 객체와 park 객체의 주소가 다르다
		// equals & hashcode를 재정의 해주므로써 동일 객체 비교
	}

}
