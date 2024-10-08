package chapter08.inheritance;

public class C076_is_a {

	public static void main(String[] args) {
/*
		is a relation
		상속 관계, 다중 상속 X
		실체가 사람이므로 동물이라고 표현할 수 있다.
		클래스 간의 계층적 관계
 */
		Animal a = new Human3();	// 사람은 동물이다 O
//		Human3 b = new Animal();	// 동물은 사람이다 X, err
	}

}

class Animal {
	String name;
	
	void move() {
		System.out.println("움직이다");
	}
}

class Human3 extends Animal {
	String name;
	
	@Override
	void move() {
		System.out.println("걷다");
	}
}