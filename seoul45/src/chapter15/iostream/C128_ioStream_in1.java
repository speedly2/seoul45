package chapter15.iostream;

import java.io.FileInputStream;

public class C128_ioStream_in1 {

	public static void main(String[] args) throws Exception {
		// "test.txt"는 파일 경로로, 이 파일이 존재해야 합니다. 
		// 파일이 존재하지 않으면 FileNotFoundException이 발생합니다.
		FileInputStream in = new FileInputStream("test.txt");
		
		// in.available() 메서드는 현재 FileInputStream에서 읽을 수 있는 바이트 수를 반환합니다. 
		// 즉, test.txt 파일의 크기를 나타냅니다.
		int avail = in.available();
		System.out.println(avail);
		
		byte[] data = new byte[avail];
		// in.read(data) 메서드는 파일에서 데이터를 읽어와 data 배열에 채웁니다.
		// 파일의 처음부터 읽어와 배열의 크기만큼 바이트 데이터를 data에 저장합니다.
		// read() 메서드는 읽어온 바이트 수를 반환하며, 이 경우 배열의 크기만큼 읽기 때문에 파일 전체를 배열에 저장합니다.
		in.read(data);
		// FileInputStream을 닫습니다. 파일 작업이 끝나면 반드시 스트림을 닫아야 합니다.
		// 스트림을 닫음으로써 시스템 리소스를 해제하고, 더 이상의 파일 접근을 막습니다.
		in.close();
		
		for (byte b : data) {
			System.out.print(b);
		}
	}

}
