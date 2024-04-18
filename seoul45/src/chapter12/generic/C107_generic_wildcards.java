package chapter12.generic;

class Human {
	void intro() { System.out.println("나 사람"); }
}
class Student extends Human {
	void intro() { System.out.println("나 학생"); }
}
class Room<T> {
	T value;
	Room(T value) { this.value = value; }
	T get() { return value; }
	void set(T value) { this.value = value; }
}
public class C107_generic_wildcards {
/*
	<?> : Unbounded Wildcards (제한 없음)
	타입 파라미터를 대치하는 구체적인 타입으로 모든 클래스나 인터페이스 타입이 올 수 있다
	
	
	<? extends 상위타입> : Upper Bounded Wildcards (상위 클래스 제한)	- 상한선
	타입 파라미터를 대치하는 구체적인 타입으로 상위 타입이나 상위 타입의 하위 타입만 올 수 있다
	
	
	<? super 하위타입> : Lower Bounded Wildcards (하위 클래스 제한)	- 하한선
	타입 파라미터를 대치하는 구체적인 타입으로 하위 타입이나 하위 타입의 상위 타입만 올 수 있다
 */
	
	static void printMan(Room<? extends Human> room) {
		room.get().intro();
	}
	
	public static void main(String[] args) {
		Human h = new Human();
		Room<Human> bh = new Room<Human>(h);
		printMan(bh);

		Student s = new Student();
		Room<Student> bs = new Room<Student>(s);
		printMan(bs);
	}

}
