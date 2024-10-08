package chapter15.iostream;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test_encoding {

	public static void main(String[] args) {
		try {
            // 파일 인코딩을 명시적으로 지정하여 읽어오기
            readFile("애국가.txt", "System"); // 시스템 기본 인코딩
            readFile("애국가-Unicode.txt", "UTF-16");
            readFile("애국가-Utf8.txt", "UTF-8");
            readFile("애국가-Utf8nb.txt", "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

	private static void readFile(String fileName, String encoding) throws IOException {
        InputStream fileInputStream = new FileInputStream(fileName);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        InputStreamReader reader;
        
        if ("UTF-8".equals(encoding)) {
            // BOM 처리
            bufferedInputStream.mark(3); // BOM은 최대 3바이트이므로 마크
            byte[] bom = new byte[3];
            bufferedInputStream.read(bom);

            // UTF-8 BOM 체크
            if (bom[0] == (byte) 0xEF && bom[1] == (byte) 0xBB && bom[2] == (byte) 0xBF) {
                // BOM이 있을 경우, 다시 읽기 시작
                bufferedInputStream.reset();
            } else {
                // BOM이 없을 경우, 읽은 바이트를 다시 읽기 위해 재설정
                bufferedInputStream.reset();
            }
            
            reader = new InputStreamReader(bufferedInputStream, encoding);
        } else {
            reader = new InputStreamReader(bufferedInputStream, encoding);
        }

        try (BufferedReader bufferedReader = new BufferedReader(reader)) {
            StringBuilder text = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                text.append(line).append(System.lineSeparator());
            }
            System.out.println("읽은 내용:");
            System.out.println(text.toString());
        }
    }
}
