package chapter08.inheritance;

class Human2 {
	int age;
	String name;
	
	Human2(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	void intro() {
		System.out.println("안녕, " + age + "살 " + name + "이라고 해.");
	}
}

class Student2 extends Human2 {
	int stnum;
	String major;
	
	Student2(int age, String name, int stnum, String major) {
		super(age, name);
		this.stnum = stnum;
		this.major = major;
	}
	
	@Override
	void intro() {
		System.out.println(major + "학과 " + stnum + "학번 " + name + "입니다.");
	}
	
	void study() {
		System.out.println("하늘천 따지 검을현 누를황");
	}
}

public class C074_overriding2 {

	public static void main(String[] args) {
		Human2 kim = new Human2(29, "김상형");
		kim.intro();
		Student2 lee = new Student2(42, "이승우", 9312345, "경영");
		lee.intro();
		lee.study();
	}

}
