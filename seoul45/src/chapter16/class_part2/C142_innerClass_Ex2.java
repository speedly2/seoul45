package chapter16.class_part2;

public class C142_innerClass_Ex2 {

	public static void main(String[] args) {
		Human kim = new Human(29, "상형", "김");
		kim.intro();
		
		// 내부 클래스 호출
		Human.Name name = kim.new Name("순신", "이");
		System.out.print(name.family + name.first + ":");
		name.outAge();
	}

}
