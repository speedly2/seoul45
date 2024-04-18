package chapter05.method;

public class C057_method_valueCheck {

	public static void main(String[] args) {
		int num = 2;
		getDouble(num);
		System.out.println("num = " + num);
		
		int[] arr = { 2, 8, 6 };
		getDouble(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"] = " + arr[i]);			
		}
	}

	static int getDouble(int value) {
		value *= 2;
		return value;
	}
	
	static void getDouble(int[] value) {
		value[0] *= 2;
	}
}
