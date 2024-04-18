package chapter19.thread;

public class C171_thread_interrupt1 {

	public static void main(String[] args) {
		CalcThread worker = new CalcThread();
		worker.start();
	}

}

class CalcThread extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(".");
			try { Thread.sleep(1000); } catch (InterruptedException e) { ; }
		}
		System.out.println("\n계산 완료");
	}
}