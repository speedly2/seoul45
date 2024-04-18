package chapter03.condition;

public class C024_Switch2 {

	public static void main(String[] args) {
		// 병합처리
		int ranking = 3;
		
		switch (ranking) {
		case 1:
			System.out.println("대상입니다.");
			break;
		case 2:
		case 3:
			System.out.println("우수상입니다.");
			break;
		case 4:
		case 5:
			System.out.println("장려상입니다.");
			break;
		}
		System.out.println("===========");
		
		int days;
		int month = 5;
		
		switch (month) {
			case 2:
				days = 28;
				break;
			case 4:	case 6: case 9: case 11:
				days = 30;
				break;
			default:
				days = 31;
				break;
		}
		
		System.out.println(month + "월은 " + days + "일까지 있습니다.");
	}

}
