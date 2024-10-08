package chapter11.object;

// Cloneable 인터페이스를 구현하지 않으면 에러남
// CloneNotSupportedException이 발생하는 이유는 Java의 객체 복제 메커니즘이 이를 통해 복제 가능 여부를 확인하기 때문입니다. 
// Cloneable 인터페이스는 마커 인터페이스로, 클래스가 복제될 수 있음을 명시적으로 나타냅니다. 
// 이를 구현하지 않은 클래스에서는 clone() 메소드를 호출할 수 없도록 하여 복제 작업을 안전하게 관리합니다.
public class Human implements Cloneable {
	int age;
	String name;
	
	int[] score = new int[] { 1, 2, 3};
	
	Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return age + "세의 " + name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Human) {
			Human other = (Human)obj;
			return (age == other.age && name.equals(other.name));
		} else {
			return false;
		}
	}
	
	/*
	 *  Java의 객체 복제 메소드로, 객체의 필드 값을 복사하여 새로운 객체를 생성하는 데 사용
	 *  clone() 메소드를 사용하려면 클래스가 Cloneable 인터페이스를 구현해야 합니다.
	 *  Cloneable 인터페이스는 메소드가 없는 마커 인터페이스입니다. 
	 *  단순히 clone() 메소드가 안전하게 호출될 수 있음을 나타냅니다.
	 *  
	 *  마커 인터페이스 : 메소드가 전혀 선언되지 않은 빈 인터페이스로, 주로 런타임에 특정 클래스에 특별한 처리를 적용하거나, 컴파일러가 특정 검사를 수행
	 *  	타입 안전성: 마커 인터페이스를 통해 특정 클래스가 어떤 기능을 제공하는지 명확하게 표현
	 *  	Cloneable 인터페이스는 클래스가 안전하게 복제될 수 있음을 보장
	 */
	
	@Override
	public Object clone() {
		try {
			// Human 클래스의 모든 필드 값이 복사됩니다. 단, 참조형 필드는 주소 값만 복사됩니다.
			Human other = (Human) super.clone();	//얕은 복사
			
			// 이는 Score 클래스의 clone() 메소드를 호출하여 새로운 Score 객체를 생성하고, 이를 복제된 Human 객체의 score 필드에 할당
			other.score = this.score.clone();		//깊은 복사
			
			return other; 
		}
		catch(CloneNotSupportedException e) {
			return null;
		}
	}
}
