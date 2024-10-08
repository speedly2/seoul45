package chapter05.method;

public class MethodTest {

	public static void main(String[] args) {
		// 메서드 만들어보기
		// 전체 구구단 출력
		methodEx();
		System.out.println("=============");
		// 특정 단 출력
		methodEx(1);
	}

	public static void methodEx() {
        for (int i = 2; i <= 9; i++) {
            System.out.println("* [" + i + "] 단");
            methodEx(i);
            System.out.println();
        }
    }
	
	public static void methodEx(int number) {
        for (int i = 1; i <= 9; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

}
