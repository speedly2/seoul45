package chapter12.generic;

import java.util.ArrayList;
import java.util.List;


// 다중타입 한정(T extends class A & interface B & interface C)
// 제네릭 클래스나 메서드에서 타입 파라미터에 대해 하나 이상의 타입(인터페이스)을 요구할 수 있습니다.
interface Readable {}
interface Closeable {}

class BoxType implements Readable, Closeable {}
//class BoxType2 implements Readable {}
class Box<T extends Readable & Closeable> {
	List<T> list = new ArrayList<>();

	public void add(T item) {
		list.add(item);
	}
}
public class C105_generic_range2 {

	public static void main(String[] args) {
		// 다중타입 한정 (&사용)
	    // Readable 와 Closeable 를 동시에 구현한 클래스만이 타입 할당이 가능하다
	    Box<BoxType> box = new Box<>();
//	    Box<BoxType2> box2 = new Box<>();
	    
	    // 심지어 최상위 Object 클래스여도 할당 불가능하다
//	    Box<Object> box2 = new Box<>(); // ! Error
	}

}
