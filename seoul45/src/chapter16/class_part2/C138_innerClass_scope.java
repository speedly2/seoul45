package chapter16.class_part2;

class OuterClass {
	int a = 0;			//인스턴스 변수
	static int b = 0;	//정적 변수
	
	void method() {
		int c = 0;		//지역 변수
	}
}

class OuterClass2{
	class A {}			//인스턴스 내부 클래스
	static class B {}	//정적 내부 클래스
	
	void method() {
		class C {}		//지역 내부 클래스
	}
}

public class C138_innerClass_scope {

	public static void main(String[] args) {

	}

}
