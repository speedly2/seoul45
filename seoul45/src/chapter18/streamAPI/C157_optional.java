package chapter18.streamAPI;

import java.util.Optional;

class Notebook {
	String model;
	Notebook(String model) { this.model = model; }
}

class Human {
	int age;
	String name;
	Optional<Notebook> book;
	
	Human(int age, String name, String model) {
		if (model == null || model.length() == 0) {
			book = Optional.empty();
		} else {
			book = Optional.of(new Notebook(model));
		}
		this.age = age;
		this.name = name;
	}
}

public class C157_optional {

	// Optional을 사용하면 null 대신 빈 Optional 객체를 반환하거나, 값이 있을 때만 접근하도록 강제하여 이러한 문제를 피할 수 있습니다.
	
	public static void main(String[] args) {
		Human kim = new Human(29, "김상형", "레노보");
		useBook(kim);
		Human lee = new Human(44, "이승우", null);
		useBook(lee);
	}
	
	static void useBook(Human human) {
		//ifPresent : 존재한다면 실행, 존재하지 않는다면 무시
		human.book.ifPresent(b -> System.out.println("내 노트북 : " + b.model));
		
		//orElse : if-else문과 비슷
		Notebook book = human.book.orElse(new Notebook("없음"));
		System.out.println("내 노트북 : "  + book.model);
		System.out.println("============");
	}
}
