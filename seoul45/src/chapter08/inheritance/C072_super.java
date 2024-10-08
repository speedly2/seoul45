package chapter08.inheritance;

class Human {
	int age;
	String name;
	
	Human(int age, String name) {
		System.out.println("== Human 생성자 ==");
		this.age = age;
		this.name = name;
	}
	
	void intro() {
		System.out.println("안녕, " + age + "살 " + name + "이라고 해.");
	}
}

class Student extends Human {
	int stnum;
	String major;
	
	Student(int age, String name, int stnum, String major) {
		super(age, name);
		System.out.println("== Student 생성자 ==");
		this.stnum = stnum;
		this.major = major;
	}
	
	void study() {
		System.out.println("이름: " + super.name + ", 학번: " + stnum + ", 전공: " + major);
	}
}

//class Graduate extends Student {	// Graduate Student 대학원생
//	String thesis;	// 논문
//	
//	Graduate(int age, String name, int stnum, String major, String thesis) {
//		super(age, name, stnum, major);
//		System.out.println("== Graduate 생성자 ==");
//		this.thesis = thesis;
//	}
//	
//	void research() {
//		System.out.println("논문: " + thesis + ", 저자: " + super.name);
//	}
//}

public class C072_super {

	public static void main(String[] args) {
		Human kim = new Human(29, "김상형");
		kim.intro();
		Student lee = new Student(42, "이승우", 9312345, "경영");
		lee.intro();
		lee.study();
		
//		Graduate park = new Graduate(35, "박대희", 95001122, "전산", "웹 보안에 대한 연구");
//		park.intro();
//		park.study();
//		park.research();

	}

}
