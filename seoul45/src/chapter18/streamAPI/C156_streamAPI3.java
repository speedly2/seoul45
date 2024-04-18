package chapter18.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

record Person(String name, int age) { }

public class C156_streamAPI3 {

	public static void main(String[] args) {
		//[ stream 최종 연산(결과) ]
		
		//calculating
		int sum = IntStream.range(1, 10).sum();
		int count = (int) IntStream.range(1, 10).count();
		OptionalInt max = IntStream.range(1, 10).max();
		OptionalInt min = IntStream.range(1, 10).min();
		OptionalDouble avg = IntStream.range(1, 10).average();
/*
		[ Optional이 위험한 이유, Optional을 올바르게 사용해야 하는 이유 ]
		Optional을 사용하면 코드가 Null-Safe해지고, 
		가독성이 좋아지며 애플리케이션이 안정적이 된다는 등과 같은 얘기들을 많이 접할 수 있다. 
		하지만 이는 Optional을 목적에 맞게 올바르게 사용했을 때의 이야기이고, 
		Optional을 남발하는 코드는 오히려 다음과 같은 부작용(Side-Effect)를 유발할 수 있다.
		
		NullPointerException 대신 NoSuchElementException가 발생함
		이전에는 없었던 새로운 문제들이 발생함
		코드의 가독성을 떨어뜨림
		시간적, 공간적 비용(또는 오버헤드)이 증가함
 */
		
		System.out.println(sum);	//스트림 요소의 합 반환
		System.out.println(count);	//스트림 요소 개수 반환
		System.out.println(max);	//스트림의 최대값 반환
		System.out.println(min);	//스트림의 최소값 반환
		System.out.println(avg);	//스트림의 평균값 반환
		
		//reduction
		int stream = IntStream.range(1,5).reduce(10, (total,num)->total+num);
		System.out.println("stream:" + stream);
		
		//collecting > 데이터들을 다시 컬렉션으로 정리
			Set<Integer> evenNumber = IntStream.range(1, 100).boxed()
	                .filter(n -> (n%2 == 0))
	                .collect(Collectors.toSet());
			evenNumber.stream().forEach(System.out::println);
			
			//예시 리스트
			List<Person> person = Arrays.asList(new Person("lee" , 26),
												new Person("kim" , 23),
												new Person("park", 23));
			
			// toList() - 리스트로 반환
			List<String> plist = person.stream().map(Person::name).collect(Collectors.toList());
			plist.stream().forEach(System.out::println);

			// joining() - 작업 결과를 하나의 스트링으로 이어 붙이기
			String join = plist.stream().collect(Collectors.joining(", " ,"<", ">"));
			System.out.println(join);

			//groupingBy() - 그룹지어서 Map으로 반환
			Map<Integer, List<Person>> map = person.stream()
			.collect(Collectors.groupingBy(Person::age));
			map.entrySet().stream().forEach(System.out::println);
			
		// foreach() - 반복작업, 리턴X
		person.stream().forEach(System.out::println);
		
		//matching - 특정 조건을 만족하는 요소가 있는지 체크한 결과를 반환
		//anyMatch(하나라도 만족하는 요소가 있는지), allMatch(모두 만족하는지), noneMatch(모두 만족하지 않는지)
		List<String> members = Arrays.asList("Lee", "Park", "Hwang");
		boolean matchResult = members.stream()
								.anyMatch(m->m.contains("w")); //w를 포함하는 요소가 있는지, True

		boolean matchResult2 = members.stream()
								.allMatch(m->m.length() >= 4); //모든 요소의 길이가 4 이상인지, False

		boolean matchResult3 = members.stream()
								.noneMatch(m->m.endsWith("t")); //t로 끝나는 요소가 하나도 없는지, True
		System.out.println("match: " + matchResult);
		System.out.println("match: " + matchResult2);
		System.out.println("match: " + matchResult3);
		
		//iterating
		person.stream().map(Person::name).forEach(System.out::println);
		
		//finding
		Optional<Person> pResult = person.stream()
//				.findAny();   	//먼저 찾은 요소 하나 반환, 병렬 스트림의 경우 첫번째 요소가 보장되지 않음
				.findFirst(); 	//첫번째 요소 반환
		System.out.println(pResult);
	}

}
