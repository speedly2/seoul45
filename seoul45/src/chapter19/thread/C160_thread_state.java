package chapter19.thread;

public class C160_thread_state {

	public static void main(String[] args) {
		PrintThread3 worker = new PrintThread3();
		worker.start();
		
		for (int num = 0;num < 30;num++) {
			System.out.print("O");
			try { Thread.sleep(200); } catch (InterruptedException e) { ; }
			if (num == 5) {
				System.out.println("sus");
				worker.suspend();
			}
			if (num == 25) {
				System.out.println("res");
				worker.resume();
			}
		}
	}

}

class PrintThread3 extends Thread {
	public void run() {
		for (int num = 0;num < 30;num++) {
			System.out.print("X");
			try { Thread.sleep(100); } catch (InterruptedException e) { ; }
		}
	}
}