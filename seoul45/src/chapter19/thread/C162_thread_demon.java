package chapter19.thread;

public class C162_thread_demon {

	public static void main(String[] args) {
		// 보조 스레드
		PrintThread5 worker = new PrintThread5();
		worker.setDaemon(true);
		worker.start();
		
		for (int i = 0;i < 20;i++) {
			System.out.print(i);
			try { Thread.sleep(500); } catch (InterruptedException e) { ; }
		}
	}

}

class PrintThread5 extends Thread {
	public void run() {
		while(true) {
			System.out.print("save");
			try { Thread.sleep(2000); } catch (InterruptedException e) { ; }
		}
	}
}