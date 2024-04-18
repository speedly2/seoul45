package chapter03.condition;

public class C026_Switch4 {

	public static void main(String[] args) {
		// switch문 활용
		int score = 82;
		
		switch (score/10) {
			case 10: case 9: 	//90점 이상
				System.out.println("A");
				break;
			case 8:				//80점 이상
				System.out.println("B");
				break;
			case 7:				//70점 이상
				System.out.println("C");
				break;
			case 6:				//60점 이상
				System.out.println("D");
				break;
			default:			//60점 미만
				System.out.println("F");
				break;
		}

	}

}
