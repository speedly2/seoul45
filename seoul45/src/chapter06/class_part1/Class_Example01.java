package chapter06.class_part1;

public class Class_Example01 {

	public static void main(String[] args) {
		// Game
		//캐릭터 생성1 (인스턴스 생성)
		Character cha1 = new Character("불주먹", "평민");
		System.out.println(cha1);
		cha1.skill();
		
		//캐릭터 생성2 (인스턴스 생성)
		Character cha2 = new Character("휘발유", "마법사", 2, 2, 3, 10);
		System.out.println(cha2);
		cha2.skill();
		
		//캐릭터 생성3 (인스턴스 생성)
		Character cha3 = new Character("고구마", "궁수", 5, 3, 11, 2);
		System.out.println(cha3);
		cha3.skill();

	}

}
