package chapter18.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

record Student(String name, int stdNum) { }

public class C155_streamAPI2 {

	public static void main(String[] args) {
		//[ stream 중간 연산(가공) ]
		
		//filtering
		Stream<Integer> stream = IntStream.range(1, 10).boxed();
		stream.filter(v -> ((v % 2) == 0))	//짝수 선별
			  .forEach(System.out::print);
		System.out.println();
		
		
		//mapping - 데이터 변경 (람다식을 인자로 받음)
		Stream<Integer> stream2 = IntStream.range(1, 10).boxed();
		stream2.filter(v -> ((v % 2) == 0))
		       .map(v -> v * 10)
		       .forEach(System.out::print);
		System.out.println();
		
		
		//sorting
		List<Student> list = Arrays.asList(new Student("고길동", 1001)
										 , new Student("둘리", 1002)
										 , new Student("마이콜", 1003)
							 			  );
		list.stream().sorted(new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s1.name().compareTo(s2.name()) *-1;	// 역순 * -1
			}
		}).forEach(System.out::println);
		
	}

}
