package chapter06.class_part1;

class User {
	String name;
	int age;

/*
	생성자(constructor)
	- 클래스를 통해 생성되는 인스턴스의 초기화를 도와주는 메서드의 일종
	- 클래스 내에 선언되며, 클래스의 이름과 같으며, 리턴 값이 없다
	- 생성자도 오버로딩이 가능하므로 하나의 클래스에 여러 개의 생성자가 존재 가능

*/
	//기본 생성자
	User() {
		
	}
	
	//명시적 생성자
	User(String aName) {
		name = aName;
	}
	//생성자 오버로딩
	User(String aName, int aAge) {
		name = aName;
		age = aAge;
	}
	
	public void UserInfo() {
		System.out.println("이름: " + name + ", 나이: " + age);
	}
}

class User2 {
	String name;
	int age;
	
//	User2(String aName, int aAge) {
//		name = aName;
//		age = aAge;
//	}
	
	public void UserInfo() {
		System.out.println("이름: " + name + ", 나이: " + age);
	}
}

public class C062_constructor1 {

	public static void main(String[] args) {
		// 인스턴스1
		User user1 = new User();
		user1.UserInfo();
		
		// 인스턴스2
		User user2 = new User("홍길동");
		user2.age = 33;
		user2.UserInfo();

		// 인스턴스3
		User user3 = new User("이순신", 55);
		user3.UserInfo();
		
		System.out.println("=========");
		
		// 인스턴스4
		User2 user4 = new User2();
		user4.UserInfo();
		
//		User2 user5 = new User2("고길동", 74);
//		user4.UserInfo();
		
		
	}

}
