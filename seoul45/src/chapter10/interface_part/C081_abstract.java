package chapter10.interface_part;

public class C081_abstract {

	public static void main(String[] args) {
/*
		추상클래스 
		1. 추상메서드를 가지고 있는 클래스는 abstract 예약어를 붙여서 사용한다.
		2. 추상클래스는 객체를 생성할 수 없다. (미완성된 클래스이므로, 구현부가 없으므로)
		3. 상속을 통해서만 사용한다. (추상클래스는 상속을 하기 위해 만들어진 클래스)
		4. 추상메서드가 있는 추상클래스를 상속받는 클래스는 "반드시" 추상메서드를 Override해야한다.
		
		인터페이스는 implements 라는 키워드처럼 인터페이스에 정의된 메소드를 각 클래스의 목적에 맞게 기능을 구현하는 느낌이고,
		추상 클래스는 extends 키워드를 사용해서 자신의 기능들을 하위 클래스로 확장 시키는 느낌
 */

		Animal a = new Human("사람");
		Animal b = new Tiger("호랑이");
		Animal c = new Eagle("독수리");
		
		a.alive();
		a.move();
		b.move();
		c.move();
	}
}

abstract class Animal {
/*
	추상 클래스도 일반 클래스와 마찬가지로 필드, 생성자, 메소드 선언이 가능. 
	new 연산자로 직접 생성자를 호출할 수는 없지만 자식 객체가 생성될 때 
	super(…)를 호출해서 추상 클래스 객체를 생성하므로 추상 클래스도 생성자가 반드시 있어야 한다.
 */
	// 멤버 변수
	String name;
	Animal(String name) {
		this.name = name;
	}
	// 멤버 메서드
	void alive() {
		System.out.println("생물");
	}
	// 추상 메서드
	abstract void move();
}

class Human extends Animal {
	Human(String name) {
		super(name);
	}

	@Override
	void move() {
		System.out.println("두발로 걷다");
	};
}

class Tiger extends Animal {
	Tiger(String name) {
		super(name);
	}

	@Override
	void move() {
		System.out.println("네발로 뛰다");
	};
}

class Eagle extends Animal {
	Eagle(String name) {
		super(name);
	}

	@Override
	void move() {
		System.out.println("날다");
	};
}