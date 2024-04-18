package chapter06.class_part1;

public class C069_static2 {

	public static int add(int x, int y) {
        return x + y;
    }

    public int min(int x, int y) {
        return x - y;
    }
    
	public static void main(String[] args) {
		//static메서드 연습

		C069_static2.add(1, 2);   //  static 메소드 이므로 객체 생성 없이 사용 가능
//		StaticEx01.min(1, 2);   //  static 메소드가 아니므로 객체 생성후에 사용가능 (에러)


		C069_static2 cal = new C069_static2();
		int sum = cal.add(1, 2);   // o 가능은 하지만 권장하지 않는 방법
		System.out.println(sum);
		int sum2 = cal.min(1, 2);   // o
		System.out.println(sum2);
	}

}
