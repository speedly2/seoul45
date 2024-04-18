package chapter12.generic;

import java.util.ArrayList;
import java.util.List;

class Fruit { }
class Apple extends Fruit { }
class Banana extends Fruit { }

class FruitBox<T> {
    List<T> fruits = new ArrayList<>();

    public void add(T fruit) {
        fruits.add(fruit);
    }
}

class FruitBox2<T, U> {
    List<T> apples = new ArrayList<>();
    List<U> bananas = new ArrayList<>();

    public void add(T apple, U banana) {
        apples.add(apple);
        bananas.add(banana);
    }
}

public class C101_generic3 {

	public static void main(String[] args) {
		// 제네릭 타입은 다형성 원리가 그대로 적용된다.
		FruitBox<Fruit> box = new FruitBox<>();
        box.add(new Fruit());
        box.add(new Apple());
        box.add(new Banana());
        
        // 복수 제네릭 타입
        FruitBox2<Apple, Banana> box2 = new FruitBox2<>();
        box2.add(new Apple(), new Banana());
        box2.add(new Apple(), new Banana());
	}

}
