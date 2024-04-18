package chapter19.thread;

public class C161_thread_priority {

	public static void main(String[] args) {
		PrintThread11 worker1 = new PrintThread11();
		PrintThread22 worker2 = new PrintThread22();
		worker1.start();
		worker2.setPriority(Thread.MAX_PRIORITY);
		worker2.start();
	}

}

class PrintThread11 extends Thread {
	public void run() {
		double sum = 0;
		for (int i = 0;i < 10000000;i++) {
			sum += Math.cos(i);
		}
		System.out.println("cos = " + sum);
	}
}

class PrintThread22 extends Thread {
	public void run() {
		double sum = 0;
		for (int i = 0;i < 10000000;i++) {
			sum += Math.sin(i);
		}
		System.out.println("sin = " + sum);
	}
}