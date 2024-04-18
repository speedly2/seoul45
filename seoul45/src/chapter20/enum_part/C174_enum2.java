package chapter20.enum_part;


public class C174_enum2 {

	public static void main(String[] args) {
		//enum Direction 의 모든 상수값들을 배열로 변환
		Direction[] ways = Direction.values();
		for (Direction way:ways) {
			System.out.print(way + ", ");
		}
		System.out.print("중 하나를 선택하십시오.");
		
		Direction origin = Direction.valueOf("EAST");
		System.out.println(origin);
	}

	enum Direction { EAST, WEST, SOUTH, NORTH };
}
