package chapter04.loop;

public class C033_while1 {

	public static void main(String[] args) {
		// while
		int filesize = 720;
		int download = 0;
		
		while (download < filesize) {
			download += 120;
			System.out.println(download + "K 다운로드중....");
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
		System.out.println("다운로드 완료");
	}

}
