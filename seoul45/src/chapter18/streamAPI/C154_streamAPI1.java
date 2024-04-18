package chapter18.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C154_streamAPI1 {

	public static void main(String[] args) {
	//https://inpa.tistory.com/entry/JAVA8-%E2%98%95-%EB%9E%8C%EB%8B%A4%EC%8B%9D%EC%9D%84-%EB%8D%94-%EC%A7%A7%EA%B2%8C-%EB%A9%94%EC%86%8C%EB%93%9C-%EC%B0%B8%EC%A1%B0Method-Reference
/*
	stream 의 동작 방식
	stream -> filter -> sorted -> limit -> map -> reduce
	[ 준비 ]  [             중간 연산             ]  [최종연산]
	
	method 참조 방식 ::
 */
		//[ stream 생성 ]
		
		//배열 스트림 : Arrays.stream()
		String[] arr = new String[]{"a", "b", "c"};
		Stream<String> stream = Arrays.stream(arr);
		stream.forEach(x -> System.out.print(x));
		System.out.println();
		
		//컬렉션 스트림: .stream()
		List<String> list = Arrays.asList("a","b","c");
		Stream<String> stream2 = list.stream();
		stream2.forEach(x -> System.out.print(x));
		System.out.println();
		
		//Stream.builder()
		Stream<String> builderStream = Stream.<String>builder()
									    .add("a")
									    .add("b")
									    .add("c")
									    .build();
		builderStream.forEach(x-> System.out.print(x));
		System.out.println();
		
		//람다식 Stream.generate(), iterate()
		Stream<String> generatedStream = Stream.generate(()->"a").limit(3);
		generatedStream.forEach(x -> System.out.print(x));
		System.out.println();
		// 생성할 때 스트림의 크기가 정해져있지 않기(무한하기)때문에 최대 크기를 제한해줘야 한다.
		Stream<Integer> iteratedStream = Stream.iterate(0, n->n+2).limit(5); //0,2,4,6,8
		iteratedStream.forEach(x -> System.out.print(x));
		System.out.println();
		
		//기본 타입형 스트림
		IntStream intStream = IntStream.range(1, 5); // [1, 2, 3, 4]
		intStream.forEach(x -> System.out.print(x));
		System.out.println();
		
//		//병렬 스트림: parallelStream()
//		Stream<String> parallelStream = list.parallelStream();
//		parallelStream.forEach(x -> System.out.print(x));
//		System.out.println();
	}
}
