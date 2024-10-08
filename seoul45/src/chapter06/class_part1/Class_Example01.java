package chapter06.class_part1;

public class Class_Example01 {

/*
	Character 클래스 생성
	1. 외부에서 접근할수 없는 멤버변수를 선언한다.
		- String id, job
		- int	 level, str, dex, intel
	2. level, str, dex, intel 은 인스턴스 생성시 1로 초기화한다.
	3. 명시적 생성자 생성
		- id, job 을 파라미터로 가지는 생성자
		- id, job, level, str, dex, intel 을 파라미터로 가지는 생성자
	4. skill() 생성
		- 인스턴스의 job이 "마법사" 면 "파이어볼" 출력
		- 인스턴스의 job이 "전사" 면 "배쉬" 출력
		- 인스턴스의 job이 "궁수" 면 "크리티컬" 출력
		- 그 외 "기본공격" 출력
	5. 해당 인스턴스의 정보를 출력하는 메서드 생성
		- 출력형식
		[고구마(궁수) Lv5]님의 스탯: str(3), dex(11), intel(2)
 */
	
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
