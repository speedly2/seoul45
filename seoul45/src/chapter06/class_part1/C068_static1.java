package chapter06.class_part1;

class Test1 {
	// 인스턴스 변수, 멤버 변수
	private String name1 = "홍길동";
	// 정적 멤버 변수
	public static final String name2 = "고길동";
	
	public void printName() {
		System.out.println(this.name1);
	}
}

public class C068_static1 {
	
/*
	하지만 위와 같은 클래스를 통해 100개의  객체를 생성하면, "홍길동"이라는 같은 값을 갖는 메모리가 100개나 중복해서
	생성되게 됩니다. 이러한 경우에 static을 사용하여 여러 객체가 하나의 메모리를 참조하도록 하면
	메모리 효율이 더욱 높아질 것입니다. 또한 "고길동"이라는 이름은 결코 변하지 않는 값이므로 final 키워드를 붙여주며,
	일반적으로 Static은 상수의 값을 갖는 경우가 많으므로 public으로 선언을 하여 사용합니다.
	이러한 이유로, 일반적으로 static 변수는 public 및 final과 함께 사용되어 public static final로 활용 됩니다.
*/    
	public static void main(String[] args) {
//		System.out.println(name1);		//에러
		//static영역에 있는 메인메서드에서 출력을 하기 위해서는 객체를 생성해 주던가 스태틱한 영역의 데이터를 가져다 쓰던가 해야한다.
		Test1 ex = new Test1();
//		System.out.println(ex.name1);
		ex.printName();
		
		//정적 멤버 변수는 인스턴스의 생성없이 클래스의 이름으로 호출 가능
		System.out.println(Test1.name2);
	}

}
