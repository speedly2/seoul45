package chapter15.iostream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class C131_ioStream_encoding {
	
	/*
		UTF-8(8-bit Unicode Transformation Format)은 가변 길이 문자 인코딩 방식으로, 
			유니코드 문자를 1바이트에서 4바이트로 인코딩합니다.
			ASCII 문자(0-127)는 1바이트로 인코딩되며, 그 외의 문자는 여러 바이트를 사용하여 인코딩됩니다.
			
		UTF-16(16-bit Unicode Transformation Format)은 유니코드 문자를 주로 2바이트 또는 4바이트로 인코딩합니다.
			기본적으로 2바이트로 인코딩하지만, Supplementary Characters(보조 문자)는 4바이트를 사용하여 인코딩합니다.
		
		UTF-8NB
			설명:
				UTF-8NB는 UTF-8의 변형으로, "NB"는 "No BOM"을 의미합니다. 이 인코딩 방식은 BOM(Byte Order Mark)을 포함하지 않습니다.
				BOM은 유니코드 파일의 시작 부분에 위치하여, 파일의 문자 인코딩 방식을 나타내는 바이트 시퀀스입니다. 
				UTF-8NB는 BOM 없이 UTF-8로 인코딩된 파일을 의미합니다.
			특징:
				BOM 없음: UTF-8NB는 BOM을 포함하지 않으므로, 파일의 시작에 BOM이 없습니다.
				호환성: BOM이 없는 UTF-8 인코딩 방식은 여러 플랫폼에서 일관되게 읽히며, UTF-8 인코딩 방식의 호환성을 유지합니다.
			용도:
				UTF-8NB는 주로 BOM을 사용하지 않고 UTF-8로 인코딩된 파일을 저장하거나 전송할 때 사용됩니다.
				특히 웹 개발 및 여러 플랫폼에서 파일 호환성 문제를 피하기 위해 BOM이 없는 UTF-8 파일을 선호할 수 있습니다.
		
		요약
			UTF-8: 가변 길이 인코딩, 1바이트에서 4바이트로 문자를 인코딩. ASCII와 호환됨.
			UTF-16: 주로 2바이트 또는 4바이트로 인코딩, BMP 문자는 2바이트, 보조 문자는 4바이트.
			UTF-8NB: BOM이 없는 UTF-8 인코딩 방식. BOM 없이 UTF-8로 인코딩된 파일을 의미.
		
		BOM은 파일의 시작 부분에 삽입되어 인코딩 방식을 명시하는 바이트 시퀀스입니다. 
		UTF-8의 BOM은 0xEF 0xBB 0xBF입니다. BOM이 있으면 파일이 UTF-8로 인코딩되었음을 나타냅니다.
	 */

	public static void main(String[] args) throws Exception {
//		FileReader in = new FileReader("애국가.txt");			//MS949
//		FileReader in = new FileReader("애국가-Unicode.txt");	//UTF-16
//		FileReader in = new FileReader("애국가-Utf8.txt");		//UTF-8
		FileReader in = new FileReader("애국가-Utf8nb.txt");	//UTF-8nb
		
		int ch;
		for (;;) {
			ch = in.read();
			if (ch == -1)
				break;
			System.out.print((char) ch);
		}
		in.close();
		
//		char[] text = new char[100];
//		int num = in.read(text);
//		System.out.println("읽은 문자 개수 = " + num);
//		System.out.println(text);
//		in.close();
		
		
		
		
		
//		try {
//            // 파일 인코딩을 명시적으로 지정하여 읽어오기
//            readFile("애국가.txt", null);         // 시스템 기본 인코딩
//            readFile("애국가-Unicode.txt", "UTF-16");
//            readFile("애국가-Utf8.txt", "UTF-8");
//            readFile("애국가-Utf8nb.txt", "UTF-8");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
	}

	
	//1
//	private static void readFile(String fileName, String encoding) throws IOException {
//        InputStreamReader in = encoding != null ? 
//            new InputStreamReader(new FileInputStream(fileName), encoding) :
//            new InputStreamReader(new FileInputStream(fileName));
//        
//        char[] text = new char[1000];
//        int num = in.read(text);
//        System.out.println("읽은 문자 개수 = " + num);
//        System.out.println(new String(text, 0, num));
//        in.close();
//    }
	
	//2
//	private static void readFile(String fileName, String encoding) throws IOException {
//        InputStream fileInputStream = new FileInputStream(fileName);
//        InputStreamReader in;
//        
//        if (encoding != null) {
//            in = new InputStreamReader(fileInputStream, encoding);
//        } else {
//            in = new InputStreamReader(fileInputStream);
//        }
//
//        char[] text = new char[1000];
//        int num = in.read(text);
//        in.close();
//        
//        // 출력
//        System.out.println("읽은 문자 개수 = " + num);
//        System.out.println(new String(text, 0, num));
//    }
	
	//3
	private static void readFile(String fileName, String encoding) throws IOException {
        try (InputStream fileInputStream = new FileInputStream(fileName);
             InputStreamReader in = encoding != null ? new InputStreamReader(fileInputStream, encoding) : new InputStreamReader(fileInputStream)) {

            // BOM 처리 (UTF-8 BOM 확인 및 제거)
            if (encoding != null && encoding.equals("UTF-8")) {
                fileInputStream.mark(3); // BOM은 최대 3바이트이므로 마크
                byte[] bom = new byte[3];
                fileInputStream.read(bom);

                // UTF-8 BOM 체크
                if (bom[0] == (byte) 0xEF && bom[1] == (byte) 0xBB && bom[2] == (byte) 0xBF) {
                    // BOM이 있을 경우, 다시 읽기 시작
                    fileInputStream.reset();
                } else {
                    // BOM이 없을 경우, 읽은 바이트를 다시 읽기 위해 재설정
                    fileInputStream.reset();
                }
            }

            char[] text = new char[1000];
            int num = in.read(text);
            System.out.println("읽은 문자 개수 = " + num);
            System.out.println(new String(text, 0, num));
        }
    }
}
