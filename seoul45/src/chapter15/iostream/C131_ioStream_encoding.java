package chapter15.iostream;

import java.io.FileReader;

public class C131_ioStream_encoding {

	public static void main(String[] args) throws Exception {
//		FileReader in = new FileReader("애국가.txt");
//		FileReader in = new FileReader("애국가-Unicode.txt");
//		FileReader in = new FileReader("애국가-Utf8.txt");
		FileReader in = new FileReader("애국가-Utf8nb.txt");
		char[] text = new char[1000];
		int num = in.read(text);
		System.out.println("읽은 문자 개수 = " + num);
		System.out.println(text);
		in.close();
	}

}
