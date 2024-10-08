package chapter12.generic;

import java.util.ArrayList;

public class C100_generic2 {

	public static void main(String[] args) {
/*
	제네릭
	 - 데이터 타입의 다형성
	 - 참조형 데이터 타입만 가능
	 
	제네릭 이유
	 - 클래스 외부에서 타입을 지정해주기 때문에 따로 타입을 체크하고 변환해줄 필요가 없다.
	 - 컴파일 시에 의도하지 않은 타입이 들어오는 걸 막을 수 있다. (타입 안정성)
	 - 코드의 재사용성이 높아진다.
	
	제네릭 표기
		E - Element
		K - Key
		N - Number
		T - Type
		V - Value
		etc..
*/
		// 제네릭타입을 명시하지 않을 경우 컴파일단계에서 에러를 알 수 없음
		ArrayList arNum = new ArrayList();
		arNum.add(1);
		arNum.add("문자열");
//		int value = arNum.get(0);	// object라 캐스팅 필요
		int value = (int) arNum.get(0);
		System.out.println(value);
//		int temp = (int)arNum.get(1);
//		System.out.println(temp);
		
		// 데이터타입을 명시했으므로 다른 타입 사용시 에러
		ArrayList<Integer> arNum2 = new ArrayList<Integer>();
		arNum2.add(1);
//		arNum2.add("문자열");	//err
		int value2 = arNum2.get(0);
		System.out.println(value2);
		
	}

}
