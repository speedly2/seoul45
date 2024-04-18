package chapter15.iostream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class C133_ioStream_fileCopy {

	public static void main(String[] args) throws Exception {
		long start = System.currentTimeMillis();
		System.out.println("복사 시작");
		BufferedInputStream src = new BufferedInputStream(new FileInputStream("test2.txt")); 
		BufferedOutputStream dest = new BufferedOutputStream (new FileOutputStream("text3.txt"));
		int data;
		for(;;) {
			data = src.read();
			if (data == -1) break;
			dest.write(data);
		}
		src.close();
		dest.close();
		System.out.println("복사 완료");
		System.out.println((System.currentTimeMillis()-start)/1000.0 + " 초 걸림");
	}

}
