package chapter15.iostream;

import java.io.RandomAccessFile;

public class C137_file_randomAccess {

	public static void main(String[] args) throws Exception  {
		
		// RandomAccessFile은 파일에 임의의 위치에서 읽기 및 쓰기를 할 수 있게 해줍니다.
		// RandomAccessFile의 주요 장점은 파일 내의 임의의 위치에서 데이터를 읽거나 쓸 수 있다는 점입니다. 
		// 이는 특히 파일의 일부만 수정하거나 읽어야 할 때 유용합니다.
		
		// 읽기 & 쓰기
		byte[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		
		// RandomAccessFile 객체를 생성합니다. "rw" 모드로 열어 파일에 읽기와 쓰기 모두 가능하게 합니다. 파일이 존재하지 않으면 새로 생성됩니다.
		RandomAccessFile file = new RandomAccessFile("lastText.txt", "rw");
		// data 배열의 내용을 파일에 씁니다. 배열의 각 바이트가 파일에 순서대로 기록됩니다.
		file.write(data);
		System.out.println("Write success");
		
		// 파일의 시작 위치(바이트 0)로 커서를 이동합니다. seek() 메서드는 파일의 특정 위치로 커서를 이동시키는 데 사용됩니다.
		file.seek(0);
		for (;;) {
			// 현재 커서 위치에서 한 바이트를 읽습니다. 반환된 값은 0~255 범위의 정수입니다. 파일 끝에 도달하면 -1을 반환합니다.
			int value = file.read();
			if (value == -1) break;
			System.out.print(value);
		}
		
		file.close();
		
		System.out.println();
		System.out.println("==== 특정위치부터 읽기 ====");
		// 읽기
		// "r" 모드로 파일을 열어 읽기 전용으로 설정
		RandomAccessFile file2 = new RandomAccessFile("lastText.txt", "r");
		
		// 파일의 4번째 바이트 위치로 커서를 이동합니다. (파일의 첫 바이트는 0번째 위치입니다.)
		// (0부터 시작하기 때문에 인덱스 4는 실제로 5입니다)
		file2.seek(4);
		// 현재 위치에서 한 바이트를 읽습니다. readByte() 메서드는 읽은 바이트 값을 반환합니다.
		byte value = file2.readByte(); 
		System.out.print(value);
		file2.close();
	}

}
