package chapter13.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Person {

	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
}

public class Comparator_Example {

	public static void main(String[] args) {
/*
	두 매개변수 객체를 비교
 */
		List<Person> list = new ArrayList<>();
		list.add(new Person("홍길동", 30));
		list.add(new Person("강감찬", 80));
		list.add(new Person("이순신", 45));
		
		// 정렬의 기준을 파라미터로
		Collections.sort(list, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.name.compareTo(p2.name);	// 역순 * -1
			}
		});
		
		for (Person p : list) {
			System.out.println(p);
		}
		
		System.out.println("===============");
		Set<Person> set = new TreeSet<>(new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.name.compareTo(p2.name);	// 역순 * -1
			}
		});
		set.add(new Person("홍길동", 30));
		set.add(new Person("강감찬", 80));
		set.add(new Person("이순신", 45));
		
		set.stream().forEach(System.out::println);
	}

}
