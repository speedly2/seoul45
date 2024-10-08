package chapter15.iostream;

import java.io.FileReader;
import java.io.FileWriter;

public class C130_ioStream_letter {

	public static void main(String[] args) throws Exception {
		// 문자 단위 입출력
		
		String str = "자바 Stream 입출력";
		FileWriter out = new FileWriter("test.txt");
		out.write(str);
		out.close();
		System.out.println("Write success");

		// 한 문자씩 읽기
		FileReader in = new FileReader("test.txt");
		int ch;
		for (;;) {
			ch = in.read();
			if (ch == -1)
				break;
			System.out.print((char) ch);
		}
		in.close();
		System.out.println();

		// null과 \u0000는 서로 다른 개념입니다. null은 참조가 없는 상태를 나타내고, \u0000은 실제로 존재하는 유니코드 값이 0인 문자
		System.out.println("==============");
		// 한꺼번에 읽기
		in = new FileReader("test.txt");
		char[] text = new char[20];
		int num = in.read(text);
		System.out.println("읽은 문자 개수 = " + num);
		System.out.println(text);
		in.close();
	}

}
