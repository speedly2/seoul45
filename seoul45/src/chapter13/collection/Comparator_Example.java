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

//Comparator 정의 부 = Comparator<? super E>
// 제공되는 타입 E가 Integer 면 Number, Object.. 들을 허용
// Comparator가 특정 타입과 그 상위 타입 모두를 비교할 수 있는 유연성을 제공
// Person 객체를 비교하기 위한 클래스 정의
class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        // 이름을 기준으로 비교, 역순 정렬 * -1
        return p1.name.compareTo(p2.name);
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
		
		Collections.sort(list, new PersonNameComparator());
		
		// 정렬의 기준을 파라미터로
//		Collections.sort(list, new Comparator<Person>() {
//			@Override
//			public int compare(Person p1, Person p2) {
//				return p1.name.compareTo(p2.name);	// 역순 * -1
//			}
//		});
		
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
		
		System.out.println("===============");
		Set<Person> set2 = new TreeSet<>(new PersonAgeComparator());
		set2.add(new Person("홍길동", 30));
		set2.add(new Person("강감찬", 80));
		set2.add(new Person("이순신", 45));
		set2.stream().forEach(System.out::println);
	}

}

//나이를 기준으로 비교하는 Comparator
class PersonAgeComparator implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {
	    // 나이를 기준으로 비교 (오름차순 정렬)
	    return Integer.compare(p1.age, p2.age);
	}
}
//나이를 기준으로 내림차순 정렬하는 Comparator
class PersonAgeComparatorDescending implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {
	    // 나이를 기준으로 비교 (내림차순 정렬)
	    return Integer.compare(p2.age, p1.age);
	}
}
