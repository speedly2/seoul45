package chapter15.iostream;

import java.io.File;

public class C135_file_Info {

	public static void main(String[] args) {
		File f = new File("C:\\eclipseWS\\fileTest.txt");
		if (f.exists()) {
			if (f.isFile()) {
				System.out.println("파일입니다.");
				System.out.println("파일경로 : " + f.getParent());
				System.out.println("파일이름 : " + f.getName());
				System.out.println("파일크기 : " + f.length());
				System.out.println("숨김 파일 : " + f.isHidden());
				System.out.println("절대 경로 : " + f.isAbsolute());
			} else if (f.isDirectory()) {
				System.out.println("디렉터리입니다.");
			}
		} else {
			System.out.println("파일이 없습니다.");
		}
	}

}
