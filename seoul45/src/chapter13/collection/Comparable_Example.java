package chapter13.collection;

import java.util.Set;
import java.util.TreeSet;

class Member implements Comparable<Member>{

	String name;
	int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Member m) {
		return (this.name.compareTo(m.name));	// 역순 * -1
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
	
}

public class Comparable_Example {

	public static void main(String[] args) {
/*
	자신과 매개변수 객체를 비교
 */
		Set<Member> set = new TreeSet<>();
		set.add(new Member("홍길동", 20));
		set.add(new Member("강감찬", 50));
		set.add(new Member("이순신", 35));
		
		for (Member m : set) {
			System.out.println(m);
		}
	}

}
