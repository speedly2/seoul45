package chapter13.collection;

import java.util.ArrayList;

record Student(String name, int stdNum) { }

public class C110_collection_arrayList3 {

	public static void main(String[] args) {
		ArrayList<Student> stList = new ArrayList<>();
		stList.add(new Student("홍길동", 20241001));
		stList.add(new Student("이순신", 20241002));
		stList.add(new Student("강감찬", 20241003));
		
		for (int i = 0; i < stList.size(); i++) {
			String result = String.format("이름: %s, 학번: %d", stList.get(i).name(), stList.get(i).stdNum());
			System.out.println(result);
		}
		
		for (Student s : stList) {
			System.out.println(s);
		}
	}

}
