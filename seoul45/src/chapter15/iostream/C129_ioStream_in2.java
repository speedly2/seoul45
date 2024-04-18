package chapter15.iostream;

import java.io.FileInputStream;

public class C129_ioStream_in2 {

	public static void main(String[] args) throws Exception{
		FileInputStream in = new FileInputStream("test.txt");
		int data;
		for (;;) {
			data = in.read();
			if (data == -1) break;
			System.out.print(data);
		}
		in.close();
	}

}
