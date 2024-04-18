package chapter03.condition;

public class C027_SwitchExpression {

	public static void main(String[] args) {
/*
		표현식(Switch Expression) - 람다
		java14에 추가, 주로 값을 선택하는 용도로 사용
		리턴타입이므로 default가 필요함
		제어 변수값에 따라 -> 오른쪽의 값을 바로 결정하므로 break 필요X
		명령을 수행하고 값을 리턴할 경우 yield 사용
		 - yield는 블럭 내에서만 유효
*/
		int ranking = 1;
		String medal = switch (ranking) {
							case 1 -> {
								System.out.println("우승을 축하합니다!");
								yield "금메달";	//return과 비슷
							}
							case 2 -> "은메달";
							case 3 -> "동메달";
							case 4, 5 -> "장려상";
							default -> "참가상";
					   };
		System.out.println(medal + "을 수여합니다.");
		
		int num = 2;
		System.out.println(switch (num) {
			case 1 -> "one";
			case 2 -> "two";
			default -> "many";
		});
	}

}
