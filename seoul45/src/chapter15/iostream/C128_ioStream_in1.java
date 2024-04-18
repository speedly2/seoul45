package chapter15.iostream;

import java.io.FileInputStream;

public class C128_ioStream_in1 {

	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("test.txt");
		int avail = in.available();
		byte[] data = new byte[avail];
		in.read(data);
		in.close();
		for (byte b : data) {
			System.out.print(b);
		}
	}

}
