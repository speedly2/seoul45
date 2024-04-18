package chapter19.thread;

public class C158_thread {

	public static void main(String[] args) {
		//멀티스레드 예제
		PrintThread worker = new PrintThread();
		worker.start();
		
		//0.2초마다 O출력
		for (int num = 0;num < 30;num++) {
			System.out.print("O");
			try { Thread.sleep(200); } catch (InterruptedException e) { ; }
		}
	}

}

//0.1초마다 X출력
class PrintThread extends Thread {
	public void run() {
		for (int num = 0;num < 30;num++) {
			System.out.print("X");
			try { Thread.sleep(100); } catch (InterruptedException e) { ; }
		}
	}
}