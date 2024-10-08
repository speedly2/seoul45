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
	?는 불특정한 타입을 가리키는 와일드카드
	
	<?> : Unbounded Wildcards (제한 없음)
	타입 파라미터를 대치하는 구체적인 타입으로 모든 클래스나 인터페이스 타입이 올 수 있다
	
	<? extends 상위타입> : Upper Bounded Wildcards (상위 클래스 제한)	- 상한선
	타입 파라미터를 대치하는 구체적인 타입으로 상위 타입이나 상위 타입의 하위 타입만 올 수 있다
	
	<? super 하위타입> : Lower Bounded Wildcards (하위 클래스 제한)	- 하한선
	타입 파라미터를 대치하는 구체적인 타입으로 하위 타입이나 하위 타입의 상위 타입만 올 수 있다
 */
	
	static void printMan(Room<? extends Human> room) {
		// Human 클래스와 그 하위 클래스만
		// get() 메서드로 가져온 객체는 Human 타입 또는 Human의 하위 타입이므로 intro() 메서드를 바로 호출할 수 있습니다.
		room.get().intro();
	}
	static void printMan2(Room<? super Human> room) {
		// Human과 그 상위 타입을 받을 수 있음
		// Room<? super Human>으로 인해 get()의 반환 타입은 Object입니다.
		// get() 메서드로 가져온 객체는 상위 타입으로 캐스팅되므로 Object
	    Object obj = room.get();

	    // 하지만 Object를 Human으로 캐스팅하여 사용해야 intro() 메서드를 호출할 수 있습니다.
	    if (obj instanceof Human) {
	        Human h = (Human) obj;
	        h.intro();
	    } else {
	        System.out.println("Human 또는 그 하위 타입이 아닙니다.");
	    }
	}
	static void printMan3(Room<?> room) {
		// Room<?>으로 인해 get()의 반환 타입은 Object입니다.
		// Room<?>: 제네릭 타입에 제한이 없습니다.
	    Object obj = room.get();

	    // intro()를 호출하려면 역시 instanceof와 캐스팅이 필요합니다.
	    if (obj instanceof Human) {
	        Human h = (Human) obj;
	        h.intro();
	    } else {
	        System.out.println("Human 타입이 아닙니다.");
	    }
	}
	
	public static void main(String[] args) {
		Human h = new Human();
		Room<Human> bh = new Room<Human>(h);
		printMan(bh);
		printMan2(bh);
		printMan3(bh);

		Student s = new Student();
		Room<Student> bs = new Room<Student>(s);
		printMan(bs);
//		printMan2(bs);	// Student므로 불가
		printMan3(bs);
	}

}
