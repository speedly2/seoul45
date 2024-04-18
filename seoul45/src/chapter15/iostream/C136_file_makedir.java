package chapter15.iostream;

import java.io.File;
import java.io.FileWriter;

public class C136_file_makedir {

	public static void main(String[] args) throws Exception {
		File folder = new File("C:\\eclipseWS\\TestFolder");
		if (folder.mkdir()) {
			File file = new File("c:\\eclipseWS\\MyFile.txt");
			if (file.createNewFile()) {
				FileWriter out = new FileWriter(file);
				out.write("테스트 파일");
				out.close();
			}
		}
	}

}
