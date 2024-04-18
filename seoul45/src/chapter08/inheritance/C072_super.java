package chapter08.inheritance;

import java.time.LocalDate;

class Human2 {
	int age;
	String name;

	Human2(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	Human2(float birth, String name) {
		this(0, name);		// 자기자신의 이름이므로 Human2()는 생성자가 된다
		LocalDate now = LocalDate.now();
		this.age = now.getYear() - (int)birth + 1;
	}
	
	void intro() {
		System.out.println("안녕, " + age + "살 " + name + "이라고 해.");
	}
}

class Student2 extends Human2 {
	int stnum;
	String major;
	
	Student2(int age, String name, int stnum, String major) {
		super(age, name);	// 부모의 이름이므로 Human2(age, name) 생성자를 가리킨다
		this.stnum = stnum;
		this.major = major;
	}
	
	Student2(float birth, String name, int stnum, String major) {
		super(birth, name);
		this.stnum = stnum;
		this.major = major;
	}

	void study() {
		System.out.println("하늘천 따지 검을현 누를황");
	}
}

public class C072_super {

	public static void main(String[] args) {
		Student2 kim = new Student2(39, "노정란", 9908123, "건축");
		kim.intro();
		Student2 bae = new Student2(1989.10f, "백지영", 1125034, "간호");
		bae.intro();

	}

}
