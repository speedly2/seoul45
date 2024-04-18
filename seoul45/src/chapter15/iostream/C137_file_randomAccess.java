package chapter15.iostream;

import java.io.RandomAccessFile;

public class C137_file_randomAccess {

	public static void main(String[] args) throws Exception  {
		// 읽기 & 쓰기
		byte[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		RandomAccessFile file = new RandomAccessFile("text4.txt", "rw");
		file.write(data);
		System.out.println("Write success");
		
		file.seek(0);
		for (;;) {
			int value = file.read();
			if (value == -1) break;
			System.out.print(value);
		}
		
		file.close();
		
		// 읽기
		RandomAccessFile file2 = new RandomAccessFile("text4.txt", "r");
		
		file2.seek(4);
		byte value = file2.readByte(); 
		System.out.print(value);
		file2.close();
	}

}
