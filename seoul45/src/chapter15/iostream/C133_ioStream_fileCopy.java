package chapter15.iostream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class C133_ioStream_fileCopy {

	public static void main(String[] args) throws Exception {
		
		long start = System.currentTimeMillis();
		System.out.println("복사 시작");
		BufferedInputStream src = new BufferedInputStream(new FileInputStream("오래된노래.txt")); 
		BufferedOutputStream dest = new BufferedOutputStream(new FileOutputStream("가사 복사본.txt"));
		int data;
		for(;;) {
			data = src.read();
			if (data == -1) break;
			dest.write(data);
		}
		System.out.println("복사 완료");
		System.out.println((System.currentTimeMillis()-start)/1000.0 + " 초 걸림");

		System.out.println("=======================");
		long start2 = System.currentTimeMillis();
        System.out.println("복사 시작");

        try (FileInputStream src2 = new FileInputStream("오래된노래.txt");
             FileOutputStream dest2 = new FileOutputStream("가사 복사본2.txt")) {
            
            int data2;
            while ((data2 = src2.read()) != -1) {
                dest2.write(data2);
            }
        }

        src.close();
        dest.close();
        System.out.println("복사 완료");
        System.out.println((System.currentTimeMillis() - start2) / 1000.0 + " 초 걸림");
	}

}
