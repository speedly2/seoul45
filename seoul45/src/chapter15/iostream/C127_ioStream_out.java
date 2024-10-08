package chapter15.iostream;

import java.io.FileOutputStream;
import java.io.IOException;

public class C127_ioStream_out {
	
	/*
		자바에서의 I/O (Input/Output) 스트림은 데이터를 읽고 쓰는 방법을 제공하는 클래스입니다. 
		스트림(Stream)은 데이터를 바이트 단위로 읽거나 쓰는 연속적인 데이터 흐름을 나타냅니다. 
		자바에서는 기본적으로 java.io 패키지에 다양한 I/O 스트림 클래스가 포함되어 있습니다.
		
		입력 스트림(Input Stream)
			입력 스트림은 데이터를 입력받을 때 사용됩니다. 
			예를 들어, 파일에서 데이터를 읽거나 네트워크 소켓에서 데이터를 수신할 때 입력 스트림을 사용합니다. 
			주요 입력 스트림 클래스는 다음과 같습니다:
			
			InputStream: 바이트 단위로 데이터를 읽기 위한 추상 클래스입니다. 파일, 메모리 버퍼, 네트워크 연결 등의 다양한 소스에서 데이터를 읽을 수 있습니다.
			
			FileInputStream: 파일에서 바이트를 읽습니다.
			ByteArrayInputStream: 바이트 배열에서 데이터를 읽습니다.
			BufferedInputStream: 데이터를 버퍼링하며 읽기 성능을 향상시킵니다.
			Reader: 문자 단위로 데이터를 읽기 위한 추상 클래스입니다. 유니코드와 같은 문자를 처리할 때 주로 사용됩니다.
			
			FileReader: 파일에서 문자를 읽습니다.
			BufferedReader: 입력 스트림을 버퍼링하며, 한 줄씩 읽기 기능을 제공합니다.
			InputStreamReader: 바이트 입력 스트림을 문자 입력 스트림으로 변환합니다.
		
		출력 스트림(Output Stream)
			출력 스트림은 데이터를 출력할 때 사용됩니다. 
			파일에 데이터를 쓰거나 네트워크로 데이터를 전송할 때 사용됩니다. 
			주요 출력 스트림 클래스는 다음과 같습니다:
			
			OutputStream: 바이트 단위로 데이터를 쓰기 위한 추상 클래스입니다. 파일, 메모리 버퍼, 네트워크 연결 등의 다양한 목적지에 데이터를 쓸 수 있습니다.
			
			FileOutputStream: 파일에 바이트를 씁니다.
			ByteArrayOutputStream: 바이트 배열에 데이터를 씁니다.
			BufferedOutputStream: 데이터를 버퍼링하여 쓰기 성능을 향상시킵니다.
			Writer: 문자 단위로 데이터를 쓰기 위한 추상 클래스입니다.
			
			FileWriter: 파일에 문자를 씁니다.
			BufferedWriter: 출력 스트림을 버퍼링하며, 더 빠르게 데이터를 씁니다.
			OutputStreamWriter: 바이트 출력 스트림을 문자 출력 스트림으로 변환합니다.
			
		InputStream/OutputStream: 바이트 단위 I/O를 처리합니다.
		Reader/Writer: 문자 단위 I/O를 처리합니다.
		버퍼링된 스트림 (BufferedInputStream, BufferedReader 등)은 I/O 성능을 향상시킵니다.
		자바 I/O 스트림은 데이터 입출력을 유연하고 효율적으로 처리할 수 있는 강력한 도구입니다.
	 */

	public static void main(String[] args) {
		// 이 코드에서는 바이트 배열을 그대로 test.txt 파일에 기록합니다. 
		// 하지만 이 파일을 일반적인 텍스트 편집기로 열었을 때는 이해할 수 없는 내용이 나타날 것입니다. 
		// 그 이유는 파일에 기록된 데이터가 사람이 읽을 수 있는 텍스트 형식이 아닌, 바이트 값 그대로 저장되었기 때문
		// 0과 1로 이루어진 코드는 맞으나 해당 파일을 어떤 인코딩방식으로 읽느냐에 따라 매핑되는 값이 달라짐
		byte[] data = { 8, 9, 0, 6, 2, 9, 9 };
//		char data = 'A';
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("test.txt");
			out.write(data);
			System.out.println("Write success");
		}
		catch (IOException e) {
			System.out.println("File output error");
		}
		finally {
			try {
				out.close();
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
//		try (FileOutputStream out2 = new FileOutputStream("test.txt")) {
//			out2.write(data);
//			System.out.println("Write success");
//		}
//		catch (IOException e) {
//			System.out.println("File output error");
//		}
	}

}
