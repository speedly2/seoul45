package chapter06.class_part1;

public class C065_accessor1 {

	int value;
	
	public static void main(String[] args) {
		C065_accessor1 instance = new C065_accessor1();
		instance.value = 100;
		System.out.println(instance.value);
		
//		instance.value2;	// err
		int value2 = instance.method();
		System.out.println(value2);
		
		instance.setValue2(1000);
		value2 = instance.getValue2();
		System.out.println(value2);
	}
	
/*
	접근지정자
	클래스, 메서드, 변수 등에 대한 접근 범위를 지정하여 외부로부터의 접근을 제어
		- public	: 
			클래스 	 = 같은 클래스, 같은 패키지, 다른 패키지에서 모두 접근 가능
			메서드/변수	 = 같은 클래스, 같은 패키지, 다른 패키지의 모든 클래스에서 접근 가능
		- protected : 
			클래스	 = 클래스에는 사용할 수 없음.
			메서드/변수	 = 같은 클래스, 같은 패키지, 상속관계(다른 패키지의 하위 클래스에서 접근 가능)의 클래스에서만 접근 가능
		- default	: 
			클래스	 = (아무 접근 지정자를 명시하지 않을 경우)
			메서드/변수	 = 같은 클래스와 같은 패키지에서만 접근 가능
		- private	: 
			클래스	 = 클래스에는 사용할 수 없음
			메서드/변수	 = 같은 클래스에서만 접근 가능
 */
	
	private int value2;
	
	public int method() {
		return value2;
	}
	
	
	// encapsulation 에서 설명할 것(getter/setter)

	// getter
	public int getValue2() {
		return value2;
	}

	// setter
	public void setValue2(int value2) {
		this.value2 = value2;
	}

}
