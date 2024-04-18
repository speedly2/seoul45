package chapter16.class_part2;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass{
		int inNum = 100;
//		static int sInNum = 200;
		
		void inTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수1)");
			System.out.println("OutClass num = " + OutClass.this.num + "(외부 클래스의 인스턴스 변수2)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수1)");			
			System.out.println("OutClass sNum = " + OutClass.sNum + "(외부 클래스의 정적 변수2)");			
		}
		
//		static void sTest() {}
	}

	public void usingClass() {
		inClass.inTest();
	}
}
public class C140_innerClass2 {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass();
		
		//다른 클래스에서 인스턴스 내부 클래스 생성하기
		System.out.println("\n다른 클래스에서 인스턴스 내부 클래스 생성하기");
		OutClass outClass2 = new OutClass();
		OutClass.InClass inClass = outClass2.new InClass();
		inClass.inTest();
	}

}
