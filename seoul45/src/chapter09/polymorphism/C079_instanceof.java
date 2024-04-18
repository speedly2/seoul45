package chapter09.polymorphism;

class Dog extends Animal {
	void bark() { System.out.println("멍멍멍"); }
}

class Dove extends Animal {
	void fly() { System.out.println("퍼득 퍼득"); }
}

public class C079_instanceof {

	public static void main(String[] args) {
		Dog happy = new Dog();
		testAnimal(happy);

		Dove donald = new Dove();
		testAnimal(donald);
		
		System.out.println(happy  instanceof Animal);
		System.out.println(happy  instanceof Dog);
		System.out.println(donald instanceof Animal);
		System.out.println(donald instanceof Dove);
	}

	static void testAnimal(Animal animal) {
		// ↑ 메서드의 파라미터를 일일이 오버로딩으로 만들어 두기엔 비효율이다.
		// 그래서 다형성을 이용하여 Animal이라는 타입으로 파라미터를 처리한다. 
//		Dog mydog = (Dog)animal;
//		mydog.bark();
		animal.move();
		// 형변환
		if (animal instanceof Dog) {
			Dog mydog = (Dog)animal;
			mydog.bark();
		}
		if (animal instanceof Dove) {
			Dove mydove = (Dove)animal;
			mydove.fly();
		}
		// 패턴 매칭(변수 instanceof 타입 캐스팅변수)
//		if (animal instanceof Dog mydog) {
//			mydog.bark();
//		}
//		if (animal instanceof Dove mydove) {
//			mydove.fly();
//		}
	}
}
