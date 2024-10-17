package chapter03.condition;

public class C023_Switch1 {

	public static void main(String[] args) {
		// Switch
		int ranking = 2;
		
		switch (ranking) {
			case 1:
				System.out.println("축하합니다. 금메달이에요.");
				break;	//switch문 종료
			case 2:
				System.out.println("은메달을 수여합니다.");
				break;
			case 3:
				System.out.println("동메달입니다.");
				break;
			default:
				System.out.println("참가상을 드립니다.");
				break;
		}
	}

}
