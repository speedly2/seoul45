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
		this.stnum = stnum;
		this.major = major;
	}
	
	void study() {
		System.out.println("하늘천 따지 검을현 누를황");
	}
}

//class Graduate extends Student {
//	String thesis;
//	
//	Graduate(int age, String name, int stnum, String major, String thesis) {
//		super(age, name, stnum, major);
//		this.thesis = thesis;
//	}
//	
//	void research() {
//		System.out.println("궁시렁 궁시렁. 뭘 연구해야 떼돈을 벌까?");
//	}
//}

public class C071_inheritance {

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
