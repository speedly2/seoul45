package chapter02.operator;

public class C018_ExplicitConversion {

	public static void main(String[] args) {
		// 형변환(큰 -> 작 ... 강제 형변환 or 명시적 형변환)
		int iNum = 10;
		byte bNum = (byte) iNum;
		
		double dNum = 3.14;
		int iNum2 = (int) dNum;

		System.out.println(bNum + ", " + iNum2);
	}

}
