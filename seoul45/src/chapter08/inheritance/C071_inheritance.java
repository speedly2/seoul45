package chapter08.inheritance;

class A {
	String name;
	private int age;
	
	public void method() {
		System.out.println(name +  " 메서드 출력");
	}
}

class B extends A {

	@Override
	public void method() {
		System.out.println(name + " 메서드 출력");
//		System.out.println(age);	// err
	}
}

public class C071_inheritance {
	
/*
	<< 상속 >>

	각자의 객체를 만들어 객체들끼리 접근하고 연결을 지을 뿐 아니라
	공통점을 가지고 있는 객체들끼리 어떤 관계를 나타내기 위함
	
		상속은 부모가 자식에게 물려주는 행위다.
		객체 지향 프로그램에서도 부모(상위) 클래스의 멤버를 
		자식(하위) 클래스에 물려주어 자식 클래스가 갖고 있는 것처럼 사용할 수 있다.
	
	IS-A 관계(is a relationship, inheritance)는 일반적인 개념과 구체적인 개념의 관계입니다.
	즉, 일반 클래스를 구체화 하는 상황에서 상속을 사용합니다.
 */

	public static void main(String[] args) {
		A a = new A();
		a.name = "홍길동";
		a.method();
		
		B b = new B();
		b.name = "이순신";
		b.method();
		
	}

}
