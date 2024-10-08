package chapter15.iostream;

import java.io.BufferedReader;
import java.io.FileReader;

public class C132_ioStream_bufferTest {

	public static void main(String[] args) throws Exception{
		// FileReader는 문자 기반 스트림으로, 파일에서 문자를 읽어올 수 있습니다.
		// BufferedReader: BufferedReader는 FileReader를 감싸서 버퍼링을 통해 읽기 성능을 개선
		// 내부적으로 버퍼(일반적으로 8KB 크기)를 사용하여, 한번에 다수의 바이트를 미리 읽어들인 후, 필요한 만큼의 데이터를 이 버퍼에서 가져온다
		// 버퍼는 BufferedInputStream에서 데이터를 효율적으로 읽어오기 위해 사용되는 메모리 공간입니다. 
		// 이를 통해 I/O 작업의 횟수를 줄이고, 성능을 향상시킬 수 있습니다
		BufferedReader in = new BufferedReader(new FileReader("test.txt"));
		
		// 파일의 문자가 100자를 넘지 않을 것으로 가정
		char[] text = new char[100];
		int num = in.read(text);
		System.out.println("읽은 문자 개수 = " + num);
		System.out.println(text);
		in.close();
	}

}
