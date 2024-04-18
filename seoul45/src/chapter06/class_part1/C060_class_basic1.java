package chapter06.class_part1;

class Car {
	
	// 멤버 변수
	String name;
	boolean gasoline;
	
	// 멤버 메서드
	void run() {
		if (gasoline) {
			System.out.println("부릉 부릉");
		} else {
			System.out.println("덜컹 덜컹");
		}
	}
	void stop() {
		System.out.println("끼이익");
	}
}

// 소스파일의 파일명과 public 클래스명이 일치해야 한다.
public class C060_class_basic1 {

	public static void main(String[] args) {
		Car korando = new Car();
		korando.name = "코란도C";
		korando.gasoline = false;
		System.out.print(korando.name + " : ");
		korando.run();
		
		Car equus = new Car();
		equus.name = "에꿍스";
		equus.gasoline = true;
		System.out.print(equus.name + " : ");
		equus.run();
	}

}
