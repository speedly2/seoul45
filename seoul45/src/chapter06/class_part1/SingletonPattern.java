package chapter06.class_part1;

class Singleton {
	// 인스턴스를 아직 생성하지 않음
	private static Singleton instance;
	
	// private 생성자를 사용하여 외부에서 인스턴스를 생성하지 못하도록 함
	private Singleton() {}
	
	// 인스턴스를 필요할 때까지 생성하지 않음
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public void printMethod() {
		System.out.println("인스턴스로부터 메서드 호출");
	}
}

public class SingletonPattern {

	public static void main(String[] args) {
//		Singleton err = new Singleton();
//		err.printMethod();
		
		Singleton st = Singleton.getInstance();
		st.printMethod();
		
	}

}
