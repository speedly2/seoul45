package chapter14.exception;

class NegativeException extends Exception {
	NegativeException() {
		super("음수는 안되요");
	}
}

public class C124_user_exception {
	
	public static void main(String[] args) {
		int sum = 0;
		
		try {
			sum = calcSum(100);
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
