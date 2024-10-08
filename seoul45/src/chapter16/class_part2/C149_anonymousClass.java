package chapter16.class_part2;

class A {
	void method() {
		System.out.println("A1");
	}
}

interface B {
	void methodB();
}

abstract class C {
	abstract void methodC();
}

public class C149_anonymousClass {

	public static void main(String[] args) {
		A a = new A();
		a.method();
		
		//익명클래스 생성
		// new 조상클래스 이름 {}
		new Object() {
			void method() {
				System.out.println("A2");
			}
		}.method();
		
		// new 구현하는 인터페이스 이름 {}
		new B() {
			@Override
			public void methodB() {
				System.out.println("B");
			}
		}.methodB();
		
		new C() {
			@Override
			void methodC() {
				System.out.println("C");
			}
		}.methodC();

	}

}
