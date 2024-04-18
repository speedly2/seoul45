package chapter15.iostream;

import java.io.FileReader;
import java.io.FileWriter;

public class C130_ioStream_letter {

	public static void main(String[] args) throws Exception {
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

		// 한꺼번에 읽기
		in = new FileReader("test.txt");
		char[] text = new char[100];
		int num = in.read(text);
		System.out.println("읽은 문자 개수 = " + num);
		System.out.println(text);
		in.close();
	}

}
