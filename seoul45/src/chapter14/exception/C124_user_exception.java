package chapter14.exception;

/*
	경고가 발생하는 이유는, NegativeException 클래스가 Exception 클래스를 상속받고 있기 때문입니다.
	Exception 클래스는 자바의 표준 예외 클래스이며, Serializable 인터페이스를 구현하고 있습니다. 
	따라서 이를 상속하는 모든 사용자 정의 예외 클래스도 자동으로 Serializable 인터페이스를 구현하게 됩니다.
	
	Serializable 인터페이스는 객체의 직렬화(Serialization)를 지원하는 인터페이스로, 
	객체를 바이트 스트림으로 변환하여 파일로 저장하거나 네트워크를 통해 전송할 수 있게 합니다. 
	직렬화된 객체를 다시 역직렬화할 때 클래스의 버전을 확인하기 위해 serialVersionUID라는 고유 식별자가 사용됩니다.

	serialVersionUID는 직렬화된 객체의 클래스 버전이 변경되었는지 확인하는 데 사용됩니다. 
	클래스의 정의가 변경되면 serialVersionUID가 일치하지 않을 수 있으며, 
	이 경우 InvalidClassException이 발생할 수 있습니다. 
	이를 방지하기 위해, 클래스에 명시적으로 serialVersionUID를 선언할 수 있습니다.
 */
class NegativeException extends Exception {
	NegativeException() {
		super("음수는 안되요");
	}
}

public class C124_user_exception {
	
	public static void main(String[] args) {
		int sum = 0;
		
		try {
			sum = calcSum(100);		//1
//			sum = calcSum(-10);		//2
			System.out.println(sum);
		} catch (NegativeException e) {
			e.printStackTrace();
		}
	}

	static int calcSum(int to) throws NegativeException {
		if (to < 0) {
			throw new NegativeException();
		}
		int sum = 0;
		for (int i = 1; i <= to; i++) {
			sum += i;
		}
		return sum;
	}

}
