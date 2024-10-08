package chapter08.inheritance;

public class C077_has_a {

	public static void main(String[] args) {
/*
		has a relation
		포함, 구성 관계
 */
		Human4 h = new Human4("파이어스틸");
		System.out.println(h.tool.name);
		h.use();
	}

}

class Human4 {
	Tool tool;

	Human4(String toolName) {
		tool = new Tool(toolName);
	}
	
	void use() {
		System.out.println(tool.name + "을/를 사용하다");
	}
}

class Tool {
	String name;
	
	Tool(String name) {
		this.name = name;
	}
}


/*
 * has a 관계의 분류
 */

// 1. Association(연관 관계)
// 두 객체 간의 일반적인 관계를 나타냅니다. 
// 하나의 객체가 다른 객체를 참조하는 형태로, 소유권이 명확하지 않음.
// 학생과 강의 간의 관계에서, 학생은 여러 강의를 들을 수 있고, 강의는 여러 학생이 들을 수 있습니다. 
// 이 경우 학생과 강의는 서로 독립적으로 존재할 수 있습니다.
class Student3 {
	private Course course;
}
class Course {
	private Student3 student;
}

// 2. Aggregation(집합 관계) - 약한 소유권
// 대학과 학생 간의 관계에서, 대학은 여러 학생을 포함할 수 있지만, 
// 학생이 대학에 속해 있다 해도 대학이 사라진다고 해서 학생도 사라지지 않습니다.
class Car {
	private Engine engine;
	
	public Car(Engine engine) {
		this.engine = engine;
	}
	public void assembleCar(Engine engine) {
		this.engine = engine;
	}
}
class Engine { }

// 3. Composition(구성 관계) - 강한 소유권
// 집과 방 간의 관계에서, 집이 방을 포함하며 집이 없으면 방도 존재할 수 없습니다.
class House {
	// 멤버변수 초기화
	private Room rooms = new Room();
	
	// 생성자 초기화
//	private Room rooms;
//	public House() {
//		this.rooms = new Room();
//	}
}
class Room { }







