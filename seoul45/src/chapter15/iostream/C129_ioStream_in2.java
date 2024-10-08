package chapter15.iostream;

import java.io.FileInputStream;

public class C129_ioStream_in2 {

	public static void main(String[] args) throws Exception{
		//1
		FileInputStream in = new FileInputStream("test.txt");
		
		// data는 읽어온 바이트를 저장하며, int형으로 선언되어 있습니다. 이는 바이트를 정수로 표현하기 위함입니다.
		int data;
		for (;;) {
			// FileInputStream에서 한 바이트를 읽어 data 변수에 저장
			data = in.read();
			// data가 -1이면 파일의 끝에 도달한 것이므로 루프를 종료합니다. 
			// -1은 파일 읽기 스트림에서 파일의 끝을 나타내는 표준 값
			if (data == -1) break;
			System.out.print(data);
		}
		// 반복문이 제대로 실행되었을때만 닫음 = in이 안닫힐 가능성 생김
		in.close();
		
		//2
//		FileInputStream in = null;
//		try {
//			in = new FileInputStream("test.txt");
//			int data;
//			for (;;) {
//				data = in.read();
//				if (data == -1) break;
//				System.out.print(data);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			in.close();
//		}
		
		//3
//		try(FileInputStream in = new FileInputStream("test.txt")) {
//			int data;
//			for (;;) {
//				data = in.read();
//				if (data == -1) break;
//				System.out.print(data);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

}
