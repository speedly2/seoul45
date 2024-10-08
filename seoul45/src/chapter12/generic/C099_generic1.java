package chapter12.generic;

class Coffee { }
class Juice  { }

class BeverageBox {
    // 모든 클래스 타입을 받기 위해 최고 조상인 Object 타입으로 설정
    private Object[] beverage;

    public BeverageBox(Object[] beverage) {
        this.beverage = beverage;
    }

    public Object getBeverage(int index) {
        return beverage[index];
    }
}

class BeverageBox2<T> {
	// 외부로부터 받아오는 제네릭타입 사용
	private T[] beverage;
//	static T t;		// static에서 사용 불가
	
	public BeverageBox2(T[] beverage) {
		this.beverage = beverage;
//		T t = new T();	// T타입으로 인스턴스 생성 불가
	}
	
	public T getBeverage(int index) {
		return beverage[index];
	}
}
public class C099_generic1 {

	public static void main(String[] args) {
		Coffee[] arr = {
	            new Coffee(),
	            new Coffee()
	    };
		BeverageBox box = new BeverageBox(arr);

		// Coffee 객체 타입의 배열을 BeverageBox에 넣었는데, 개발자가 착각하고 Juice를 형변환하여 가져오려고 하였기 때문에 생긴 현상
		Coffee coffee = (Coffee) box.getBeverage(0);
//		Juice juice = (Juice) box.getBeverage(1);		// 에러체크 X
		System.out.println(coffee);
		
		// 제네릭 사용
		Coffee[] arr2 = {
				new Coffee(),
				new Coffee()
		};
		BeverageBox2<Coffee> box2 = new BeverageBox2<>(arr2);
		
		// 이 처럼 제네릭은 클래스나 메서드를 정의할때 타입 파라미터로 객체의 서브 타입을 지정해줌으로써, 
		// 잘못된 타입이 사용될 수 있는 문제를 컴파일 과정에서 제거하여 개발을 용이하게 해준다.
		Coffee coffee2 = box2.getBeverage(0);
//		Juice juice2 = box2.getBeverage(1);		// 컴파일 시점에서 에러체크
	}

}
